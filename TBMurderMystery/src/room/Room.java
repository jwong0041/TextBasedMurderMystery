package room;
import people.Person;

public class Room 
{
	private boolean explored = false;
	private Person occupant;
	int xLoc, yLoc;
	
	
	public Room (int x, int y)
	{
		this.xLoc = x;
		this.yLoc = y;
	}
	
	//what is this???
	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Person getOccupant() {
		return occupant;
	}
	
	public void setOccupant(Person occupant) {
		this.occupant = occupant;
	}
	
	public void enterRoom (Person x)
	{
		System.out.println();
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
	}
	
	public void leaveRoom (Person x)
	{
		occupant = null;
	}
		
	public void print()
	{
		if(!explored && occupant == null)
		{
			System.out.print("[ ]");
		} 
		else if (occupant != null)
		{
			System.out.print("[");
			//occupant.print();  gotta make the print method for person
			System.out.print("]");
		}
		else if (explored)
		{
			//add extras. ex: if its dining room add D, if its Science Lab add S etc.
			System.out.print("[x]");
		}
	}
	
}
