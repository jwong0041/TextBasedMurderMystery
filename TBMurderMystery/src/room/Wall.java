package room;

import people.Person;

public class Wall extends Room {
	
	private int xLoc, yLoc;
	Person occupant;;
	
	public Wall (int x, int y) {
		super(x, y);
		this.xLoc = x;
		this.yLoc = y;
	}

	@Override
	public boolean locked() {
		return true;
	}
	
	//please avoid walking into walls. it hurts and you're not Houdini.
}
