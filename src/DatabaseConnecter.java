import java.sql.*;

public class DatabaseConnecter {
    // 1. Database Credentials
    private static final String URL = "jdbc:mysql://localhost:3306/my_game_db";
    private static final String USER = "root";
    private static final String PASSWORD = "secret_password";

    public void getPlayerName(int playerId) {
        // 2. The SQL Query (Use ? as a placeholder for variables)
        String query = "SELECT nickname FROM players WHERE id = ?";

        // 3. Try-with-Resources (Auto-closes the connection so you don't crash the server)
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement statement = connection.prepareStatement(query)) {

            // 4. Fill in the placeholders (?)
            statement.setInt(1, playerId); // Replace the first '?' with the ID

            // 5. Run the query and get results
            ResultSet resultSet = statement.executeQuery();

            // 6. Read the results (Iterator)
            if (resultSet.next()) { // Move cursor to the first row
                String name = resultSet.getString("nickname");
                System.out.println("Found Player: " + name);
            } else {
                System.out.println("Player not found.");
            }

        } catch (SQLException e) {
            System.out.println("Database Error: " + e.getMessage());
        }
    }

    public void addPlayer(int id, String name, int level){
        String query = "INSERT INTO players (id,name,level) VALUES (?,?,?)";

        try(Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement statment = connection.prepareStatement(query)) {


                statment.setInt(1,id);
                statment.setString(2,name);
                statment.setInt(3,level);

                int result = statment.executeUpdate();

                if(result != 0){
                    IO.println("number of rows Updated: " + result);
                }else {
                    IO.println("no rows have been updated");
                }

        } catch (SQLException e) {
            IO.println("Database Error: " + e.getMessage());
        }

    }
}
