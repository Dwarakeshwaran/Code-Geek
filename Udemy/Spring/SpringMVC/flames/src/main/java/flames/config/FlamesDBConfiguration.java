package flames.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Component;

@Component
public class FlamesDBConfiguration {

	

	private String url = "jdbc:h2:tcp://localhost/~/test";
	private String user = "sa";
	private String password = "";
	private String createTable = "create table if not exists pairs (username varchar(255), crushname varchar(255))";
	private String insertData = "insert into pairs (username, crushname) values (?,?)";

	public Connection createConnection() throws ClassNotFoundException, SQLException {

		Class.forName("org.h2.Driver");

		Connection connection = DriverManager.getConnection(url, user, password);

		return connection;

	}

	public void createTable() throws SQLException, ClassNotFoundException {

		Connection connection = this.createConnection();

		PreparedStatement stmt = connection.prepareStatement(createTable);

		stmt.execute();

	}

	public void addPairsToDB(String userName, String crushName) throws ClassNotFoundException, SQLException {

		Connection connection = this.createConnection();

		createTable();

		PreparedStatement stmt = connection.prepareStatement(insertData);

		stmt.setString(1, userName);
		stmt.setString(2, crushName);

		stmt.executeUpdate();

		closeConnection(connection);

	}


	public void closeConnection(Connection connection) throws SQLException {
		connection.commit();
		connection.close();
	}

}
