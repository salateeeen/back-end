import java.lang.*;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        builder.append("Java");
        builder.append(" ");
        builder.append("Programming");

        System.out.println(builder);

        builder.insert(5, "Backend ");
        System.out.println(builder);

        builder.reverse();
        System.out.println(builder);
    }
}
