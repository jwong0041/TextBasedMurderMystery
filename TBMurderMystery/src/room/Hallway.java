package room;
import people.Person;

public class Hallway extends Room {
	Person occupant;
	int xLoc;
	int yLoc;
	
	public Hallway (int x, int y)
	{
		super(x,y);
		this.xLoc = x;
		this.yLoc = y;
	}
	
	@Override
	public void enterRoom (Person x)
	{
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		System.out.println("The Hallway seems to expand forever");
	}
	
	public void leaveRoom (Person x)
	{
		occupant = null;
	}
}

