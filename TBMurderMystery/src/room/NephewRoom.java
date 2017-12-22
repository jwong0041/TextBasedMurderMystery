package room;
import people.Person;
// y Loc  is FIVE (5)
public class NephewRoom extends Room {

	public NephewRoom(int xLoc, int yLoc, Person occupant) 
	{
		super(xLoc, yLoc, occupant);
		xLoc = 3;
		yLoc = 5;
		occupant = null;
	}

		
}
