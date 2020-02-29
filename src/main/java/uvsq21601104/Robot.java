package uvsq21601104;

class Position{
	int x;
	int y;
	public Position(int x , int y){
		
		this.x = x;
		this.y = y;
		
	}
	
}





public class Robot {
	
	private Direction d;
	private Position p;
	
	public Robot( ) {
		
		d = Direction.Nord;
		p.x = 0;
		p.y = 0;
	}
	
	private Position position ;
	private Direction direction ;
	
	public void tourne() {}
	public void avance () {}

}
