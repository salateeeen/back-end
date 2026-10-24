public class TreeMap {
    public static void main(java.lang.String[] args) {
        java.util.TreeMap<java.lang.String, Integer> scores =
                new java.util.TreeMap<>();

        scores.put("Java", 95);
        scores.put("Docker", 90);
        scores.put("SQL", 85);

        System.out.println(scores);
    }
}
