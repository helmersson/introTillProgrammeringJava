package Submission;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LogicTest {
    @Test
    void testLineCount() {
        Logic logicTest = new Logic();
        logicTest.addLine("Hej på dig");
        logicTest.addLine("Detta är en mening");

        assertEquals(2, logicTest.getLineCount(), "antal rader ska vara två");
        assertEquals(38, logicTest.getCharCount(), "antal tecken ska vara 30");
        assertEquals(7, logicTest.getWordCount(), "antal ord ska vara 7");
    }

}
