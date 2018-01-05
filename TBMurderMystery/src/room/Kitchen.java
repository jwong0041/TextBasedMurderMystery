package room;

import people.Person;

public class Kitchen extends Room {
	Person occupant;
	int xLoc;
	int yLoc;
	private boolean explored = false;
	
		public Kitchen(int x, int y)
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
				System.out.println("This is the Kitchen. You notice the Maid in the back, cleaning and prepping various things.");
			} else {
			System.out.println("This is the Kitchen. You notice the Maid in the back, cleaning and prepping various things.");
			}
			explored = true;
		}
		
		public void leaveRoom (Person x)
		{
			occupant = null;
		}
	}




