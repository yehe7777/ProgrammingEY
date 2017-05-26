public class MagpieP2
{
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	public String getResponse(String statement)
	{
		String response = "";
		if (statement.length() == 0)
		{
			response = "Say something, please.";
		}
		else if (findKeyword(statement, "no", 0) >= 0)
		{
			response = "Why so negative?";
		}
		else if (findKeyword(statement, "mother", 0) >= 0
				|| findKeyword(statement, "father", 0) >= 0
				|| findKeyword(statement, "sister", 0) >= 0
				|| findKeyword(statement, "brother", 0) >= 0)
		{
			response = "Tell me more about your family.";
		}
		else if (findKeyword(statement, "cat", 0) >= 0
				|| findKeyword(statement, "dog", 0) >= 0
				|| findKeyword(statement, "fish", 0) >= 0
				|| findKeyword(statement, "turtle", 0) >= 0)
		{
			response = "Tell me more about your pet.";
		}
		else if (findKeyword(statement, "Robinette", 0) >= 0)
		{
			response = "A ++++ .";
		}
		else if (statement.trim().length() == 0)
		{
			response = "Say something, please";
		}
		// Responses which require transformations
		else if (findKeyword(statement, "I want to", 0) >= 0)
		{
			response = transformIWantToStatement(statement);
		}
		
		else
		{
		// Look for a two word (you <something> me)
		// pattern
			int psn = findKeyword(statement, "you", 0);
			if (psn >= 0
				&& findKeyword(statement, "me", psn) >= 0)
			{
				response = transformYouMeStatement(statement);
			}
			
			else if (0 <= findKeyword(statement, "i")
				&& findKeyword(statement, "i") < psn)
			{
				response = transformIYouStatement(statement);
			}
			else
			{
				response = getRandomResponse();
			}
		}
		return response;	
	}
	
	private String transformIWantToStatement(String statement)
	{
		String phrase = statement.toLowerCase().trim();
		String lastChar = phrase.substring(phrase.length()-1);
		if(lastChar.equals("."))
			phrase = phrase.substring(0,phrase.length()-1);
		int psn = findKeyword(phrase, "I want to ");
		String restOfStatement = phrase.substring(psn + 10).trim();
		return "What would it mean to" + restOfStatement + "?";
	}
	
	private String transformYouMeStatement(String statement)
	{
		String phrase = statement.toLowerCase().trim();
		String lastChar = phrase.substring(phrase.length()-1);
		if(lastChar.equals("."))
			phrase = phrase.substring(0,phrase.length()-1);
		int psnOfYou = findKeyword(phrase, "you");
		int psnOfMe = findKeyword(phrase, "me", psnOfYou + 3);
		String restOfStatement = phrase.substring(psnOfYou + 3, psnOfMe).trim();
		return "What makes you think that I " + restOfStatement + " you?";
	}
	
	private String transformIYouStatement(String statement)
	{
		String phrase = statement.toLowerCase().trim();
		String lastChar = phrase.substring(phrase.length()-1);
		if(lastChar.equals("."))
			phrase = phrase.substring(0,phrase.length()-1);
		int psnOfI = findKeyword(phrase, "i");
		int psnOfYou = findKeyword(phrase, "you", psnOfI + 1);
		String restOfStatement = phrase.substring(psnOfI + 1, psnOfYou).trim();
		return "Why do you " + restOfStatement + " me?";
	}
	
	private int findKeyword(String statement, String goal, int startPos)
	{
		String phrase = statement.toLowerCase().trim();
		goal = goal.toLowerCase();
		int psn = phrase.indexOf(goal, startPos);
		String before = "";
		String after = "";
		while(psn >= 0)
		{
			if(psn > 0)
			{
				before = String.valueOf(phrase.charAt(psn - 1));
			}
			if(goal.length() <= phrase.length() - (psn + 1))
			{
				after = String.valueOf(phrase.charAt(psn + goal.length()));
			}
			if(((before.compareTo("a") < 0) || (before.compareTo("z") >0))
				&& ((after.compareTo("a") < 0) || (after.compareTo("z") > 0)))
			{
				return psn;
			}
			else
			{
				psn = phrase.indexOf(goal, psn + 1);
			}
		}
		return -1;
	}

	private int findKeyword(String statement, String goal)
	{
		return findKeyword(statement, goal, 0);
	}

	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
			response = "Interesting, tell me more.";
		else if (whichResponse == 1)
			response = "Hmmm.";
		else if (whichResponse == 2)
			response = "Do you really think so?";
		else if (whichResponse == 3)
			response = "You don't say....";

		return response;
	}
}