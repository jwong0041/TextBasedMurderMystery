
public class Board 
{
	private Room [][] rooms; //declare but don't initialize
	
	public Board(Room[][]rooms)
	{
		this.rooms = rooms;
	}
	
	public Board(int size)
	{
		this.rooms = new Room[6][6];
	}
	
	public void printBoard()	//can void be nonstatic?
	{
		for(Room[]i : rooms)
		{
			for(Room x: i)
			{
				x.print();		//need to write a print method in the print class
			}
		} 
		System.out.println();	//each row gets a line in between
	}
	
	Person Detective =  new Detective();
	Detective.setPosition(0, 0, 6);
	Room room = gameboard.getRooms()[0][0];
	//room.setExplored(true);
	
}
