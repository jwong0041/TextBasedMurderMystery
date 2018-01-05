package people;

import java.util.Random;

public class Maid extends Person
{
	private int xLoc, yLoc;
	
	public Maid(int xLoc, int yLoc) 
	{
		// TODO Auto-generated constructor stub
		this.xLoc = 0;
		this.yLoc = 8;
		//she should be in the kitchen x = 0, y = 8
	}


	public String getGreeting()
	{
		return "Oh, hello Mister Detective. Would you like to ask me anything?\n"
				+ "Ask the maid about:\n (Please type one of the following)\n"
				+ "- Ghost\n"
				+ "- Nephew\n"
				+ "- Master\n"
				+ "- Maid\n";
	}

	public String getResponse(String statement)
	{
		String response = "";
		
		if (statement.length() == 0)
		{
			response = "Please choose one of the following options";
		}

		else if (findKeyword(statement, "levin") >= 0)
		{
			response = "More like LevinTheDream amiright?";
		}

		else if (findKeyword(statement, "Ghost") >= 0)
		{
			response = "The Master started seeing the Ghost a few months ago."
					+ "Ah, I believe it was around the same time the green house you were hiding under was first set up."
					+ "I believe that it's all fake. There's no way that ghosts are real.\n"
					+ "The thought of the ghost being the late mistress really worries. Oh because... uh, its unhealthy for the Master.\n"
					+ "There's no way way a ghost could talk right?! \n\t[She seems to be getting really nervous. Maybe you should stop now.]";
		}	
		
		else if (findKeyword(statement, "Nephew") >= 0)
		{
			response = "The young master has been staying here for a long time now. He has been living under the Masters wing for so many years now.\n"
					+ "Between you and me, the young master is just mooching off of the Master. He doesn't offer anything for this household, he even took up a few rooms for his Science Lab.\n"
					+ "\t[The Science Lab is at (0, 6) and (0, 7)]\n"
					+ "He keeps all of his materials in that room too, his science machines and cupboard full of dangerous chemicals!";
		}	
		
		else if (findKeyword(statement, "Master") >= 0)
		{
			response = "The Master has been livining in this house for many years now.\n"
					+ "He employed me when he and his, now late, wife first bought this manor.\n"
					+ "He's a strict man, and so was his wife. She was bound to a wheelchair but loved to paint the scenery around here.\n"
					+ "The Master cared for her deeply, and was devestated when she died.\n"
					+ "I think she died when her wheelchair brakes stopped working and she fell off the cliff. Uh, thats, at least what I heard.\n"
					+ "\t[She starts to look away and refuses to make eye contact. This would be a good time to stop.]";
		}	
		
		else if (findKeyword(statement, "Maid") >= 0)
		{
			response = "Me? Oh I'm just a little old maid hired by two welathy people.\n"
					+ "I do all of the cooking, so that's that I'm here in the Kitchen a lot.\n"
					+ "I also did the maintenence for the mistresses wheelchair back when she was still alive.\n"
					+ "The Master was kind enough to hire me for all these years, but he and his wife were anything but kind.\n"
					+ "He is a strict and, in my opinion, quite selfish, just like his late wife.\n"
					+ "Oh but I shouldn't be saying too much! What if the ghost hears me and gets angry!\n"
					+ "But that's nonsense, ghosts don't exist...\n"
					+ "\t[She starts mumbling to herself, you should stop for now.]";
		}	
		
		else
		{
			response = "Please choose one of the following options";
		}
		
		return response;
	}
	
	
	
	
	
	
	
	
	private int findKeyword(String statement, String goal,
			int startPos)
	{
		String phrase = statement.trim().toLowerCase();
		goal = goal.toLowerCase();

		// The only change to incorporate the startPos is in
		// the line below
		int psn = phrase.indexOf(goal, startPos);

		// Refinement--make sure the goal isn't part of a
		// word
		while (psn >= 0)
		{
			// Find the string of length 1 before and after
			// the word
			String before = " ", after = " ";
			if (psn > 0)
			{
				before = phrase.substring(psn - 1, psn);
			}
			if (psn + goal.length() < phrase.length())
			{
				after = phrase.substring(
						psn + goal.length(),
						psn + goal.length() + 1);
			}

			// If before and after aren't letters, we've
			// found the word
			if (((before.compareTo("a") < 0) || (before
					.compareTo("z") > 0)) // before is not a
											// letter
					&& ((after.compareTo("a") < 0) || (after
							.compareTo("z") > 0)))
			{
				return psn;
			}

			// The last position didn't work, so let's find
			// the next, if there is one.
			psn = phrase.indexOf(goal, psn + 1);

		}

		return -1;
	}
	
	private int findKeyword(String statement, String goal)
	{
		return findKeyword (statement, goal, 0);
	}

}
