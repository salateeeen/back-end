public class Connection {
    public static void main(java.lang.String[] args) throws Exception {
        java.sql.Connection connection =
                java.sql.DriverManager.getConnection(
                        "jdbc:postgresql://localhost:5432/app",
                        "postgres",
                        "password"
                );

        System.out.println("Connected!");

        connection.close();
    }
}
