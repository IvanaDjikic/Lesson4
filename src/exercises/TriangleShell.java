package exercises;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	Robot r = new Robot();

	void go() {

		r.setSpeed(100);

		int length = 50;

		for (int i = 0; i < 60; i++) {

			r.setRandomPenColor();

			length = length + 10;

			drawTriangle(length);

			r.turn(6);
		}

	}

	private void drawTriangle(int length) {
		r.penDown();
		r.setPos(600, 400);
		r.setPenWidth(2);
		for (int i = 0; i < 3; i++) {

			r.move(length);
			r.turn(120);

		}

	}

	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
