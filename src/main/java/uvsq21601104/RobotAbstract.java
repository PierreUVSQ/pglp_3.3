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
	
	public int getx() {
		
		int res = this.position.x;
		return res;
		
	}
	
	public int gety() {
		
		int res = this.position.y;
		return res;
		
	}
	
	public Direction getd() {
		
		Direction res = this.direction;
		return res;
		
		
	}
	
}
