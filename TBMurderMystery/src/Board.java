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
		System.out.println("[X][M][M][X]\r\n" + 
				"[K][H][H][R]\r\n" + 
				"[S][H][H][R]\r\n" + 
				"[S][H][H][X]\r\n" + 
				"[X][H][H][N]\r\n" + 
				"[B][H][H][N]\r\n" + 
				"[X][H][H][X]\r\n" + 
				"[D][H][H][G]\r\n" + 
				"[D][H][H][X]\r\n" + 
				"[X][F][X][X]");
		
	}
	
	public Room[][] getRooms() {
		return rooms;
	}
	
	public void setRooms(Room[][] rooms) {
		this.rooms = rooms;
	}
}

