import java.util.Arrays;
import java.util.List;

public class MarsRover {

    private static final List<String> VALID_COMMANDS = Arrays.asList("L", "R", "M", "B");
    private static final List<String> DIRECTIONS = Arrays.asList("N", "E", "S", "W");

    private static final int Y = 1;
    private static final int X = 0;

    public String direct;
    // position which contains X and Y
    private int[] position;

    public MarsRover(int startingX, int startingY, String direction) {
        this.position = new int[]{startingX, startingY};
        this.direct = direction;
    }

    public String run(String input) {
        String[] commandArray = input.split("");

        validateCommands(input, commandArray);

        String[] commands = commandArray;

        way(commands);

        return asString();
    }

    public void way(String[] commands) {
        for (String command : commands) {
            if (command.equals("M")) {
                move();
            } else if (isRightTurnCommand(command)) {
                turnRight();
            } else if (isLeftTurnCommand(command)) {
                turnLeft();
            } else if (command.equals("B")) {
                TurnBack();
            }
        }
    }

    private boolean isLeftTurnCommand(String command) {
        return command.equals("L");
    }

    private boolean isRightTurnCommand(String command) {
        return command.equals("R");
    }

    private void move() {
        if (direct.equals("N")) {
            position[Y] += +1;
        } else if (direct.equals("S")) {
            position[Y] += -1;
        } else if (direct.equals("E")) {
            position[X] += +1;
        } else if (direct.equals("W")) {
            position[X] += -1;
        }
    }

    private void TurnBack() {
        turnRight();
        turnRight();
        move();
        turnRight();
        turnRight();
    }

    private void turnLeft() {
        direct = DIRECTIONS.get((DIRECTIONS.indexOf(direct) + 3) % DIRECTIONS.size());
    }

    private void turnRight() {
        direct = DIRECTIONS.get((DIRECTIONS.indexOf(direct) + 1) % DIRECTIONS.size());
    }

    public static void validateCommands(String input, String[] commandArray) {
        for (String command : commandArray) {
            if (!VALID_COMMANDS.contains(command)) {
                throw new IllegalArgumentException("Invalid command sequence: " + input);
            }
        }
    }

    private String asString() {
        return position[X] + " " + position[Y] + " " + direct;
    }
}