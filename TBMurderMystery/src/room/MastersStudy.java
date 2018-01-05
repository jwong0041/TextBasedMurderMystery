package room;

import people.Person;

public class MastersStudy extends Room {
	Person occupant;
	int xLoc;
	int yLoc;
	private boolean explored = false;
	public static boolean locked = true;
	
		public MastersStudy(int x, int y)
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
				System.out.println("Curious to see if the ghost the Master was talking about was real, you peek into the study room. \r\n" 
			+ "You see the Master deeper in the study, staring at a bookshelf. \r\n"
			+ "Then you see a light shine across the wall! It's the ghost!"
			+ "... and is that a womans's voice? It doesn't sound like the maid's, could it be the late wife?");
				System.out.println("As you leave, you spot the maid creeping into the kitchen.\r\n");
			} else {
			System.out.println("You probably shouldn't be back in Study, whether the ghost was real or not, \r\n"
					+ "you didn't want to bother the Master. \r\n");
			}
		}
		
		public void leaveRoom (Person x) {
			occupant = null;
			Kitchen.locked = false;
			explored = true;
		}
	}



