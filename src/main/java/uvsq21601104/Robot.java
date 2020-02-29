package uvsq21601104;

class Position {
	int x;
	int y;
	public Position(int x, int y) {
		
		this.x = x;
		this.y = y;
		
	}
	
}


public class Robot {
	
	private Position position ;
	private Direction direction ;
	
	
	public Robot( ) {
		
		direction = Direction.Nord;
		position = new Position(0, 0); 
	}

	public void tourne() {
		
		switch (this.direction) {
		
			case Nord : this.direction = Direction.Est; break;
			case Sud : this.direction = Direction.Ouest; break;
			case Ouest : this.direction = Direction.Nord; break;
			case Est : this.direction = Direction.Sud; break;
		
		}
		
		
		
	}
	
	
	
	public void avance () {
		
		switch (this.direction) {
			
			case Nord : position.y += 1; break;
			case Sud : position.y -= 1; break;
			case Ouest : position.x -= 1; break;
			case Est : position.x += 1; break;
			
		}
		
		
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
