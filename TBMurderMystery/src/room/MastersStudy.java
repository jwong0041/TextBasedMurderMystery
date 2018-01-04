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
				System.out.println("");
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



