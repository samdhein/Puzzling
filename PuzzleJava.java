import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava{
    Random randMachine = new Random();

    public ArrayList<Integer> getTenRolls(){
        ArrayList<Integer> randomRolls = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            randomRolls.add(randMachine.nextInt(19)+1);
        }
        return randomRolls;
    }

    public String getRandomLetter(){
        String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
        "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String randomLetter = letters[(randMachine.nextInt(25)+1)];
        return randomLetter;
    }

    // implement StringBuilder to build a string as they are normally immutable
    public String generatePassword(){
        StringBuilder password = new StringBuilder("");
        for (int i = 0; i < 8; i++){
            String randLetter = getRandomLetter();
            password.append(randLetter);
        }
        // convert StringBuilder to String
        return password.toString();
    }
    public ArrayList<String> getNewPasswordSet(int arrLength){
        ArrayList<String> passwordSet = new ArrayList<String>();
        for (int i = 0; i < arrLength; i++){
            passwordSet.add(generatePassword());
        }
        return passwordSet;
    }
}