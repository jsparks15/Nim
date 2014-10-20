//Jacob Sparks

import java.util.Scanner;
public class NimDriver{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    boolean win = false;
    System.out.println("How many pieces do you want to play with?"); // lets you choose the number of tiles
    int startnum = input.nextInt();
    int pieces;
    int playermove;
    NimGame test = new NimGame();
    pieces = startnum; // uses the imput you chose for your file
    while (pieces > 1){
      System.out.println("There are " + pieces + " pieces remaining.");
      System.out.println("Enter your move: ");
      playermove = input.nextInt();
      while ((playermove < 1) || (playermove > 2)){ //checks to see if number is within range
        System.out.println("Please enter 1 or 2: "); // only lets you take 1 or 2
        playermove = input.nextInt();
      }
      pieces -= playermove;
      if (pieces == 1){ // lets you know who wins
        System.out.println("Computer loses.");
      }
      else System.out.println("There are " + pieces + " pieces remaining.");
      pieces -= test.play(pieces);
      if (pieces == 1){ // lets you know who wins the game
        System.out.println("You lose.");
      }
    }
  }
}