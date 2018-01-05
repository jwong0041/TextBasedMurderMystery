package room;

import people.Person;

public class GuestRoom extends Room{
	Person occupant;
	int xLoc;
	int yLoc;
	private boolean explored = false;
	
		public GuestRoom(int x, int y)
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
				System.out.println("This is the guest room. But there's not really much to do in here. \r\n"
									+ "You decide to explore the mansion instead.");
			} else {
			System.out.println("This is the guest room. There isn't much in this room besides the bare necessities, \r\n"
					+ "and your soaked trench coat that hung from the stand.");
			}
			explored = true;
		}
		
		public void leaveRoom (Person x)
		{
			occupant = null;
		}
	}


