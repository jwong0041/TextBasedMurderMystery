import room.Room;

public class Board 
{
	private Room [][] rooms; //declare but don't initialize
	
	public void startBoard(Room[][] x)
	{
		Room[][]map = x;
		for (int x1 = 0; x1<map.length; x1++)
		{
			for (int y = 0; y < map[x1].length; y++)
			{
				map[x1][y] = new Room(x1,y);
			}
		}
	}
	public Room[][] test() {
		Room[][] map = rooms;
		return map;
	}
	public Board(Room[][] rooms)
	{
		this.rooms = rooms;
	}
	
	public Board(int x, int y)
	{
		this.rooms = new Room[x][y];
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

