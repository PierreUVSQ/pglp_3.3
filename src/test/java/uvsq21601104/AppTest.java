package uvsq21601104;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import java.util.*;
/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    
    @Test
    public void testAvance() {
    	
    	Robot r1 = new Robot();
    	r1.avance();
    	assertEquals(0, r1.getx(), 0);
    	assertEquals(1, r1.gety(), 0);
    	
    }
    
    @Test
    public void testTourne() {
    	
    	Robot r1 = new Robot();
    	r1.tourne();
    	assertTrue( Direction.Est == r1.getd());
    	
    	
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testAvanceStatique() {
    	
    	RobotStatique r1 = new RobotStatique();
    	r1.avance();
    	
    	
    }
    
    @Test 
    public void testAvanceTous() {
    	
    	Environement e = new Environement(); 
    	Robot r1 = new Robot();
    	RobotStatique r2 = new RobotStatique();
    	e.addRobot(r1);
    	e.addRobot(r2);
    	try {
    		e.avanceTous();
    	}
    	catch(UnsupportedOperationException ue) {
    		
    	}
    	List <Robot> l = e.getList();
    	assertEquals(0, l.get(0).getx(), 0);
    	assertEquals(1, l.get(0).gety(), 0);
    	
    	assertEquals(0, l.get(1).getx(), 0);
    	assertEquals(0, l.get(1).gety(), 0);
    	
    }	
    
}
