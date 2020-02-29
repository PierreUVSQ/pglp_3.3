package uvsq21601104;

import java.util.*;

public class Environement {

	List<Robot> l;
	
	public Environement() {
		
		l = new ArrayList<Robot>();
	
	}
	
	public void avanceTous() {
		
		for(Robot r : l) {
			
			r.avance();
			
		}
		
		
	}
	
	
	public void addRobot(Robot r) {
		
		this.l.add(r);
		
	}
	
	public List<Robot> getList() {
		
		return Collections.unmodifiableList(l);
		
	}
	
}
