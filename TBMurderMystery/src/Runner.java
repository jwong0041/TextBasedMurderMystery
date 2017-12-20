import people.Master;
import room.Room;

public class Runner 
{
	public static void main(String[] args) 
	{
		System.out.println("You were walking in the woods searching for a light house\r\n" +
							"But your luck fails you and it suddenly starts to rain\r\n" +
							"In the corner of your eye, you see a greenhouse in the far distance\r\n" + 
							"You run towards it before the rain can pour even harder\r\n" + 
							"Next to the greenhouse is a mansion, where you see two people walk out of the door\r\n" + 
							"They are the maid and butler of the mansion, asking you to come inside\r\n" +
							"You gladly accept because of the rain, and you enter the building.");
		System.out.println("");
		System.out.println("Butler: Welcome to the mansion of " + Master.getFamilyName());
		System.out.println("Maid: We are glad that you didn't get soaked in the rain.\r\n" +
							"");
		
		Board 1 = new Board(Room [][] rooms);
	}
}
