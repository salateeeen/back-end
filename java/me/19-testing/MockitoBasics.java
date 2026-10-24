import org.junit.jupiter.api.Test;

interface UserRepository {
    java.lang.String findNameById(int id);
}

public class MockitoBasics {

    @Test
    void mockExample() {
        UserRepository repository =
                org.mockito.Mockito.mock(UserRepository.class);

        org.mockito.Mockito.when(repository.findNameById(1))
                .thenReturn("Sultan");

        java.lang.String name =
                repository.findNameById(1);

        org.junit.jupiter.api.Assertions.assertEquals(
                "Sultan",
                name
        );
    }
}
