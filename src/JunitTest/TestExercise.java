package JunitTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestExercise {

    @Test
    public void firstTestCase() {

        String text = "Some text";
        int actual = text.length();
        int expected = 6;

        assertEquals(expected, actual);
    }
}
