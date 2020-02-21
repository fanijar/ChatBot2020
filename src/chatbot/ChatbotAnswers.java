package chatbot;

public class ChatbotAnswers {
	Choices choices = new Choices();

	public void sadMood() throws Exception {
		System.out.println("CHATBOT: That's a shame! I will try to lift your mood up a little!");
		Thread.sleep(2000);
		System.out.println("CHATBOT: Tell me - what would be the best way to cheer you up?");
		Thread.sleep(2000);
		System.out.println("CHATBOT: Enter your choice: Joke/ Meme/ Song ");

	}

	public void greatMood() throws Exception {
		System.out.println("CHATBOT: That's great!");
		Thread.sleep(1000);
		System.out.println("CHATBOT: Wanna have more fun? Enter: Yes/ No");

	}
	
	public void chooseOne() {
		System.out.println("CHATBOT: Awesome! Choose one: Joke/ Meme/ Song ");
	}

	public void fineMood() throws Exception {
		System.out.println("CHATBOT: Challenge accepted! I will try to make your day better!");
		Thread.sleep(2000);
		System.out.println("CHATBOT: Let me know what would be the best way to cheer you up!");
		Thread.sleep(2000);
		System.out.println("CHATBOT: Enter your choice: Joke/ Meme/ Song ");

	}

	public void userChoosesJoke() throws Exception {
		System.out.println("CHATBOT: Ok! Here's a joke for you: ");
		Thread.sleep(1000);
		System.out.println(choices.getJoke());
		Thread.sleep(3000);

	}

	public void myJobIsDone() {
		System.out.println("CHATBOT: Well, that's great - my job here is done! Keep being awesome! Let's talk another time! :)");
	}

	public void userChoosesMeme() throws Exception {
		System.out.println("CHATBOT: I think that every developer can relate to this meme: ");
		Thread.sleep(3000);
		choices.getMeme();
		Thread.sleep(3000);

	}
	
	public void userChoosesSong() throws Exception {
		System.out.println("CHATBOT: WARNING! This song will definiteley cheer you up!");
		Thread.sleep(3000);
		choices.getSong();
		Thread.sleep(3000);

	}

	public void didThisHelp() {
		System.out.println("CHATBOT: Soooo .... Did this help to cheer you up?");
	}
	
	public void letsTryTomorrow() {
		System.out.println("CHATBOT: Oh, no - I have failed! Let's try tomorrow!");
		
	}
	
	public void elseMemeSong() {
		System.out.println("CHATBOT: Oh, no! That is too bad! I am not giving up just yet - maybe something else could help? Choose one: Meme/ Song ");
	}
	public void elseSong() throws Exception {
		System.out.println("CHATBOT: Oh, no! This Song is my last chance: ");
		Thread.sleep(3000);
		choices.getSong();
		Thread.sleep(3000);
	}
	
	public void elseMeme() throws Exception {
		System.out.println("CHATBOT: I cannot give up! This Meme is my last chance: ");
		Thread.sleep(3000);
		choices.getMeme();
		Thread.sleep(3000);

	}
	
	public void elseJoke() throws Exception {
		System.out.println("CHATBOT: Oh, no! That is too bad! This Joke is my last chance: ");
		Thread.sleep(2000);
		choices.getJoke();
		Thread.sleep(3000);
	}
	
	public void elseJokeMeme() {
		System.out.println("CHATBOT: That is too bad, but I am not giving up just yet - maybe something else could help? Choose one: Joke/ Meme ");
	}
	
	public void elseJokeSong() {
		System.out.println("CHATBOT: Oh, no! Maybe something else could help? Choose one: Joke/ Song ");
	}
	

}
