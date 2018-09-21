import java.util.Scanner;

public class NumberGuessingGame {


    public static void main(String[]args){


        Scanner keyboard;
        int pickedNumber;
        int guessedNumber;
        boolean gotItRight;

        pickedNumber = (int)(Math.random()*100);
        keyboard = new Scanner(System.in);
        gotItRight = false;

        //System.out.println(pickedNumber);
        System.out.println("Please guess a number.");
        guessedNumber = keyboard.nextInt();

        while(!gotItRight) {


            if (guessedNumber < pickedNumber) {
                System.out.println("Your number is too low.");

            } else if (guessedNumber > pickedNumber) {
                System.out.println("You number is too high.");

            } else if (guessedNumber == pickedNumber) {
                System.out.println("You guessed right! Congratulations!");

                 gotItRight = true;
                 break;
            }

            System.out.println("Please guess again.");
            guessedNumber = keyboard.nextInt();

        }
        //System.out.println("I am now below the while loop");

    }


}
