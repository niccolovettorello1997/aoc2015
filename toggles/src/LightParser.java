import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LightParser {
    private final int instructionType;

    private final List<Integer> topLeft;

    private final List<Integer> bottomRight;

    public LightParser(String instruction) {
        instructionType = setInstructionType(instruction);
        topLeft = setCoordinates(instruction, 0);
        bottomRight = setCoordinates(instruction, 1);
    }

    public int getInstructionType() {
        return instructionType;
    }

    public List<Integer> getTopLeft() {
        return topLeft;
    }

    public List<Integer> getBottomRight() {
        return bottomRight;
    }

    private int setInstructionType(String instruction) {
        if (instruction.startsWith("turn on")) {
            return 1;
        } else if (instruction.startsWith("toggle")) {
            return 2;
        } else {
            return 3;
        }
    }

    private List<Integer> setCoordinates(String instruction, int position) {
        List<Integer> coordinate = new ArrayList<>();

        List<String> coordinatesList = Arrays
                .stream(instruction.split(" "))
                .filter(token -> token.contains(","))
                .collect(Collectors.toList());

        String[] rawCoordinate = coordinatesList
                .get(position)
                .split(",");

        coordinate.add(Integer.parseInt(rawCoordinate[0]));
        coordinate.add(Integer.parseInt(rawCoordinate[1]));

        return coordinate;
    }
}
