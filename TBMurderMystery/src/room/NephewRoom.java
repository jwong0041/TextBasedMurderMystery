package room;
import people.Person;
// y Loc  is FIVE (5)
public class NephewRoom extends Room {

	Person occupant;
	int xLoc;
	int yLoc;
	private boolean explored = false;
	public static boolean locked = false;
	
		public NephewRoom(int x, int y)
		{
			super(x,y);
			this.xLoc = x;
			this.yLoc = y;
			
		}
		
		public boolean locked() {
			return locked;
		}
		
		public void enterRoom(Person x)
		{
			occupant = x;
			x.setxLoc(this.xLoc);
			x.setyLoc(this.yLoc);
			if(explored == false) {
				System.out.println("You walk into the Nephew's room where you find him sitting in a chair \r\n"
						+ "Hearing the sound of the door, he quickly turns around attempting to hide whatever was in his hands \r\n"
						+ "Nephew: How may I be of help? Do you need anything from me? \r\n"
						+ "You: I just thought I should introduce myself as I happen to be using this hosue as shelter \r\n"
						+ "Nephew: Oh, I guess I'll introduce myself, My name's Lance Wu and I'm the nephew of the owner \r\n"
						+ "of this house. \r\n"
						+ "You: Do you like the sciences? You have an extraordinary collection of scientific books! \r\n"
						+ "Lance: I guess, I recently graduated MIT so that was the reason for the science textbooks. \r\n"
						+ "You: Well that's something interesting! But I think I should go now, it's getting late. \r\n"
						+ "As you leave the room you spot a crumbled red letter in the wastebin.\r\n"
						+ "As the door closes you hear the lock click from inside.");
			} else {
			System.out.println("You decide it's far too tempting to not check the contents of the letter. \r\n"
					+ "You sneak back into the room and rummaged through the bin \r\n"
					+ "until you found what you came for. The letter was almost unreadable except for a few"
					+ "words and digits."
					+ "You were able to distinguish the words: Money, Debt, and Due on the edge of the paper \r\n"
					+ "a number is written, '356,000'. ");
			}
			explored = true;
		}
		
		public void leaveRoom (Person x)
		{
			occupant = null;
			locked = true;
			
		}
	}


