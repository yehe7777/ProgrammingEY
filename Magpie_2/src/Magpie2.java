public class Magpie2

{
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	public String getResponse(String statement)
	{
		String response = "";
		
		if (statement.length() == 0) {
			response = "Say something, please.";
		}
		
		if (findKeyword(statement, "no") >= 0)
		{
			response = "Why so negative?";
		}

		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}


		else if (findKeyword(statement,"ape",0) >= 0
				||findKeyword(statement,"bear",0) >= 0
				|| findKeyword(statement,"yak",0) >= 0
				|| findKeyword(statement,"ai",0) >= 0)
		{
			response = "Tell me more about your zoo.";
		}
		
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	
	private int findKeyword(String statement, String goal, int startPos)
	{
		String phrase = statement.trim().toLowerCase();
		int psn = phrase.indexOf(goal, startPos);
		
		String before = "";
		String after = "";
		while(psn >= 0 && psn < phrase.length()) {
			if(psn > 0) {
				before = String.valueOf(phrase.charAt(psn - 1));
			}
			if(goal.length() <= phrase.length()-(psn+1)) {
				after = String.valueOf(phrase.charAt(psn + goal.length()));
			}
			if((before.compareTo("A") < 0) && (after.compareTo("A") < 0))	{
				return psn;
			}
			psn += 1;
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
		int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}

		return response;
	}
}	