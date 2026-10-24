public class Transactions {
    public static void main(java.lang.String[] args) throws Exception {
        java.sql.Connection connection =
                java.sql.DriverManager.getConnection(
                        "jdbc:postgresql://localhost:5432/app",
                        "postgres",
                        "password"
                );

        try {
            connection.setAutoCommit(false);

            // SQL operations...

            connection.commit();
        } catch (Exception e) {
            connection.rollback();
            throw e;
        } finally {
            connection.close();
        }
    }
}
