package room;
import java.util.Scanner;

import people.Person;

public class DiningRoom extends Room
{
	Person occupant;
	int xLoc, yLoc;
	private boolean explored = false;
	public static boolean locked = false;
	public static boolean a1 = true;
	public static boolean a2 = true;
	public static boolean a3 = true;
	public static boolean a4 = true;
	public static boolean a5 = true;
	private boolean fina = true;
	
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
	
	public static boolean finir(String x) {
		x = x.toLowerCase().trim();
		switch (x) {
		case "poison":
			return true;
		
		case "maid":
			return true;
		
		case "yes":
			return true;
		
		case "nephew":
			return true;
		
		case "money":
			return true;
			
			default:
				break;
		}
		
		return false;
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
			System.out.println("Tea time came and everybody gathered in the Dining Room. The maid walked around with tea for the master \r\n"
					+ "while you and the nephew opped for orange juice. Then you hear the crash of a cup hitting the floor. Turning around you find the\r\n"
					+ "master sitting in the chair with a disgusted look upon his face.\r\n"
					+ "Master: Who made this tea? Why does it taste so bad!?\r\n"
					+ "You: Of course it would taste bad, the tea happens to have salt in it.\r\n"
					+ "Master: Salt?\r\n"
					+ "You: Yep, the salt that I substituted the ______ with.");
			while(fina = true) {
				Scanner finale = new Scanner(System.in);
				String response = finale.nextLine();
				
				if((finir(response) == true) && (a1 == true)) {
					System.out.println("Master: The poison..? Was someone trying to kill me?\r\n"
							+ "You would be right if you thought that. And the culprit behind this attempted murder is ______\r\n"
							+ "");
					a1 = false;
				} else {
					if((finir(response) == true) && (a2 == true)) {
					System.out.println("Master: Why would she kill me? I have done no harm to her! I refuse to believe this nonsense!\r\n"
							+ "You: It's simply, what if she had a crime she couldn't confess and she tried to kill you in fear of being found out?\r\n"
							+ "Master: She has committed another crime other than attempting to poison me?\r\n"
							+ "");
					a2 = false;
					
				}
			}

			
			
		}
		}
		explored = true;
	}
	
	public void leaveRoom (Person x)
	{
		//locked = true;
		occupant = null;
	}
}
