package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		Robot myRobot = new Robot();
			myRobot.setSpeed(10);
		myRobot.penDown();
			myRobot.setRandomPenColor();
		myRobot.move(200);
			myRobot.turn(90);
			myRobot.setRandomPenColor();
		myRobot.move(200);
			myRobot.turn(90);
			myRobot.setRandomPenColor();
		myRobot.move(200);
			myRobot.turn(90);
			myRobot.setRandomPenColor();
		myRobot.move(200);
			myRobot.turn(90);
			myRobot.setRandomPenColor();
		myRobot.hide();	
			myRobot.sparkle();
			myRobot.setSpeed(1);
		myRobot.move(200);
			myRobot.turn(90);
			myRobot.setRandomPenColor();
		myRobot.move(200);
			myRobot.turn(90);
			myRobot.setRandomPenColor();
		myRobot.move(200);
			myRobot.turn(90);
			myRobot.setRandomPenColor();
	    myRobot.move(200);
			myRobot.turn(90);
			myRobot.setRandomPenColor();
	    
	}
}
