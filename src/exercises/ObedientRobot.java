package exercises;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	Robot pencil = new Robot("mini");

	public void drawSettings() {
		pencil.penDown();
		pencil.setSpeed(10);
		pencil.setPos(100, 300);
		pencil.setPenColor(Color.BLACK);
		pencil.setPenWidth(2);
	}

	public void drawSquare() {
		drawSettings();
		for (int i = 0; i < 4; i++) {

			pencil.move(100);
			pencil.turn(90);
		}
	}

	public void drawTriangle() {
		drawSettings();
		for (int i = 0; i < 3; i++) {

			pencil.move(100);
			pencil.turn(120);
		}
	}

	public void drawCircle() {
		drawSettings();
		for (int i = 0; i < 360; i++) {

			pencil.turn(1);
			pencil.move(2);
		}
	}

	public static void main(String[] args) {
		int shape = JOptionPane.showOptionDialog(null, "Which shape would you like me to draw?", "Obedient Robot", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Circle", "Square", "Triangle" }, null);

		if (shape == 0) {
			new ObedientRobot().drawCircle();

		} else if (shape == 1) {
			new ObedientRobot().drawSquare();
		} else {
			new ObedientRobot().drawTriangle();
		}

	}

}
