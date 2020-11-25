import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Hangman {
    
    public static void main(String[] args) {
        ArrayList<String> word = new ArrayList<String>();
        word.add("dab");
        word.add("swag");
        word.add("gamer");
        word.add("warren");
        word.add("lolxdxd");

        String phrase = "lolxdxd";
        System.out.println(phrase);
        String newphrase = phrase.replaceFirst("xd", "");
        System.out.println(newphrase);
        //System.out.println(phrase.indexOf("xd"));
    
        Random n = new Random();
        System.out.println(n.nextInt(7));
        /*
        Scanner swag = new Scanner(System.in);
        String bad = swag.nextLine();
        String ree = swag.nextLine();
        System.out.println(bad + ree);
        swag.close();
        

        String test = "warren is swag i think";
        System.out.println(test.indexOf("s"));
        String finder = "swag";
        System.out.println(test.substring(test.indexOf(finder), test.indexOf(finder) + finder.length()));
        System.out.println(test.indexOf("dab"));
        */

        game(word);
        
        
    }


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
