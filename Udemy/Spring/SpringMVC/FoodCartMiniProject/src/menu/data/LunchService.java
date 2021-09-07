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

import menu.model.Lunch;

@Component
public class LunchService {

	public List<Lunch> getLunchItems() {

		List<Lunch> items = new ArrayList<Lunch>();

		items.add(new Lunch("Chicken Biriyani", 100));
		items.add(new Lunch("White Rice", 50));
		items.add(new Lunch("Variety Rice", 30));
		items.add(new Lunch("Pepper Chicken", 70));
		items.add(new Lunch("Empty Biriyani", 40));

		return items;
	}

	public Connection createConnection() throws ClassNotFoundException, SQLException {

		String url = "jdbc:h2:tcp://localhost/~/test";
		String user = "sa";
		String password = "";

		Class.forName("org.h2.Driver");

		return DriverManager.getConnection(url, user, password);

	}

	public void addLunchToDB(String food, String numberOfItems) throws ClassNotFoundException, SQLException {

		Connection connection = createConnection();

		String createTable = "create table if not exists lunch(foodName varchar(255), numberOfItems integer)";
		String insertValues = "insert into lunch(foodName, numberOfItems) values(?,?)";

		PreparedStatement stmt = connection.prepareStatement(createTable);

		stmt.execute();

		stmt = connection.prepareStatement(insertValues);

		stmt.setString(1, food);
		stmt.setInt(2, Integer.parseInt(numberOfItems));

		stmt.executeUpdate();

		closeConnection(connection);

	}

	public HashMap<String, Integer> getLunchData() throws ClassNotFoundException, SQLException {

		Connection connection = createConnection();

		String getData = "select * from lunch";

		PreparedStatement stmt = connection.prepareStatement(getData);

		ResultSet data = stmt.executeQuery();

		HashMap<String, Integer> lunchItems = new HashMap<String, Integer>();

		while (data.next()) {
			lunchItems.put(data.getString("foodName"), data.getInt("numberOfItems"));
		}

		return lunchItems;

	}

	public void closeConnection(Connection connection) throws SQLException {

		connection.commit();
		connection.close();

	}

	public void deleteTable() throws ClassNotFoundException, SQLException {
		Connection connection = createConnection();

		Statement statement = connection.createStatement();

		String sql = "drop table lunch";

		statement.execute(sql);

		closeConnection(connection);

	}

}
