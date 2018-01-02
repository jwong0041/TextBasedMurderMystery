package people;

public abstract class Person
{
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

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
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getFamilyName() {
		return familyName;
	}
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	public String getTitle() {
		return title;
	}
	public Person (String firstName, String familyName, String title, int xLoc, int yLoc)
	{
		this.firstName = firstName;
		this.familyName = familyName;
		this.title = title;
		this.xLoc = xLoc;
		this.yLoc = yLoc;
	}
	

	
}
