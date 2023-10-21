import java.util.HashSet;
import java.util.Set;

public class PathCalculator {
    private final Point currentPosition = new Point(0, 0);

    private final Set<Point> visitedPositions = new HashSet<>();

    public PathCalculator() {
        visitedPositions.add(
                new Point(
                        currentPosition.getX(),
                        currentPosition.getY()
                )
        );
    }

    public int calculatePath(String path) {
        path.
                chars().
                mapToObj(c -> (char) c).
                forEach(c -> {
                    updateCurrentPosition(c);
                    visitedPositions.add(
                            new Point(
                                    currentPosition.getX(),
                                    currentPosition.getY()
                            )
                    );
                });

        return visitedPositions.size();
    }

    private void updateCurrentPosition(char sign) {
        switch (sign) {
            case '<':
                currentPosition.moveLeft();
                break;
            case '>':
                currentPosition.moveRight();
                break;
            case '^':
                currentPosition.moveUp();
                break;
            case '#':
                currentPosition.moveDown();
                break;
        }
    }
}
