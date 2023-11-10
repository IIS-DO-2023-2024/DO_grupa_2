package command;

import mvc.Line;

public class UpdateLineCmd implements Command {
	Line line;
	Line newState;
	Line original = new Line();

	public UpdateLineCmd(Line line, Line newState) {
		this.line = line;
		this.newState = newState;
	}

	@Override
	public void execute() {
		/* Izmena svih oblika treba da se vrsi na 
		 * nivou primitivnih obelezja
		 * 
		original.setStartPoint(line.getStartPoint());
		original.setEndPoint(line.getEndPoint());
		original.setColor(line.getColor());
		
		line.setStartPoint(newState.getStartPoint());
		line.setEndPoint(newState.getEndPoint());
		line.setColor(newState.getColor()); 
		*/
		original.getStartPoint().setX(line.getStartPoint().getX());
		original.getStartPoint().setY(line.getStartPoint().getY());
		original.getEndPoint().setX(line.getEndPoint().getX());
		original.getEndPoint().setY(line.getEndPoint().getY());
		original.setColor(line.getColor());
		

		line.getStartPoint().setX(newState.getStartPoint().getX());
		line.getStartPoint().setY(newState.getStartPoint().getY());
		line.getEndPoint().setX(newState.getEndPoint().getX());
		line.getEndPoint().setY(newState.getEndPoint().getY());
		line.setColor(line.getColor());
	}

	@Override
	public void unexecute() {		
		line.getStartPoint().setX(original.getStartPoint().getX());
		line.getStartPoint().setY(original.getStartPoint().getY());
		line.getEndPoint().setX(original.getEndPoint().getX());
		line.getEndPoint().setY(original.getEndPoint().getY());
		line.setColor(original.getColor());

	}

}
