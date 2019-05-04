package optional;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import sun.security.util.PendingException;

public class FourSquare {

	Robot r = new Robot();

	void go() {

		r.setSpeed(100);

		r.setPenWidth(5);

		for (int i = 0; i < 4; i++) {

			r.setRandomPenColor();

			drawSquare();

			r.turn(90);
		}

	}

	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		r.penDown();

		for (int i = 0; i < 4; i++) {

			r.move(100);
			r.turn(90);
		}

	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
