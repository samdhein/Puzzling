import java.util.ArrayList;
import java.util.Random;
public class TestPuzzleJava {
    
	public static void main(String[] args) {
		PuzzleJava generator = new PuzzleJava();

		//getTenRolls method
		ArrayList<Integer> randomRolls = generator.getTenRolls();
		System.out.println(randomRolls);
		
		//getRandomLetter method
		String randomLetter = generator.getRandomLetter();
		System.out.println(randomLetter);

		//generatePassword method
		String password = generator.generatePassword();
		System.out.println(password);

		// getNewPasswordSet method
		ArrayList<String> passwordSet = generator.getNewPasswordSet(8);
		System.out.println(passwordSet);

    	//..
		// Write your other test cases here.
		//..
	}
}
