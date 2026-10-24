import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouping {
    public static void main(String[] args) {
        List<String> names =
                List.of("Ali", "Omar", "Sultan", "Ahmed");

        Map<Integer, List<String>> grouped =
                names.stream()
                        .collect(Collectors.groupingBy(String::length));

        System.out.println(grouped);
    }
}
