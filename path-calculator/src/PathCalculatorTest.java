import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PathCalculatorTest {
    @Test
    @DisplayName("Path Calculator should calculate the correct number of houses for path1")
    void testCalculatePath1() {
        PathCalculator pathCalculator = new PathCalculator();

        String path1 = ">";

        assertEquals(2, pathCalculator.calculatePath(path1));
    }

    @Test
    @DisplayName("Path Calculator should calculate the correct number of houses for path2")
    void testCalculatePath2() {
        PathCalculator pathCalculator = new PathCalculator();

        String path2 = "^>#<";

        assertEquals(4, pathCalculator.calculatePath(path2));
    }

    @Test
    @DisplayName("Path Calculator should calculate the correct number of houses for path3")
    void testCalculatePath3() {
        PathCalculator pathCalculator = new PathCalculator();

        String path3 = "<><><>";

        assertEquals(2, pathCalculator.calculatePath(path3));
    }
}
