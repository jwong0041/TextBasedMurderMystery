package room;

import people.Person;

public class MastersRoom extends Room {
	Person occupant;
	int xLoc;
	int yLoc;
	private boolean explored = false;
	public static boolean locked = true;
	
		public MastersRoom(int x, int y)
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
				System.out.println("This is the Master's Room. You feel like you shouldn't be in here...\r\n"
						+ "You suddenly hear a squeak, like a wheel turning.\r\n"
						+ "When you turn to look for the source of the sound, you see a rusty wheelchair seemingly moving.\r\n"
						+ "Upon closer inspection, you realize it moved because of the faulty brakes. The wind probably pushed it.\r\n");
				System.out.println("You hear the Master walk into his study. You hear him talking with a deep sadness to someone."
						+ "Your heart drops at the thought that he's talking to the ghost... \r\n"
						+ "You should probably investigate.\r\n");
			} else {
			System.out.println("This is the Master's Room. You feel like you shouldn't be in here...\r\n"
					+ "The wheelchair is still there.");
			}
			explored = true;
		}
		
		public void leaveRoom (Person x) {
			occupant = null;
			MastersStudy.locked = false;
			
		}
	}
