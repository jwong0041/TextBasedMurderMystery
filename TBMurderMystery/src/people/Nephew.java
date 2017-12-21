package people;

class Nephew extends Person
{
	
	public Nephew(String firstName, String familyName, String title, int xLoc, int yLoc) 
	{
		// TODO Auto-generated constructor stub
		super(firstName, familyName, title, xLoc, yLoc);
		this.firstName = firstName;
		this.familyName = familyName;
		this.title = title;
		this.xLoc = xLoc;
		this.yLoc = yLoc;
				
		
		//this.xLoc = xLoc; //make the nephew stay in the nephew's room
		//this.yLoc = yLoc; //need x coord and y coord
	}

	
	
}
