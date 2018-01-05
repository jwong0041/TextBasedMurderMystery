package room;
import people.Person;

public class DiningRoom extends Room
{
	Person occupant;
	int xLoc, yLoc;
	private boolean explored = false;
	
	public DiningRoom (int x, int y)
	{
		//how to add more than one room as Dining Room ??
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
			System.out.println("As you walk into the dining hall, the smell of turkey wafted through the doors as if assault \r\n"
					+ "your hunger. You jolt upright as your mouth starts to water. \r\n"
					+ "Maid: Sit down, there's enough for everybody. Count this as our treat for your service. \r\n"
					+ "Unable to refuse, you gladly sit down as the Maid hurried off to distribute the utensils");
		} else {
		System.out.println("");
		}
		explored = true;
	}
	
	public void leaveRoom (Person x)
	{
		occupant = null;
	}
}
