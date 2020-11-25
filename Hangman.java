import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Hangman {
    
    public static void game(ArrayList<String> words) {
        Random num = new Random();
        String chosenword = words.get(num.nextInt(6));

        int score = 0;
        Scanner guesser = new Scanner(System.in);
        while(score < chosenword.length()) {
            System.out.println("You have " + chosenword.length() + " letters left to guess.");
            String guess = guesser.nextLine();
            if(chosenword.indexOf(guess) == -1) {
                //hint code
                System.out.println("You got it wrong, try again bud");
            }
            else {
                int dupecounter = 0;
                while(chosenword.indexOf(guess) != -1) {
                    chosenword = chosenword.replaceFirst(guess, "");
                    dupecounter++;
                    
                    System.out.println("You got it right, good work!");
                    
                }

            }

        }

        
    }
}
