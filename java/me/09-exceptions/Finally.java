public class Finally {
    public static void main(java.lang.String[] args) {
        try {
            System.out.println("Try");
            int i  = 10 /0 ;
        } catch (Exception e) {
            System.out.println("Catch");
        }
        // finally always executed
        finally {
            System.out.println("Finally always runs");
        }
    }
}
