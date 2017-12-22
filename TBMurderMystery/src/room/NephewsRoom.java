package room;
import people.Person;
// y Loc is FOUR (4)
public class NephewsRoom extends Room {
	/**
	int upper = 5;
	int lower = 4;
	
	int r = (int) (Math.random() * (upper - lower)) + lower;
	*/
	
	public NephewsRoom(int xLoc, int yLoc, Person occupant) 
	{
		super(xLoc, yLoc, occupant);
		xLoc = 3;
		yLoc = 4;
		occupant = null;
	}

		
}
