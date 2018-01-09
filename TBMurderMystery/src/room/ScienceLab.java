package room;

import people.Person;

public class ScienceLab extends Room {
	Person occupant;
	int xLoc;
	int yLoc;
	private boolean explored = false;
	public static boolean locked = false;
	
		public ScienceLab(int x, int y)
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
				System.out.println("You slowly open the door of the science lab \r\n"
						+ "as you hear a repetitive whispering from within. The maid paced around the\r\n"
						+ "room, as if deeply contemplating something. The room is filled with various bottles and science tech. \r\n"
						+ "It would be best to not bother her."
						+ "Looking around the room, you notice a cabinet that holds a lot of bottles of varius chemicals, \r\n"
						+ "a high end computer, and a recording device.");
			} else {
			System.out.println("[This is the Science Lab]\r\n"
					+ "You inspect the items in the room in hopes of obtaining a lead on the origins of the 'Ghost' \r\n"
					+ "of the mansion. You spot some scattered batteries and computer chips scattered around the room \r\n"
					+ "along with a cabinet of chemicals such as hydrochloric acid, hydrogen peroxide, and cyanide \r\n"
					+ "to your surprise the cabinet isn't locked. Other than that your search came up empty. \r\n" 
					+ "One of the bottle you saw in the kitchen matches the ones in the cabinet.\r\n" 
					+ "You need to get to the kitchen!\r\n");
			}
		}
		
		public void leaveRoom (Person x) {

			occupant = null;
			MastersRoom.locked = false;
			locked = true;
			explored = true;
	}
}



