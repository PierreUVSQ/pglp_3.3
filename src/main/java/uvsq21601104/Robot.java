package uvsq21601104;



public class Robot extends RobotAbstract {
	
	public Robot( ) {
		
		super();
	}

	public void tourne() {
		
		switch (this.direction) {
		
			case Nord : this.direction = Direction.Est; break;
			case Sud : this.direction = Direction.Ouest; break;
			case Ouest : this.direction = Direction.Nord; break;
			case Est : this.direction = Direction.Sud; break;
		
		}
		
		
		
	}
	
	
	@Override
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
