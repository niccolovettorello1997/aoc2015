import java.util.ArrayList;
import java.util.List;

public class Toggles {
    private int activeLights;

    private final List<Light> grid;

    public Toggles() {
        activeLights = 0;
        grid = new ArrayList<>();

        for (int i = 0; i < 1000000; i++) {
            grid.add(new Light());
        }
    }

    public void execute(String instruction) {
        LightParser lightParser = new LightParser(instruction);

        switch (lightParser.getInstructionType()) {
            case 1:
                turnOn(lightParser.getTopLeft(), lightParser.getBottomRight());
                break;
            case 2:
                toggle(lightParser.getTopLeft(), lightParser.getBottomRight());
                break;
            case 3:
                turnOff(lightParser.getTopLeft(), lightParser.getBottomRight());
                break;
        }
    }

    public int getActiveLights() {
        return activeLights;
    }

    private void turnOn(List<Integer> topLeft, List<Integer> bottomRight) {
        List<Integer> actualCoordinates = convertCoordinates(topLeft, bottomRight);

        actualCoordinates.forEach(coordinate -> {
            Light light = grid.get(coordinate);

            if (!light.getState()) {
                light.turnOn();

                activeLights++;
            }
        });
    }

    private void toggle(List<Integer> topLeft, List<Integer> bottomRight) {
        List<Integer> actualCoordinates = convertCoordinates(topLeft, bottomRight);

        actualCoordinates.forEach(coordinate -> {
            Light light = grid.get(coordinate);

            if (light.getState()) {
                activeLights--;
            } else {
                activeLights++;
            }

            light.toggle();
        });
    }

    private void turnOff(List<Integer> topLeft, List<Integer> bottomRight) {
        List<Integer> actualCoordinates = convertCoordinates(topLeft, bottomRight);

        actualCoordinates.forEach(coordinate -> {
            Light light = grid.get(coordinate);

            if (light.getState()) {
                light.turnOff();

                activeLights--;
            }
        });
    }

    private List<Integer> convertCoordinates(List<Integer> topLeft, List<Integer> bottomRight) {
        List<Integer> result = new ArrayList<>();

        for (int i = topLeft.get(0); i <= bottomRight.get(0); i++) {
            for (int j = topLeft.get(1); j <= bottomRight.get(1); j++) {
                result.add(1000 * i + j);
            }
        }

        return result;
    }
}
