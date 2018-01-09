package room;

import people.Person;

public class Kitchen extends Room {
	Person occupant;
	int xLoc;
	int yLoc;
	private boolean explored = false;
	public static boolean locked = true;
	public static boolean end = false;
	
		public Kitchen(int x, int y)
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
				System.out.println("You crept slowly into the kitchen. At the other end of the kitchen the maid \r\n"
						+ "fumbles with a bottle that looks extremely out of place for a kitchen. She pours some into a cup. You think its best not to approach her.");
				System.out.println("I should probably go into the room where I seen lots of bottles before.\r\n");
			} else {
			System.out.println("[This is the Kitchen]\r\n The maid had left before you decided to snoop around some more. You look inside and decide to replace the cup \r\n"
					+ "that the maid had prepared with a cup full of salt.");
			end = true;
			}

		}
		
		public void leaveRoom (Person x) {

			occupant = null;
			ScienceLab.locked = false;
			DiningRoom.locked = false;
			explored = true;
			
		}
	}




