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
			System.out.println("The front door is here, leading to the outside. \r\n"
					+ "It is pouring outside. It was really lucky you got in the mansion when you did.");
		} else {
		System.out.println("[This is the Front Door] \r\n"
				+ "You check to see if the rain has stopped, but it doesn't look like its stopping anytime soon. \r\n"
				+ "But you shouldn't leave now anyway. You have a feeling there is touble brewing in this mansion.");
		}
		explored = true;
	}	
	
	
	public void leaveRoom (Person x)
	{
		occupant = null;
	}
}


