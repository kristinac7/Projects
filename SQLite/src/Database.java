import java.sql.*;
import java.util.ArrayList;

public class Database {

    private static Connection c = null; // The connection

    private static Connection getConnection() throws SQLException { // Get the connection to the database
        if (c == null) { // If the connection is null
            c = DriverManager.getConnection("jdbc:sqlite:test.db"); // Create a new connection to the database (test.db)

            Statement statement = c.createStatement(); // Create a statement
            String sql = "CREATE TABLE IF NOT EXISTS people" + // Create a table if it doesn't exist
                    "(SSN INT PRIMARY KEY," +
                    " name           TEXT    NOT NULL, " +
                    " gender         TEXT     NOT NULL)";
            statement.executeUpdate(sql); // Execute the statement
            statement.close(); // Close the statement
        }
        return c; // Return the connection
    }

    public static void insertPerson(Person p) {
        try {
            Statement statement = getConnection().createStatement(); // Create a statement
            String sql = String.format("INSERT INTO people (SSN,name,gender) VALUES (%d, '%s', '%s')", p.getSsn(), p.getName(), p.getGender()); // format the sql statement
            statement.executeUpdate(sql); // Execute the statement
            statement.close(); // Close the statement
        } catch (SQLException e) { // Catch any errors
            throw new RuntimeException(e);
        }
    }

    public static ArrayList<Person> findPeople() {
        ArrayList<Person> people = new ArrayList<>();
        try {
            Statement statement = getConnection().createStatement(); // Create a statement
            statement = c.createStatement(); // Create a statement

            ResultSet rs = statement.executeQuery("SELECT * FROM people;"); // Execute the statement

            while (rs.next()) { // Loop over the result set
                int ssn = rs.getInt("SSN"); // Get the SSN
                String name = rs.getString("name"); // Get the name
                String gender = rs.getString("gender"); // Get the gender
                Person person = new Person(ssn, name, gender); // Create a new person
                people.add(person); // Add the person to the list
            }
            rs.close(); // Close the result set
            statement.close(); // Close the statement

        } catch (SQLException e) { // Catch any errors
            throw new RuntimeException(e); // Throw a runtime exception with the error message as the parameter (e)
        }
        return people; // Return the list of people
    }

    public static void deletePerson(int SSN) {
        try {
            Statement statement = getConnection().createStatement(); // Create a statement
            String sql = "DELETE from people where SSN= " + SSN; // Delete from people where SSN = SSN
            statement.executeUpdate(sql); // Execute the statement

        } catch (SQLException e) { // Catch any errors
            throw new RuntimeException(e);
        }
    }

    public static void editPerson(int SSN, String name) {
        try {
            Statement statement = getConnection().createStatement(); // Create a statement
            String sql = "UPDATE people set name = '" + name + "' where SSN= " + SSN; // Update the name where SSN = SSN
            statement.executeUpdate(sql); // Execute the statement
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
