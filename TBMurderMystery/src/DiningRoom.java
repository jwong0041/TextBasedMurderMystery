
public class DiningRoom extends Room
{
	Person occupant;
	int xLoc, yLoc;
	
	public DiningRoom (int x, int y)
	{
		//how to add more than one room as Dining Room ??
		xLoc = 2;
		yLoc = 0;
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
