package turtle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import pen.Pen;
import turtle.interpreterPattern.Command;
import coordinateSystem.Point;

public class Turtle {
	private double direction;
	private Point location;
	private Pen pen;
	private ArrayList<Command> commands = new ArrayList<Command>();

	public Turtle() {
		setLocation(new Point());
		setDirection(0);
		pen = new Pen();
		File directory = new File(".");
		try {
			File aFile = new File(directory.getCanonicalPath() + File.separator
					+ "turtleProgram.txt");
			readFile(aFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Point getLocation() {
		return location;
	}

	public void setLocation(Point location) {
		this.location = location;
	}

	public double getDirection() {
		return direction;
	}

	public void setDirection(double direction) {
		this.direction = direction;
	}

	public Pen getPen() {
		return pen;
	}

	public void setPen(Pen pen) {
		this.pen = pen;
	}

	private void readFile(File aFile) throws IOException {
		FileInputStream aFileInputStream = new FileInputStream(aFile);
		BufferedReader aBufferedReader = new BufferedReader(
				new InputStreamReader(aFileInputStream));
		String line = null;
		while ((line = aBufferedReader.readLine()) != null) {
			System.out.println(line);
		}
		aBufferedReader.close();
	}
}
