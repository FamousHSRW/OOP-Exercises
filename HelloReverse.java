public class HelloReverse {
	public static void main(String[] args) {
		String sentence = System.console().readLine();
		int sentenceLength = sentence.length();
		int i = 1;
		char[] sentenceArray = sentence.toCharArray();
		String newSentence = "";	
		while( i <= sentenceLength) {
			newSentence += sentenceArray[sentenceLength - i];
			i++;
		}
		System.out.println(newSentence);
	}
}
