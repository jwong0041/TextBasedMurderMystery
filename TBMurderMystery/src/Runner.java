import people.Detective;
import people.Person;
import room.Room;
import room.ScienceLab;
import room.Wall;

import java.util.Scanner;
import room.FrontDoor;
import room.Hallway;
import room.Kitchen;
import room.MastersRoom;
import room.MastersStudy;
import room.NephewRoom;
import room.DiningRoom;
import room.GuestRoom;
import room.Bathroom;

public class Runner 
{
	public static boolean gameOn = true;
	public boolean locked;
	public static boolean testMove(String move, Person p, Room[][] map)
	{
		move = move.toLowerCase().trim();
		switch (move) {
			case "a":
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
			case "w":
				if ((p.getyLoc()< 9) && (map[p.getxLoc()][p.getyLoc() + 1].locked() == false))
				{
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc()][p.getyLoc() + 1].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}

			case "d":
				if ((p.getxLoc() < 3) && (map[p.getxLoc()+1][p.getyLoc()].locked() == false))
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
				if ((p.getyLoc() > 0) && (map[p.getxLoc()][p.getyLoc()-1].locked() == false))
				{
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc()][p.getyLoc()-1].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}
				
			case "map":
				System.out.println("[X][M][M][X]\r\n" + 
						"[K][H][H][R]\r\n" + 
						"[S][H][H][R]\r\n" + 
						"[S][H][H][X]\r\n" + 
						"[X][H][H][N]\r\n" + 
						"[B][H][H][N]\r\n" + 
						"[X][H][H][X]\r\n" + 
						"[D][H][H][G]\r\n" + 
						"[D][H][H][X]\r\n" + 
						"[X][F][X][X]\r\n"
						+ "M: Master’s Study | F: Front door | R: Master’s Room	\r\n"
						+ "H: Hallway | K: Kitchen | X:Wall | S: Science Lab | B: Bathroom \r\n"
						+ "D: Dining Room | G: Guestroom | N: Nephew’s Room\r\n"
						+ "");
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
		System.out.println("  Maid: We are glad that you didn't get soaked in the rain.\r\n" +
					"  Butler: I noticed your trench coat... Are you a detective? \r\n");
		System.out.println(""); 
		System.out.println("Yes, my name is.... \r\n" +
					"{Enter your first name.}"); 
		Scanner sc = new Scanner(System.in);
		String firstName = sc.nextLine();
		System.out.println("{Enter your family name.}");
		Scanner sc1 = new Scanner(System.in);
		String familyName = sc1.nextLine();
		String title = "Detective";
		
		Detective player1 = new Detective(firstName, familyName, title, 1, 10);
		
		
		System.out.println(player1.getFirstName() + " " + player1.getFamilyName());
		System.out.println("   Butler: " + player1.getTitle() + " " + player1.getFamilyName() + ", there is a ghost haunting our mansion. \r\n" +
					"   Maid: Hush! Theres no way ghosts exists... \r\n" +
					"You see sweat forming on her forehead and she fidgets nervously.");
		System.out.println("");
		System.out.println("You hear a car being parked outside in the rain. \r\n" +
					"A young man walks into the mansion. \r\n" +
					"   Maid and Butler: Welcome back. \r\n" +
					"He walks away without responding.");
		System.out.println("");								//add nephew name again
		System.out.println("   Maid: That was Master's nephew." +
					"   Butler: He spends most of his time in his laboratory. \r\n" +
					"You: What about your master? \r\n" +
					"They are a little hesitant in telling you. \r\n" +
					"   Maid: ... Master lost his wife recently. \r\n" +
					"   Butler: We are getting worried for him because he says he started to see her ghost... \r\n" +
					"Her ghost?... \r\n" +
					"   Maid: Anyway, that nonesense aside, we have a meal prepared, feel free to come to the dining room ,\r\n" +
					"we have more than enough for an additional person. \r\n" +
					"[The Dining Rooms are (0, 1) and (0, 2)] \r\n");
		
		Board gameBoard = new Board(4,10);
		gameBoard.test();
		gameBoard.startBoard(gameBoard.test());
		Scanner in = new Scanner(System.in);
		gameBoard.test()[1][0].enterRoom(player1);
		gameBoard.test()[1][0] = new FrontDoor(1, 0);
		gameBoard.test()[1][1] = new Hallway(1, 1);
		gameBoard.test()[1][2] = new Hallway(1, 2);
		gameBoard.test()[1][3] = new Hallway(1, 3);
		gameBoard.test()[1][4] = new Hallway(1, 4);
		gameBoard.test()[1][5] = new Hallway(1, 5);
		gameBoard.test()[1][6] = new Hallway(1, 6);
		gameBoard.test()[1][7] = new Hallway(1, 7);
		gameBoard.test()[1][8] = new Hallway(1, 8);
		gameBoard.test()[2][1] = new Hallway(2, 1);
		gameBoard.test()[2][2] = new Hallway(2, 2);
		gameBoard.test()[2][3] = new Hallway(2, 3);
		gameBoard.test()[2][4] = new Hallway(2, 4);
		gameBoard.test()[2][5] = new Hallway(2, 5);
		gameBoard.test()[2][6] = new Hallway(2, 6);
		gameBoard.test()[2][7] = new Hallway(2, 7);
		gameBoard.test()[2][8] = new Hallway(2, 8);
		gameBoard.test()[0][1] = new DiningRoom(0, 1);
		gameBoard.test()[0][2] = new DiningRoom(0, 2);
		gameBoard.test()[0][0] = new Wall(0, 0);
		gameBoard.test()[0][3] = new Wall(0, 3);
		gameBoard.test()[0][5] = new Wall(0, 5);
		gameBoard.test()[0][9] = new Wall(0, 9);
		gameBoard.test()[2][0] = new Wall(2, 0);
		gameBoard.test()[3][0] = new Wall(3, 0);
		gameBoard.test()[3][1] = new Wall(3, 1);
		gameBoard.test()[3][3] = new Wall(3, 3);
		gameBoard.test()[3][6] = new Wall(3, 6);
		gameBoard.test()[3][9] = new Wall(3, 9);
		gameBoard.test()[3][2] = new GuestRoom(3, 2);
		gameBoard.test()[0][4] = new Bathroom(0, 4);
		gameBoard.test()[3][4] = new NephewRoom(3, 4);
		gameBoard.test()[3][5] = new NephewRoom(3, 5);
		gameBoard.test()[3][7] = new MastersRoom(3, 7);
		gameBoard.test()[3][8] = new MastersRoom(3, 8);
		gameBoard.test()[2][9] = new MastersStudy(2, 9);
		gameBoard.test()[1][9] = new MastersStudy(1, 9);
		gameBoard.test()[0][6] = new ScienceLab(0, 6);
		gameBoard.test()[0][7] = new ScienceLab(0, 7);
		gameBoard.test()[0][8] = new Kitchen(0, 8);
		
		int counter = 0;
		while(gameOn)	
		{

			System.out.println("Please choose where you would like to move using {W, A, S, D}\r\n"

					+ "If you would like a map, use 'map'.");
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
