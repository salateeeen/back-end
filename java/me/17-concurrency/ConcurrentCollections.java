public class ConcurrentCollections {
    public static void main(java.lang.String[] args) {
        java.util.concurrent.ConcurrentHashMap<java.lang.String, Integer>
                map = new java.util.concurrent.ConcurrentHashMap<>();

        map.put("Java", 95);
        map.put("Docker", 90);

        System.out.println(map);
    }
}
