package room;

import people.Person;

public class MastersStudy extends Room {
	Person occupant;
	int xLoc;
	int yLoc;
	private boolean explored = false;
	
		public MastersStudy(int x, int y)
		{
			super(x,y);
			this.xLoc = x;
			this.yLoc = y;
			
		}
		
		public void enterRoom(Person x)
		{
			occupant = x;
			x.setxLoc(this.xLoc);
			x.setyLoc(this.yLoc);
			if(explored == false) {
				System.out.println("You continue to walk until you spot the study room. \r\n" 
			+ "Curious to see if the ghost the Master was talking about was real, you peek into the study room. \r\n" 
			+ "You see the Master deeper in the study, staring at a bookshelf. \r\n"
			+ "Then you see a light shine across the wall! It's the ghost!"
			+ "... and is that a womans's voice? It doesn't sound like the maid's, could it be the late wife?");
			} else {
			System.out.println("You probably shouldn't be back in Study, whether the ghost was real or not, \r\n"
					+ "you didn't want to bother the Master. \r\n");
			}
			explored = true;
		}
		
		public void leaveRoom (Person x)
		{
			occupant = null;
		}
	}



