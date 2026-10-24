import org.junit.jupiter.api.Test;

public class JUnitBasics {

    @Test
    void additionWorks() {
        int result = 2 + 3;

        org.junit.jupiter.api.Assertions.assertEquals(5, result);
    }
}
