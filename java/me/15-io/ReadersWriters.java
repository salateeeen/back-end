import java.io.StringReader;
import java.io.StringWriter;

public class ReadersWriters {
    public static void main(java.lang.String[] args) throws Exception {
        StringReader reader = new StringReader("Hello");

        int character;

        while ((character = reader.read()) != -1) {
            System.out.print((char) character);
        }

        StringWriter writer = new StringWriter();
        writer.write("Hello Writer");

        System.out.println();
        System.out.println(writer);
    }
}
