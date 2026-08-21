import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloJavaTest {
    @Test
    public void testGreeting() {
        assertEquals("Hello from Java!", HelloJava.getGreeting());
    }
}
