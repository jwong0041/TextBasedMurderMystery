import people.Detective;
import people.Person;
import room.Room;
import java.util.Scanner;
import room.FrontDoor;

public class Runner 
{
	public static boolean testMove(String move, Person p, Room[][] map)
	{
		move = move.toLowerCase().trim();
		switch (move) {
			case "s":
				if (p.getxLoc() > 0)
				{
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc()-1][p.getyLoc()].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}
			case "e":
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

			case "n":
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

			case "w":
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
		String title = "Mr.";
		
		Detective player1 = new Detective(firstName, familyName, title, 1, 10);
		
		
		System.out.println(player1.getFirstName()+ player1.getFamilyName());
		System.out.println("Butler: " + player1.getTitle() + player1.getFamilyName() + ", there is a ghost haunting our mansion. \r\n" +
					"Maid: Hush! Theres no way ghosts exists... \r\n" +
					"You see sweat forming on her forehead.");
		System.out.println("");
		System.out.println("You hear a car being parked outside in the rain. \r\n" +
					"A young man walks into the mansion. \r\n" +
					"Maid and Butler");
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
		
		
		
		int counter = -2;
		while(gameOn)	
		{
			System.out.println("Please choose where you would like to move");
			String move = in.nextLine();
			if(testMove(move, player1, gameBoard.test())) 
				{
					System.out.println("Your position is " + player1.getxLoc() + ", " + player1.getyLoc());
					
				} else {
					System.out.println("Please choose a valid move.");
				}
		}
			
			
			
			
	}

		}



