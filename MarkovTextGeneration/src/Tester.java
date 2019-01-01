import javax.swing.*;

public class Tester {

	private static final int NUM_WORDS_TO_GENERATE = 100;

	public static void main(String[] args) {
		TextModel model = new TextModel(); // create your model
		model.loadPairData("shakespeare.txt"); // load the data

		String generatedOutput = "";

		String currentWord = "From fairest"; // Choose starting word
		generatedOutput += currentWord;

		for (int i = 0; i < NUM_WORDS_TO_GENERATE; i++) {
			String nextWord = model.simulate2NextWord(currentWord);
			nextWord = nextWord.substring(nextWord.indexOf(" ")+1, nextWord.length());

			//System.out.println(nextWord);
			//System.out.println(currentWord);
			generatedOutput += " " + nextWord.substring(nextWord.indexOf(" ")+1, nextWord.length());

			if (i % 8 == 0)
				generatedOutput += "\n"; // add some line breaks in the output
			currentWord = nextWord;
		}

		System.out.println(generatedOutput);
	}
}
