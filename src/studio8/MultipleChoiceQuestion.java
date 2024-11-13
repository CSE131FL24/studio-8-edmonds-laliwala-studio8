package studio8;

public class MultipleChoiceQuestion extends Question {
	private String[] choices = new String[4];
	
	public MultipleChoiceQuestion(String prompt, String answer, int points, String[] choices) {
		super(prompt,answer,points);
		this.choices = choices;
	}
	
	public void displayPrompt() {
		super.displayPrompt();
		System.out.println("");
		for (int i = 0; i < choices.length; i++) {
			System.out.println(i+1 + ". " + choices[i]);
		}
		System.out.println("");
	}
	
	public String[] getChoices() {
		return choices;
	}
	
	public static void main(String[] args) {
		String[] choices = {"seven", "nine", "eight", "six"};
		Question multipleChoice = new MultipleChoiceQuestion("What studio is this?", "3", 1, choices);
		String[] choices2 = {"3", "four", "3.5", "6"};
		Question multipleChoice2 = new MultipleChoiceQuestion("What is 1 + 2?", "3", 4, choices2);
		multipleChoice.displayPrompt();
		System.out.println(multipleChoice.checkAnswer("hi"));//wrong
		System.out.println(multipleChoice.checkAnswer("1"));//wrong
		System.out.println(multipleChoice.checkAnswer("3"));//right
		System.out.println("");
		multipleChoice2.displayPrompt();
		System.out.println(multipleChoice2.checkAnswer("four"));
		System.out.println(multipleChoice2.checkAnswer("3"));
	}

}
