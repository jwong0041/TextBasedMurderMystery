package room;
import people.Person;

public class DiningRoom extends Room
{
	Person occupant;
	int xLoc, yLoc;
	private boolean explored = false;
	public static boolean locked = false;
	
	public DiningRoom (int x, int y)
	{
		//how to add more than one room as Dining Room ??
		super(x,y);
		this.xLoc = x;
		this.yLoc = y;
	}
	
	public boolean locked( ) {
		return locked;
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
					+ "You sit there in silence while eating with the Master and his nephew, when the Master suddenly speaks up. \r\n" 
					+ "Master: I'm done eating here, I need to go wait for my wife in the Study. Take your time eating. \r\n"
					+ "You hear a crash behind you. The maid has a panicky expression on her face as she picks up the tray she dropped. \r\n"
					+ "Nephew: I'm done eating too. \r\n"
					+ "[He turns to the maid] I broke a beaker in front of the cabinet in my lab, could you clean it up for me."
					+ "Maid: Yes sir. "
					+ "You: I'm done eating... Uhm, where should I stay?"
					+ "Maid: You can rest in the guest room, make yourself at home while you wait for the rain to let up."
					+ "You: Thanks for the meal \r\n"
					+ "As you all leave the Butler locks the door behind you. \r\n");
		} else {
			System.out.println("The maid pours out some tea for the master, while you and the nephew get orange juice. \r\n" +
					 "Out of nowhere, the master spits out his tea. \r\n" +
					 "Master: Why does this taste so bad?????? \r\n" +
					 "You hear a gasp from the maid, and then everything clicks.");
		}
		explored = true;
	}
	
	public void leaveRoom (Person x)
	{
		locked = true;
		occupant = null;
	}
}
