package flames.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import flames.model.Pairs;

@Component
public class FlamesDBConfiguration {

	private String url = "jdbc:mysql://flames-dbserver:3306/flames";
	private String user = "root";
	private String password = "root";
	private String createTable = "create table if not exists flames.pairs " + "(id int NOT NULL AUTO_INCREMENT, "
			+ "username varchar(255), " + "crushname varchar(255)," + "flames varchar(255), PRIMARY KEY (id))";

	private String insertData = "insert into flames.pairs (username, crushname, flames) values (?,?,?)";

	public Connection createConnection() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection(url, user, password);

		return connection;

	}

	public void createTable() throws SQLException, ClassNotFoundException {

		Connection connection = this.createConnection();

		PreparedStatement stmt = connection.prepareStatement(createTable);

		stmt.execute();

	}

	public void addPairsToDB(String userName, String crushName, String flames)
			throws ClassNotFoundException, SQLException {

		Connection connection = this.createConnection();

		createTable();

		PreparedStatement stmt = connection.prepareStatement(insertData);

		stmt.setString(1, userName);
		stmt.setString(2, crushName);
		stmt.setString(3, flames);

		stmt.executeUpdate();

		closeConnection(connection);

	}

	public List<Pairs> getPairsFromDB() throws ClassNotFoundException, SQLException {

		Connection connection = this.createConnection();

		createTable();

		PreparedStatement stmt = connection.prepareStatement("select * from pairs");

		List<Pairs> list = new ArrayList<Pairs>();

		ResultSet data = stmt.executeQuery();

		while (data.next()) {
			list.add(new Pairs(data.getInt(1), data.getString(2), data.getString(3), data.getString(4)));
		}

		return list;
	}
	
	public Pairs getSinglePairFromDB(String user, String crush) throws ClassNotFoundException, SQLException {
		
		Connection connection = this.createConnection();
		
		PreparedStatement stmt = connection.prepareStatement("select * from pairs where username in (?)"
				+ " and crushname in (?)");
		
		stmt.setString(1, user);
		stmt.setString(2, crush);
		
		Pairs pair = null;
		
		ResultSet data = stmt.executeQuery();
		
		while(data.next()) {
			pair = new Pairs(data.getInt(1), data.getString(2), data.getString(3), data.getString(4));
		}
		
		return pair;
		
	}

	public void closeConnection(Connection connection) throws SQLException {
		
		connection.setAutoCommit(false);
		
		connection.commit();
		connection.close();
	}

}
