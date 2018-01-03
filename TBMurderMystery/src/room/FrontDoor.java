package room;
import people.Person;

public class FrontDoor extends Room
{
	Person occupant;
	int xLoc;
	int yLoc;
	private boolean explored = false;
	
	public FrontDoor (int x, int y)
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
		if(explored == false) {
			System.out.println("FUC");
		} else {
		System.out.println("Joyin's a butthole");
		}
		explored = true;
	}	
	
	
	public void leaveRoom (Person x)
	{
		occupant = null;
	}
}


