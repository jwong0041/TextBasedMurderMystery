package room;

import people.Person;

public class ScienceLab extends Room {
	Person occupant;
	int xLoc;
	int yLoc;
	private boolean explored = false;
	
		public ScienceLab(int x, int y)
		{
			super(x,y);
			this.xLoc = x;
			this.yLoc = y;
			
		}
		
		public void enterRoom(Person x)
		{
			occupant = x;
			x.setxLoc(this.xLoc);
			x.setyLoc(this.yLoc);
			if(explored == false) {
				System.out.println("As you walk into the Science Lab you \r\n"
						+ "see a shadow quickly sit down. He turns the chair and speaks \r\n"
						+ "Unknown: How may I help you? I haven't seen you around here before \r\n"
						+ "You: I was travelling when I happened to get caught up in the downpour. \r\n"
						+ "As if luck was smiling upon me I found this mansion located nearby so I \r\n"
						+ "decided to seek shelter from the elements here. \r\n"
						+ "Unknown: Oh...I see. Well I guess I should introduce myself, I'm"
						+ "Yamato Shunjei the well known freeloader of this mansion, who also \r\n"
						+ "happens to be the nephew of the owner of this mansion. \r\n"
						+ "You spot a large assortment of scientific instruments scattered \r\n"
						+ "throughout the room. \r\n"
						+ "You: Do you enjoy the studying the sciences? \r\n"
						+ "Shunjei: I guess. I graduated from MIT and I am currently hoping to find \r\n"
						+ "a career producing scientific equipment for the disabled. \r\n"
						+ "Well enough about me lets go get some food, dinnertime has already come. \r\n"
						+ " ");
			} else {
			System.out.println("");
			}
			explored = true;
		}
		
		public void leaveRoom (Person x)
		{
			occupant = null;
		}
	}



