import room.Room;

public class Board 
{
	private Room [][] rooms; //declare but don't initialize
	
	public Board(Room[][] rooms)
	{
		this.rooms = rooms;
	}
	
	public Board(int size)
	{
		this.rooms = new Room[6][6];
	}
	
	public void printBoard()	//can void be nonstatic?
	{
		for(Room[] i : rooms)
		{
			for(Room room: i)
			{
				room.print();		//need to write a print method in the print class
			}
		} 
		System.out.println();	//each row gets a line in between
		
	}
	
	public Room[][] getRooms() {
		return rooms;
	}
	
	public void setRooms(Room[][] rooms) {
		this.rooms = rooms;
	}
}

