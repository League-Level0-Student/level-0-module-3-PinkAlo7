
package _02_loop_variables._3_robot_walk_of_fame;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();

		// 1. Set the X position of the robot so that it starts on the left.
		// You also need to show the robot to see the result of this line.
		int X = 150;

		// 2. Make the robot draw a star shape. Hint: angle=144.
		for (int i = 0; i < 11; i++) {
			rob.setX(X);
			rob.setY(100);
			rob.penDown();
			rob.setSpeed(100);
			for (int h = 0; h < 6; h++) {
				rob.turn(144);
				// 3. Set the length of each line in the star to 30.
				rob.move(30);
				
			}
			X += 150;
		}
		rob.hide();

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of 10 stars (see recipe to see how it should look)
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
