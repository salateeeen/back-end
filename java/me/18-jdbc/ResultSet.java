public class ResultSet {
    public static void main(java.lang.String[] args) throws Exception {
        java.sql.Connection connection =
                java.sql.DriverManager.getConnection(
                        "jdbc:postgresql://localhost:5432/app",
                        "postgres",
                        "password"
                );

        java.sql.Statement statement =
                connection.createStatement();

        java.sql.ResultSet result =
                statement.executeQuery("SELECT id, name FROM users");

        while (result.next()) {
            System.out.println(
                    result.getInt("id") + " " +
                    result.getString("name")
            );
        }

        connection.close();
    }
}
