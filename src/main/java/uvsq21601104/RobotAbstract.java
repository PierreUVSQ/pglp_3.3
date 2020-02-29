package uvsq21601104;


class Position {
	int x;
	int y;
	public Position(int x, int y) {
		
		this.x = x;
		this.y = y;
		
	}
	
}


public abstract class RobotAbstract {

	protected Position position ;
	protected Direction direction ;
	
	public RobotAbstract() {
		
		
		direction = Direction.Nord;
		position = new Position(0, 0); 
		
	}
	
	
	public void avance() {
		
	}
	
	
}
