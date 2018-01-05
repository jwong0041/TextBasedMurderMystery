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
					+ "Unable to refuse, you gladly sit down as the maid hurried off to distribute the utensils. \r\n" 
					+ "You sit there in silence while eating with the Master and Andy, when the Master suddenly speaks up. \r\n" 
					+ "Master: I'm done eating here, I need to go visit my wife in the study room. Take your time eating. \r\n"
					+ "You hear a crash behind you. The maid has a panicky expression on her face as she picks up the tray she dropped. \r\n"
					+ "Nephew: I'm done eating, go to my lab after he's done eating to clean. \r\n"
					+ "     I dropped and broke a beaker in front of the cabinet."
					+ "Maid: Yes sir. "
					+ "You: I'm done eating... Uhm, where should I go now?"
					+ "Maid: You can go rest in the guest room (: "
					+ "You: Thanks for the meal (: \r\n"
					+ "You start to head towards your room.");
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
