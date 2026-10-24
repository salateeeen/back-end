public class LinkedHashMap {
    public static void main(java.lang.String[] args) {
        java.util.LinkedHashMap<java.lang.String, Integer> scores =
                new java.util.LinkedHashMap<>();

        scores.put("Java", 95);
        scores.put("Docker", 90);

        System.out.println(scores);
    }
}
