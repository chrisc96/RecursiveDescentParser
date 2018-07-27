package nodes.terminals.actions;

import core.Robot;
import nodes.interfaces.RobotProgramNode;

/**
 * Created by Chris on 19/05/2017.
 */
public class TurnAroundNode implements RobotProgramNode {

    @Override
    public void execute(Robot robot) {
        robot.turnAround();
    }

    @Override
    public String toString() {
        return "TurnAround";
    }
}
