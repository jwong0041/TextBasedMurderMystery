package room;
import people.Person;

public class FrontDoor extends Room
{
	Person occupant;
	int xLoc = 1;
	int yLoc = 1;
	
	public FrontDoor (int x, int y)
	{
		super(x,y);
		x = 1;
		y = 1;

	}
	
	@Override
	public void enterRoom (Person x)
	{
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		System.out.println("GO away");
	}
	
	public void leaveRoom (Person x)
	{
		occupant = null;
	}
}


