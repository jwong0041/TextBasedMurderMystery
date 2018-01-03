import people.Detective;
import people.Person;
import room.Room;
import room.Wall;

import java.util.Scanner;
import room.FrontDoor;
import room.Hallway;
import room.DiningRoom;


public class Runner 
{
	public boolean locked;
	public static boolean testMove(String move, Person p, Room[][] map)
	{
		move = move.toLowerCase().trim();
		switch (move) {
			case "w":
				if ((p.getxLoc() > 0) && (map[p.getxLoc()-1][p.getyLoc()].locked() == false))
				{
					
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc()-1][p.getyLoc()].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}
			case "n":
				if (p.getyLoc()< 9)
				{
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc()][p.getyLoc() + 1].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}

			case "e":
				if (p.getxLoc() < map.length - 1)
				{
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc()+1][p.getyLoc()].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}

			case "s":
				if (p.getyLoc() > 0)
				{
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc()][p.getyLoc()-1].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}
			default:
				break;
					
		}
		return true;
	}
	
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
//System.out.println("Butler: Welcome to the mansion of " + Master.getFamilyName());
		System.out.println("Maid: We are glad that you didn't get soaked in the rain.\r\n" +
					"Butler: I noticed your trench coat... Are you a detective? \r\n");
		System.out.println(""); 
		System.out.println("Yes, my name is.... \r\n" +
					"...What is your first name?"); 
		Scanner sc = new Scanner(System.in);
		String firstName = sc.nextLine();
		System.out.println("What is your family name?");
		Scanner sc1 = new Scanner(System.in);
		String familyName = sc1.nextLine();
		String title = "Detective";
		
		Detective player1 = new Detective(firstName, familyName, title, 1, 10);
		
		
		System.out.println(player1.getFirstName() + " " + player1.getFamilyName());
		System.out.println("Butler: " + player1.getTitle() + player1.getFamilyName() + ", there is a ghost haunting our mansion. \r\n" +
					"Maid: Hush! Theres no way ghosts exists... \r\n" +
					"You see sweat forming on her forehead.");
		System.out.println("");
		System.out.println("You hear a car being parked outside in the rain. \r\n" +
					"A young man walks into the mansion. \r\n" +
					"Maid and Butler: Welcome back. \r\n" +
					"He walks away without responding.");
		System.out.println("");								//add nephew name again
		System.out.println("Maid: That was Master's nephew, " + ". \r\n" +
					"Butler: He spends most of his time in his laboratory. \r\n" +
					"You: What about your master? \r\n" +
					"They are a little hesitant in telling you. \r\n" +
					"Maid: ... Master " + " lost his wife recently... \r\n" +
					"Butler: We are getting worried for him because he's started to see her ghost... \r\n" +
					"Her ghost?... Before you can ask about anything the phone rings. \r\n" +
					"Butler: Hello?... Yes... Yes... No problem. " + player1.getTitle() + " " + player1.getFamilyName() + ", the young master wants to see you. \r\n" +
					"Butler: Please meet him in his Science Lab. Take 6 steps forward and it should be to your left. \r\n" +
					"You: Ok lol.");
		
		Board gameBoard = new Board(10,10);
		gameBoard.test();
		gameBoard.startBoard(gameBoard.test());
		Scanner in = new Scanner(System.in);
		boolean gameOn = true;
		gameBoard.test()[1][0].enterRoom(player1);
		//room.setExplored(true);
		int n0 = 0;
		int n1 = 1;
		int n2 = 2;
		int n3 = 3;
		int n4 = 4;
		int n5 = 5;
		int n6 = 6;
		int n7 = 7;
		int n8 = 8;
		int n9 = 9;
		
		gameBoard.test()[n1][n0] = new FrontDoor(n1, n0);
		gameBoard.test()[n1][n1] = new Hallway(n1, n1);
		gameBoard.test()[n1][n2] = new Hallway(n1, n2);
		gameBoard.test()[n1][n3] = new Hallway(n1, n3);
		gameBoard.test()[n1][n4] = new Hallway(n1, n4);
		gameBoard.test()[n1][n5] = new Hallway(n1, n5);
		gameBoard.test()[n1][n6] = new Hallway(n1, n6);
		gameBoard.test()[n1][n7] = new Hallway(n1, n7);
		gameBoard.test()[n1][n8] = new Hallway(n1, n8);
		gameBoard.test()[n2][n1] = new Hallway(n2, n1);
		gameBoard.test()[n2][n2] = new Hallway(n2, n2);
		gameBoard.test()[n2][n3] = new Hallway(n2, n3);
		gameBoard.test()[n2][n4] = new Hallway(n2, n4);
		gameBoard.test()[n2][n5] = new Hallway(n2, n5);
		gameBoard.test()[n2][n6] = new Hallway(n2, n6);
		gameBoard.test()[n2][n7] = new Hallway(n2, n7);
		gameBoard.test()[n2][n8] = new Hallway(n2, n8);
		gameBoard.test()[n0][n1] = new DiningRoom(n0, n1);
		gameBoard.test()[n0][n2] = new DiningRoom(n0, n2);
		gameBoard.test()[n0][n0] = new Wall(n0, n0);
		
		int counter = 0;
		while(gameOn)	
		{
			System.out.println("Please choose where you would like to move");
			String move = in.nextLine();
			if(testMove(move, player1, gameBoard.test())) 
				{
					System.out.println("Your position is " + player1.getxLoc() + ", " + player1.getyLoc());
					counter++;
				} else {
					System.out.println("Please choose a valid move.");
				}
		
		if (counter == 125)
		{
			System.out.println("You took too long to find the culprit.\n"
								+ "The Master of the household has died.\n"
								+ "- G A M E   O V E R -");
			gameOn = false;
		}	
			
			
			
	}

}
}


