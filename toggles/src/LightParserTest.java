import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LightParserTest {
    @Test
    @DisplayName("Light parser parses correctly a turn on instruction")
    void parseTurnOn()
    {
        List<Integer> topLeft = new ArrayList<>();
        List<Integer> bottomRight = new ArrayList<>();

        topLeft.add(0);
        topLeft.add(0);

        bottomRight.add(999);
        bottomRight.add(999);

        LightParser lightParser = new LightParser("turn on 0,0 to 999,999");

        assertEquals(1, lightParser.getInstructionType());
        assertEquals(topLeft, lightParser.getTopLeft());
        assertEquals(bottomRight, lightParser.getBottomRight());
    }

    @Test
    @DisplayName("Light parser parses correctly a toggle instruction")
    void parseToggle()
    {
        List<Integer> topLeft = new ArrayList<>();
        List<Integer> bottomRight = new ArrayList<>();

        topLeft.add(0);
        topLeft.add(0);

        bottomRight.add(999);
        bottomRight.add(0);

        LightParser lightParser = new LightParser("toggle 0,0 to 999,0");

        assertEquals(2, lightParser.getInstructionType());
        assertEquals(topLeft, lightParser.getTopLeft());
        assertEquals(bottomRight, lightParser.getBottomRight());
    }

    @Test
    @DisplayName("Light parser parses correctly a turn off instruction")
    void parseTurnOff()
    {
        List<Integer> topLeft = new ArrayList<>();
        List<Integer> bottomRight = new ArrayList<>();

        topLeft.add(499);
        topLeft.add(499);

        bottomRight.add(500);
        bottomRight.add(500);

        LightParser lightParser = new LightParser("turn off 499,499 to 500,500");

        assertEquals(3, lightParser.getInstructionType());
        assertEquals(topLeft, lightParser.getTopLeft());
        assertEquals(bottomRight, lightParser.getBottomRight());
    }
}
