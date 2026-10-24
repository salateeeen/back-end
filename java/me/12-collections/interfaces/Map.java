public class Map {
    public static void main(java.lang.String[] args) {
        java.util.Map<java.lang.String, Integer> ages =
                new java.util.HashMap<>();

        ages.put("Ali", 20);
        ages.put("Sultan", 21);

        System.out.println(ages.get("Sultan"));
    }
}
