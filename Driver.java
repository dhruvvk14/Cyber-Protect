public class Driver {
//testing file to test if this will work
	public static void main(String[] args) {		
		Question[] q = QuestionManager.getQuestion(); //get the question array.
		for(Question question : q) {
			System.out.println(question.toText());
		}
	}
}
