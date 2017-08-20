package extra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DBDemo
{

	private final String userName = "root";
	private final String password = "1021";
	private final String serverName = "localhost";
	private final int portNumber = 3306;
	private final String dbName = "test";
	private final String tableName = "JDBC_TEST";

	public Connection getConnection() throws SQLException
	{
		Connection conn = null;
		Properties connectionProps = new Properties();
		connectionProps.put("user", this.userName);
		connectionProps.put("password", this.password);

		conn = DriverManager.getConnection(
				"jdbc:mysql://" + this.serverName + ":" + this.portNumber + "/" + this.dbName, connectionProps);

		return conn;
	}

	public boolean executeUpdate(Connection conn, String command) throws SQLException
	{
		Statement stmt = null;
		try
		{
			stmt = conn.createStatement();
			stmt.executeUpdate(command); // This will throw a SQLException if it fails
			return true;
		}
		finally
		{

			// This will run whether we throw an exception or not
			if (stmt != null)
			{
				stmt.close();
			}
		}
	}

	public void run()
	{

		// Connect to MySQL
		Connection conn = null;
		try
		{
			conn = this.getConnection();
			System.out.println("Connected to database");
		}
		catch (SQLException e)
		{
			System.out.println("ERROR: Could not connect to the database");
			e.printStackTrace();
			return;
		}

		// Create a table
		try
		{
			String createString = "CREATE TABLE " + this.tableName + " ( " + "ID INTEGER NOT NULL, "
					+ "NAME varchar(40) NOT NULL, " + "STREET varchar(40) NOT NULL, " + "CITY varchar(20) NOT NULL, "
					+ "STATE char(2) NOT NULL, " + "ZIP char(5), " + "PRIMARY KEY (ID))";
			this.executeUpdate(conn, createString);
			System.out.println("Created a table");
		}
		catch (SQLException e)
		{
			System.out.println("ERROR: Could not create the table");
			e.printStackTrace();
			return;
		}

		// Drop the table
		try
		{
			String dropString = "DROP TABLE " + this.tableName;
			this.executeUpdate(conn, dropString);
			System.out.println("Dropped the table");
		}
		catch (SQLException e)
		{
			System.out.println("ERROR: Could not drop the table");
			e.printStackTrace();
			return;
		}
	}

	public static void main(String[] args)
	{
		DBDemo app = new DBDemo();
		app.run();
	}
}