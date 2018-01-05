package room;
import people.Person;

public class Hallway extends Room {
	Person occupant;
	int xLoc;
	int yLoc;
	
	public Hallway (int x, int y)
	{
		super(x,y);
		this.xLoc = x;
		this.yLoc = y;
	}
	
	@Override
	public void enterRoom (Person x)
	{
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		System.out.println("The Hallway seems to expand forever");
	}
	
	public void leaveRoom (Person x)
	{
		occupant = null;
	}
}


// txt for hallway after guest room
/* System.out.println("You hear a squeak nearby. When you turn to look for the source of the sound, \r\n" +
 * 						"you see a rusty wheelchair moving.");
 * 
 *  this one for the room right next to the studyroom
 *  System.out.println("You continue to walk until you spot the study room. \r\n" +
 *  					"Curious to see what the Master was talking about, you peek into the study room. \r\n" +
 *  					"Is that a... ghost? \r\n" +
 *  					"...Who's voice is that? It doesn't sound like the maid's.);
 *  wait this thing vvvv should go in the science lab maybe?
 *  System.out.println("You continue to walk down the hallway when you stop by the science lab. \r\n" +
 *  					"You walk around while the maid is vacuuming, and spot a bottle with a label that says 'XXX POISON' \r\n" +
 *  					"Poison?... Why is something like that around here?" +
 *  					"You quickly switch out the poison for salt, just in case something happens. \r\n" +
 *  					"Maid: It's almost time for their tea break, would you like to join them? \r\n" +
 *  					"You: Sure lol");
 *  enter dining room again?
 *  System.out.println("The maid pours out some tea for the master, while you and the nephew get orange juice. \r\n" +
 *  					"Out of nowhere, the master spits out his tea. \r\n" +
 *  					"Master: Why does this taste so bad?????? \r\n" +
 *  					"You hear a gasp from the maid, and then everything clicks.");
 */