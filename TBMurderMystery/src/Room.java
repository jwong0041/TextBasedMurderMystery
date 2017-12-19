
public class Room 
{
	private boolean explored = false;
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
	
	public void print()
	{
		if(!explored && occupant == null)
		{
			System.out.print("[ ]");
		} 
		else if (occupant != null)
		{
			System.out.print("[");
			occupant.print();
			System.out.print("]");
		}
		else if (explored)
		{
			System.out.print("[ ]");
		}
	}
	
}
