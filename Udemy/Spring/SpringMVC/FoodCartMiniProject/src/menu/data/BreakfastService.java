package menu.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Component;

import menu.model.Breakfast;

@Component
public class BreakfastService {

	public List<Breakfast> getBreakfastItems() {

		List<Breakfast> items = new ArrayList<Breakfast>();

		items.add(new Breakfast("Idly", 10));
		items.add(new Breakfast("Dosai", 15));
		items.add(new Breakfast("Poori", 20));
		items.add(new Breakfast("Pongal", 30));
		items.add(new Breakfast("Vadai", 5));

		return items;
	}

	// DATABASE CREATION USING JDBC

	public Connection EstablishConnection() throws ClassNotFoundException, SQLException {

		String url = "jdbc:h2:tcp://localhost/~/test";
		String user = "sa";
		String password = "";

		Class.forName("org.h2.Driver");

		return DriverManager.getConnection(url, user, password);

	}

	public void insertFoodItemToDB(String foodName, String numberOfItems) throws ClassNotFoundException, SQLException {

		Connection connection = EstablishConnection();

		String createTable = "create table if not exists food (foodName varchar(255), numberOfItems integer )";
		String insertData = "insert into food (foodName, numberOfItems) values (?,?)";

		PreparedStatement stmt = connection.prepareStatement(createTable);

		stmt.execute();

		stmt = connection.prepareStatement(insertData);

		stmt.setString(1, foodName);
		stmt.setInt(2, Integer.parseInt(numberOfItems));

		stmt.executeUpdate();

		closeConnection(connection);

	}

	public HashMap<String, Integer> getDataFromDB() throws ClassNotFoundException, SQLException {

		Connection connection = EstablishConnection();

		String sql = "select * from food;";

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		Statement statement = connection.createStatement();

		ResultSet result = statement.executeQuery(sql);

		while (result.next()) {

			String key = result.getString("foodName");
			Integer value = result.getInt("numberOfItems");

			map.put(key, value);

		}
		closeConnection(connection);

		return map;

	}

	public void closeConnection(Connection connection) throws SQLException {

		connection.commit();

		connection.close();

	}

	public void deleteTable() throws SQLException, ClassNotFoundException {

		Connection connection = EstablishConnection();

		Statement statement = connection.createStatement();

		String sql = "drop table food";

		statement.execute(sql);

		closeConnection(connection);

	}

}
