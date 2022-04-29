package flames.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import flames.model.User;

@Component
public class LoginDBConfiguration {
	
	private String url = "jdbc:mysql://flames-dbserver:3306/flames";
	private String user = "root";
	private String password = "root";
	
	private String createTable = "create table if not exists flames.users (id int NOT NULL AUTO_INCREMENT, username varchar(255), password varchar(255), email varchar(255) );";
	private String insertUser = "insert into flames.users (username, password, email) values(?,?,?)";
	private String getUsers = "select * from flames.users";
	
	public Connection createConnection() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection(url, user, password);
		
		return connection;
	}
	
	
	public void registerUser(String user, String pass, String email) throws ClassNotFoundException, SQLException {
		
		Connection connection = this.createConnection();
		
		PreparedStatement stmt = connection.prepareStatement(createTable);		
		
		stmt.execute();
		
		stmt = connection.prepareStatement(insertUser);
		
		stmt.setString(1, user);
		stmt.setString(2, pass);
		stmt.setString(3, email);
		
		stmt.execute();
	}
	
	public List<User> getUsers() throws ClassNotFoundException, SQLException {
		
		List<User> userList = new ArrayList<User>();
		
		Connection connection = this.createConnection();
		
		PreparedStatement stmt = connection.prepareStatement(getUsers);
		
		ResultSet data = stmt.executeQuery();
		
		while(data.next()) {
			//System.out.println(data.getString(1)+" - "+ data.getString(2)+" - "+ data.getString(3));
			
			userList.add(new User(data.getString(2), data.getString(3), data.getString(4)));
		}
		
		return userList;
		
	}
	

}
