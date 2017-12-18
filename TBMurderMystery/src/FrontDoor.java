
public class FrontDoor extends Room
{
	Person occupant;
	int xLoc, yLoc;
	
	public FrontDoor (int x, int y)
	{
		xLoc = 5;
		yLoc = 2;
	}
	
	public void enterRoom (Person x)
	{
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
	}
	
	public void leaveRoom (Person x)
	{
		occupant = null;
	}
}
