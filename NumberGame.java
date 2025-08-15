import java.util.*;
public class NumberGame {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int chance = 10;
        int score = 0;
        boolean playAgain = true;
        System.out.println("Welcome to this game world!");
        System.out.println("Hey Kid! You have around " + chance + " chances to win the game...");
        while (playAgain) {
            int random = getRandomN(1, 100);
            boolean guess = false;
            for (int i = 0; i < chance; i++) {
                System.out.print("Chance " + (i + 1) + " - Enter your guess: ");
                int user = obj.nextInt();
                if (user == random) {
                    guess = true;
                    score += 1;
                    System.out.println("Congo! You won it!");
                    break;
                } else if (user > random) {
                    System.out.println("The number is too high...");
                } else {
                    System.out.println("The number is too low...");
                }
            }
            if (!guess) 
            {
                System.out.println("Oops! You lost the chances! The number was: " + random);
            }

            System.out.print("Do you want to play again? (y/n): ");
            String rerun = obj.next();
            playAgain = rerun.equalsIgnoreCase("y");
        }

        System.out.println("That's it kid. Hope you enjoyed it!");
        System.out.println("Here is your final score: " + score);
    }
    public static int getRandomN(int min, int max) 
    {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}