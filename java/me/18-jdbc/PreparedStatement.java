public class PreparedStatement {
    public static void main(java.lang.String[] args) throws Exception {
        java.sql.Connection connection =
                java.sql.DriverManager.getConnection(
                        "jdbc:postgresql://localhost:5432/app",
                        "postgres",
                        "password"
                );

        java.sql.PreparedStatement statement =
                connection.prepareStatement(
                        "SELECT * FROM users WHERE id = ?"
                );

        statement.setInt(1, 10);

        java.sql.ResultSet result = statement.executeQuery();

        while (result.next()) {
            System.out.println(result.getInt("id"));
        }

        connection.close();
    }
}
