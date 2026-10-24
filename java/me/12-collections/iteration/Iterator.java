public class Iterator {
    public static void main(java.lang.String[] args) {
        java.util.List<java.lang.String> names =
                new java.util.ArrayList<>();

        names.add("Ali");
        names.add("Sultan");

        java.util.Iterator<java.lang.String> iterator =
                names.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
