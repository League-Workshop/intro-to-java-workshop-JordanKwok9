package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
Robot joe = new Robot();
joe.setSpeed(100);
joe.penDown( );
joe.move(200);	
joe.turn(-90);
joe.move(200);
joe.turn(-90);
joe.move(200);
joe.turn(-90);
joe.move(200);
	}
}
