package people;
public class Master extends Person 
{
	private int xLoc, yLoc;
	
	public Master(int xLoc, int yLoc) 
	{
		// TODO Auto-generated constructor stub
		this.xLoc = xLoc;
		this.yLoc = yLoc;
		//Master should be in one of the two master's study rooms. Staring at the wall. Talkin' to a ghost.
		//need to randomly generate one or the other
	}

}
