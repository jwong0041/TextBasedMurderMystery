package room;
import people.Person;
// y Loc  is FIVE (5)
public class NephewRoom extends Room {

	Person occupant;
	int xLoc;
	int yLoc;
	private boolean explored = false;
	
		public NephewRoom(int x, int y)
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


