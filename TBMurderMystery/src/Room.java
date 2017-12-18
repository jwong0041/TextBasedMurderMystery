
public class Room 
{
	Person occupant;
	int xLoc, yLoc;
	
	public Room (int x, int y)
	{
		xLoc = x;
		yLoc = y;
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
