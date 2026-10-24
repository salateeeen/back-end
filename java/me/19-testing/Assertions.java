import org.junit.jupiter.api.Test;

public class Assertions {

    @Test
    void assertionsExample() {
        org.junit.jupiter.api.Assertions.assertEquals(
                10,
                5 + 5
        );

        org.junit.jupiter.api.Assertions.assertTrue(
                10 > 5
        );

        org.junit.jupiter.api.Assertions.assertFalse(
                10 < 5
        );
    }
}
