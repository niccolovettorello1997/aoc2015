import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TogglesTest {
    @Test
    @DisplayName("Toggles computes the correct number of lights that are on")
    void computeNumberOfLights() {
        Toggles toggles = new Toggles();

        toggles.execute("turn on 0,0 to 999,999");
        toggles.execute("toggle 0,0 to 999,0");
        toggles.execute("turn off 499,499 to 500,500");

        assertEquals(998996, toggles.getActiveLights());
    }
}
