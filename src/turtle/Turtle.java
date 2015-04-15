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
import turtle.interpreterPattern.command.Repeat;
import coordinateSystem.Point;

public class Turtle {
	private double direction;
	private Point location;
	private Pen pen;
	private ArrayList<Command> commands = new ArrayList<Command>();
	private Map<String, Double> variables;

	public Turtle() {
		setLocation(new Point());
		setDirection(0);
		pen = new Pen();
		variables = new HashMap<String, Double>();
		File directory = new File(".");
		try {
			File aFile = new File(directory.getCanonicalPath() + File.separator
					+ "turtleProgram.txt");
			interpretCommandsFromFile(aFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void addVariable(String aString, Double aValue) {
		this.variables.put(aString, aValue);
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
			commands.add(anEvaluator.interpret(variables));
		}
		aBufferedReader.close();
	}

	public void execute() {
		execute(commands);
	}

	private void execute(ArrayList<Command> commands) {
		Iterator<Command> anIterator = commands.iterator();
		while (anIterator.hasNext()) {
			Command aCommand = anIterator.next();
			if (aCommand.type() == "repeat") {
				int repeatCount = ((Repeat) aCommand).getCount();
				ArrayList<Command> repeatList = new ArrayList<Command>();
				while (anIterator.hasNext()) {
					aCommand = anIterator.next();
					if (aCommand.type() != "end") {
						repeatList.add(aCommand);
					}
				}
				while (repeatCount > 0) {
					for (Iterator<Command> repeatIterator = repeatList
							.iterator(); repeatIterator.hasNext();) {
						repeatIterator.next().execute(this);
					}
					repeatCount--;
				}
			} else {
				aCommand.execute(this);
			}
		}
	}
}
