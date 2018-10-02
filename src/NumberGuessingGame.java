import java.util.Scanner;

public class NumberGuessingGame {


    public static void main(String[]args) {


        Scanner keyboard;
        int pickedNumber;
        int guessedNumber;
        boolean gotItRight;
        String again;

        pickedNumber = (int) (Math.random() * 100);
        keyboard = new Scanner(System.in);
        gotItRight = false;



        //System.out.println(pickedNumber

        do {
            System.out.println("Please guess a number.");
            guessedNumber = keyboard.nextInt();




                if (guessedNumber < pickedNumber) {
                    System.out.println("Your number is too low.");

                } else if (guessedNumber > pickedNumber) {
                    System.out.println("You number is too high.");

                } else   {
                    System.out.println("You guessed right! Congratulations!");


                    System.out.println("Would you like to play again?");
                    again = keyboard.next();
                }

                System.out.println("Please guess again.");
                guessedNumber = keyboard.nextInt();



            }while(again.equals("yes")||guessedNumber!=pickedNumber);
            System.out.println("Oh, well then bye.");






        }
    }

