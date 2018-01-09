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
	public static boolean a6 = true;
	public static boolean a7 = true;
	private boolean fina = true;
	public static boolean actEnd = false;
	public static boolean culpritFound = false;
	public static boolean finalEnding = false;
	private static boolean check = false;
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
			check = true;
			return true;
		case "go": 
			actEnd = false;
			return true;
		case "stay":
			actEnd = true;
			return true;
		case "nephew":
			culpritFound = true;
			return true;
		case "money":
			finalEnding = true;
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
			System.out.println("[This is the Dining Room]\r\n As you walk into the dining hall, the smell of turkey wafted through the doors as if assault \r\n"
					+ "your hunger. You jolt upright as your mouth starts to water. \r\n"
					+ "   Maid: Sit down, there's enough for everybody. Count this as our treat for your service. \r\n"
					+ "Unable to refuse, you gladly sit down as the maid hurried off to distribute the utensils. \r\n" 
					+ "You sit there in silence while eating with the Master and his nephew, when the Master suddenly speaks up. \r\n" 
					+ "   Master: I'm done eating here, I need to go wait for my wife in the Study. Take your time eating. \r\n"
					+ "You hear a crash behind you. The maid has a panicky expression on her face as she picks up the tray she dropped. \r\n"
					+ "   Nephew: I'm done eating too. \r\n"
					+ "[He turns to the maid] I broke a beaker in front of the cabinet in my lab, could you clean it up for me.\r\n"
					+ "   Maid: Yes sir.\r\n"
					+ "You: I'm done eating... Uhm, where should I stay?\r\n"
					+ "   Maid: You can rest in the guest room, make yourself at home while you wait for the rain to let up.\r\n"
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
							+ "You would be right if you thought that. And the culprit behind this attempted murder is the ______\r\n"
							+ "");
					a1 = false;
				} else {
					if((finir(response) == true) && (a2 == true)) {
					System.out.println("Master: Why would she kill me? I have done no harm to her! I refuse to believe this nonsense!\r\n"
							+ "You: It's simply, what if she had a crime she couldn't confess and she tried to kill you in fear of being found out?\r\n"
							+ "Master: She has committed another crime other than attempting to poison me?\r\n"
							+ "");
					a2 = false;
					
				} else {
					if((finir(response) == true) && (a3 == true)) {
						System.out.println("You: In fact you should be quite familiar with the victim of this crime. The crime the maid is trying to hide is the fact \r\n);"
								+ "that she was the one responsible for the death of your wife.\r\n"
								+ "Master: That's impossible...she has always treated us kindly. There was no reason for the murder!\r\n"
								+ "Maid: No, the detective's right. I was responsible...\r\n"
								+ "Butler: You skank! How DARE you! She treated us with such compassion and this is how you treat our benefactors!?\r\n"
								+ "In a sudden outburst of range and motion, the butler attempts to slap the maid across the face, but the master stops him\r\n"
								+ "Master: Tell me why. Why did you kill her, for what reason was there such a need.\r\n"
								+ "Maid: I stole some jewelery from her...and she threatened me to stop before she called the cops...\r\n"
								+ "I tried to scare her just a little bit by tweaking the brakes on her wheelchair a little loose.\r\n"
								+ "I NEVER THOUGHT SHE WOULD'VE DIED!! I'm so sorry...\r\n"
								+ "Nephew: That's enough someone call the cops and arrest her before she tries anything else!\r\n"
								+ "As the sound of sirens approach the house you feel a sense of relief that the kind hearted owner did not meet his demise today.\r\n"
								+ ""
								+ "Please enter 'go' to finish the mission............................................................................................................................................................oR i5 tH3 m1sSi0n uNf1niShed, iS th3re sumetH1nG yoU f0rGot? wilL yuo 'stay'?");
						a3 = false;
				} else {
					if((finir(response) == true) && (a4 == true) && (actEnd == false)) {
						System.out.println("You left the mansion for the cozy comfort of Brooklyn, thinking you did a good job you decide to treat yourself to some drinks. As you enter the bar\r\n"
								+ "You see a familiar face on the screen, a face you haven't seen in a weeks time. The owner of the mansion was on TV but not for the right reasons. He looked at you\r\n"
								+ "coldly as his eye sockets seem to stare into your soul. He was dead. Did you fully solve the mystery?");
						a4 = false;
					} else {  if((finir(response) == true) && (a5 == true) && (actEnd == true)) {
							System.out.println("The scenario didn't seem right, something was missing.\r\n"
									+ "Then it hits you the things that you've missed.\r\n"
									+ ""
									+ "You: Before we forget, there is one more culprit, someone who hid behind the shadows as manipulated the others to their will! This culprit is the _________!");
							a5 = false;
						} else {
							if((finir(response) == true) && (a6 == true) && (actEnd == true) && (culpritFound == true)) {
								System.out.println("Nephew: What? Me? I have been the most supportive person to my uncle since the death of his wife! How dare you accuse me!\r\n"
										+ "Do you even have a motive!"
										+ "Yes, in fact your motive is the simplest one of them all. It is _______!");
								a6 = false;
							} else {
								if((finir(response) == true) && (a7 == true) && (finalEnding = true) && (culpritFound = true)) {
									System.out.println("You: In fact I found a crismon red letter in your wastebin addressed to you from a loaning agent, where you could briefly make out the\r\n"
											+ "debt that you owe. You wanted to kill your uncle by manipulating the maid into doing your dirty deeds. Your sciene lab is literred with electronic\r\n"
											+ "components that would have made emulating a ghost a simple task, in addition you made sure the cabinet to the list of dangerous chemicals were unlocked and\r\n"
											+ "cued the maid to clean your room in hopes she would find it!\r\n"
											+ "Nephew: Tchh\r\n"
											+ "Master: Why Lance...\r\n"
											+ "Nephew: Because I'm drowning in debt you klutz, and you're so stingy you wouldn't even lend me money when I asked! Then what am I supposed to do?!\r\n"
											+ "The rest of the day pasted in a blur of sirens and tears. The mystery has been solved and you happened to have ruined a family's life." );
							fina = false;
								}
							}
						}
					}
				}
					
			}

			
			
			}

			//System.out.println("[This is the Dining Room]\r\n The maid pours out some tea for the master, while you decide on some orange juice. The nephew as already gotten a cup of instant coffee.\r\n" +
					 //"Out of nowhere, the master spits out his tea. \r\n" +
					 //"   Master: Why does this taste so bad?????? \r\n" +
					 //"You hear a gasp from the maid, and then everything clicks.");

		}
		}
		explored = true;
	}
	
	
	public void leaveRoom (Person x)
	{
		locked = true;
		occupant = null;

	}
}
