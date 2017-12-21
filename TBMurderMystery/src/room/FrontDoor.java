package room;
import people.Person;

public class FrontDoor extends Room
{
	Person occupant;
	int xLoc, yLoc;
	
	public FrontDoor (int x, int y)
	{
		xLoc = 0;
		yLoc = 0;
	}
	
	public void enterRoom (Person x)
	{
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
	}
	
	public String descriptionHouse = "The eerie house seemed to come"
			+ " to life and the windows stared at me with a flickering anger";
	
	public void leaveRoom (Person x)
	{
		occupant = null;
	}
}


