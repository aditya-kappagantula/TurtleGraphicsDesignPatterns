package turtle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import pen.Pen;
import turtle.interpreterPattern.Evaluator;
import turtle.interpreterPattern.command.Command;
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
			interpretCommandsFromFile(aFile);
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

	private void interpretCommandsFromFile(File aFile) throws IOException {
		FileInputStream aFileInputStream = new FileInputStream(aFile);
		BufferedReader aBufferedReader = new BufferedReader(
				new InputStreamReader(aFileInputStream));
		String line = null;
		while ((line = aBufferedReader.readLine()) != null) {
			Evaluator anEvaluator = new Evaluator(line);
			Map<String, Double> variables = new HashMap<String, Double>();
			variables.put("w", 5.0);
			variables.put("x", 10.0);
			variables.put("z", 42.0);
			Iterator<Command> anIterator = anEvaluator.interpret(variables)
					.iterator();
			while (anIterator.hasNext()) {
				commands.add(anIterator.next());
			}
		}
		aBufferedReader.close();
	}

	public void execute() {
		execute(commands);
	}

	private void execute(ArrayList<Command> commands) {
		Iterator<Command> anIterator = commands.iterator();
		while (anIterator.hasNext()) {
			anIterator.next().execute(this);
		}
	}
}
