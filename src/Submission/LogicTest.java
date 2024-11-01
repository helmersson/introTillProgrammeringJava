package Submission;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LogicTest {

    //  Test för antal bokstäver
    @Test
    public void testCharCount() {
        Logic logicTest = new Logic();

        logicTest.addLine("Hej på dig");
        logicTest.addLine("Detta är en mening");

        int expected = 28;
        int actual = logicTest.getCharCount();

        assertEquals(expected, actual);
    }

    //  Test för antal rader
    @Test
    public void testLineCount() {
        Logic logicTest = new Logic();

        logicTest.addLine("Hej på dig");
        logicTest.addLine("Detta är en mening");

        int expected = 2;
        int actual = logicTest.getLineCount();

        assertEquals(expected, actual);
    }

    //  Test för antal ord
    @Test
    public void testWordCount() {
        Logic logicTest = new Logic();

        logicTest.addLine("Hej på dig");
        logicTest.addLine("Detta är en mening");

        int expected = 7;
        int actual = logicTest.getWordCount();

        assertEquals(expected, actual);
    }

    //  Test för Längsta ord
    @Test
    public void testLongestWord() {
        Logic logicTest = new Logic();

        logicTest.addLine("Hej på dig");
        logicTest.addLine("hejhopp");

        String expected = "hejhopp";
        String actual = logicTest.getLongestWord();

        assertEquals(expected, actual);
    }

    //  Testar så att stop loopen funkar vid TRUE
    @Test
    public void testStopTrue() {
        Logic logicTest = new Logic();
        String[] differentStops = {"stop", "STOP", "sTOP", "StOp"};

        for (String different : differentStops) {
            assertTrue(logicTest.addLine(different));
        }
    }

    //  Testar så att stop loopen funkar vid FALSE
    @Test
    public void testStopFalse() {
        Logic logicTest = new Logic();
        String[] differentStops = {"hej", "då", "ettmycketlångtord", "jaggillarinterepetetivkod"};

        for (String different : differentStops) {
            assertFalse(logicTest.addLine(different));
        }
    }
}
