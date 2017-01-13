package collazo.albert.TooLargeTooSmall;

import java.util.Scanner;
import java.util.Random;

public class TooLargeTooSmall {
    boolean win = false;
    int guesses = 0;

    public static void main(String[] args){
        TooLargeTooSmall number = new TooLargeTooSmall();
        number.userInput();
    }

    public String guessNumber(int num){

        Random randNum = new Random();
        int magicNumber = randNum.nextInt(5);
        guesses++;

            if (num == magicNumber) {
                win = true;
                System.out.println("You got it dude!");
            } else if (num < magicNumber) {
                System.out.println("Nope! Try again, too low!");
            } else if (num > magicNumber){
                System.out.println("No way! Try again, too high!");
            }

        return "Here are your guesses: "+guesses;
    }

    public int userInput(){
        while (win==false) {
            Scanner input = new Scanner(System.in);
            System.out.println("I'm thinking of a number between 1 and 5, what is it?");

            int userGuess = input.nextInt();

            System.out.println(guessNumber(userGuess));
        }
        return 0;
    }

}
