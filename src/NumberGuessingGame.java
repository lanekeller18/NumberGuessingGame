import java.util.Scanner;

public class NumberGuessingGame {


    public static void main(String[]args){


        Scanner keyboard;
        int pickedNumber;
        int guessedNumber;

        pickedNumber = (int)(Math.random()*100);
        keyboard = new Scanner(System.in);

        System.out.println(pickedNumber);
        System.out.println("Please guess a number.");
        guessedNumber = keyboard.nextInt();


        if (guessedNumber<pickedNumber){
            System.out.println("Your number is too low.");
            System.out.println("Please guess again.");
            guessedNumber = keyboard.nextInt();
        }
        else if (guessedNumber>pickedNumber){
            System.out.println("You number is too high.");
            System.out.println("Please guess again.");
            guessedNumber = keyboard.nextInt();
        }
        else if (guessedNumber==pickedNumber){
            System.out.println("You guessed right! Congratulations!");
        }

    }


}
