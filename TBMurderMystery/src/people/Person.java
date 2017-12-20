package people;

public class Person
{
	String firstName;
	String familyName;
	int xLoc, yLoc;
	String title;
	
	public int getxLoc()
	{
		return xLoc;
	}
	public void setxLoc(int xLoc)
	{
		this.xLoc = xLoc;
	}
	public int getyLoc()
	{
		return yLoc;
	}
	public void setyLoc(int yLoc)
	{
		this.yLoc = yLoc;
	}
	
	public Person (String firstName, String familyName, String title, int xLoc, int yLoc)
	{
		this.firstName = firstName;
		this.familyName = familyName;
		this.title = title;
		this.xLoc = xLoc;
		this.yLoc = yLoc;
	}
	
	public Person() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
}
