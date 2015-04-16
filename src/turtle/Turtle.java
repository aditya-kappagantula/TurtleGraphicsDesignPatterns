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
import turtle.interpreterPattern.command.Repeat;
import turtle.interpreterPattern.visitorPattern.ICommandElement;
import turtle.interpreterPattern.visitorPattern.ICommandVisitor;
import coordinateSystem.Point;

public class Turtle implements ICommandElement {
	private double direction;
	private Point location;
	private Pen pen;
	private ArrayList<ICommandElement> commands = new ArrayList<ICommandElement>();
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
		execute(this);
	}

	@Override
	public void accept(ICommandVisitor anICommandVisitor, Turtle aTurtle) {
		for (ICommandElement eachCommand : commands) {
			eachCommand.accept(anICommandVisitor, aTurtle);
		}
		anICommandVisitor.visit(this, aTurtle);
	}

	@Override
	public String type() {
		// TODO Auto-generated method stub
		return "Turtle";
	}

	@Override
	public void execute(Turtle aTurtle) {
		Iterator<ICommandElement> anIterator = commands.iterator();
		while (anIterator.hasNext()) {
			ICommandElement aCommand = anIterator.next();
			if (aCommand.type() == "repeat") {
				int repeatCount = ((Repeat) aCommand).getCount();
				ArrayList<ICommandElement> repeatList = new ArrayList<ICommandElement>();
				while (anIterator.hasNext()) {
					aCommand = anIterator.next();
					if (aCommand.type() != "end") {
						repeatList.add(aCommand);
					}
				}
				while (repeatCount > 0) {
					for (Iterator<ICommandElement> repeatIterator = repeatList
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
