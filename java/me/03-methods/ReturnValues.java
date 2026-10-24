public class ReturnValues {
     int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
         ReturnValues ret = new ReturnValues();
        int result = ret.add(10, 20);

        System.out.println(result);
    }
}
