/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Q1Ex2;
import java.util.Scanner;
/**
 *
 * @author Isaac
 */
public class Ex02MuonTan {
    /* Hi isaac */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
      Scanner scanner = new Scanner(System.in);
      //default minimum value
      int min = 1;        
      //default maximum value
      int max = 10;
      //placeholder for guess counter that the user can alter
      int guessCount = 3;
      //main gameplay loop
      while (true){
        //generates answer
        int answer = (int) 
        Math.floor(Math.random()*(max-min))+min;
        //System.out.println("answer: "+answer); //for debug purposes (had to fix a miscalculation that led to some values going above maximum)
        //win condition for Dialogue change
        boolean didYouWin = false;
        //checks if user wants to go to settings
        boolean goToSettings = false;
        //checks if user wants to play
        boolean wannaPlay;
        wannaPlay = true;
        //checks if user wants to start the game
        boolean startGame;
        startGame=false;

        //main menu
        while (true){
          System.out.printf("==HIGHER OR LOWER== %nChoose an Option Below:%n");
          System.out.println("-Play");
          System.out.println("-Settings");
          System.out.println("-Quit");
          String choice = scanner.nextLine();
          if (choice.equalsIgnoreCase("Play")){
            System.out.printf("%nStarting...%n");
            startGame = true;
          }

          else if(choice.equalsIgnoreCase("Settings")){
            
            goToSettings = true;
              
          }
             
          else if (choice.equalsIgnoreCase("quit")){
            wannaPlay = false;
            
          }
          else{
              System.out.println("");
              continue;
          }
          break;
        }//end of main menu
        while (goToSettings){
        
          //prints out tweakable values
          System.out.printf("%n==PARAMETERS==%nminimum guess: [%d]%nmaximum guess: [%d]%nnumber of guesses: [%d]%n%n",min,max, guessCount);
          //prints out options
          System.out.println("==SETTINGS==");
          System.out.println("-Type 'min' to change minimum value");
          System.out.println("-Type 'max' to change maximum value");
          System.out.println("-Type 'guess' to change guess count");
          System.out.println("-Back");
          String changeChoice = scanner.nextLine();
          //start of minimum value changer
          if(changeChoice.equalsIgnoreCase("min")){
            //error handling thing for changing minimum value. also checks to see if min is higher than max
            while (true){
              try{
                System.out.printf("Enter new Value: ");
                min = Integer.parseInt(scanner.nextLine());
                if (min >= max){
                  System.out.println("The new value cannot be higher than the maximum!");
                  continue;
                }
                break;
              } catch (NumberFormatException e){
                  System.out.println ("Not a Number");
                }
         
            }//end of error handler
          }//end of min change
          //start of maximum value changer
          else if(changeChoice.equalsIgnoreCase("max")){
            //error handling thing for changing maximimum value. also checks to see if max is lower than min
            while (true){
            try{
              System.out.printf("Enter new Value: ");
              max = Integer.parseInt(scanner.nextLine());
              if (min >= max){
                System.out.println("The new value cannot be lower than the minimum!");
                continue;
              }
              break;
            } catch (NumberFormatException e){
                System.out.println ("Not a Number");
              }         
            }//end of error handler                            
            }//end of max changer
            //start of guess changer (VERY EXPERIMENTAL AS I DO NOT KNOW ABOUT VARIABLE SCOPE IN JAVA YET)
          else if(changeChoice.equalsIgnoreCase("guess")){
            //error handling thing for changing guess count.
            while (true){
              try{
                System.out.printf("Enter new Value: ");
                guessCount = Integer.parseInt(scanner.nextLine());
                break;
            
              } catch (NumberFormatException e){
                  System.out.println ("Not a Number");
                }         
              }//end of error handler                            
            }//end of guess changer
		
          else if(changeChoice.equalsIgnoreCase("back")){
            //makes the transitions easier to read imo
            System.out.println("");
            break;
          }
          else{
              break;
          }
        }
          
        //checks wannaPlay to see if the user indeed wants to play
        if (!wannaPlay){
            break;
        }
        //checks if user wanted to start the game
        if (startGame){
          continue;
        }
        //main gameplay loop
        while (true){
          for(int guessesRemaining = guessCount; guessesRemaining !=0;guessesRemaining--){
            int guess = 0;
  
            //error handling thing for guesses
            while (true){
              try{
                System.out.printf("You have %d guess(es) left. The correct number is between %d and %d. What is your guess: ", guessesRemaining, min, max);
                guess = Integer.parseInt(scanner.nextLine());
                if((guess>max)||(guess < min)){
                  System.out.println("Your guess is out of range!");
                  continue;
                }
                break;
              } catch (NumberFormatException e){
                  System.out.println ("Not a Number");
                }
         
              }//end of error handler
              //checks guess against answer
              if (guess == answer){
                System.out.println("You Win!");
                didYouWin = true;
                break;
              }
              else if (guess < answer){
                System.out.printf("Guess Higher!%n%n");
              }
              else{
                System.out.printf("Guess Lower!%n%n");
              }
          }//end of gameplay loop
        //checks to see if player won
          if (!didYouWin){
            System.out.println("You Lose");              
          }
          System.out.print("Play again (y/n): ");
          String playAgain = scanner.nextLine();
          if (playAgain.equalsIgnoreCase("y")){
            //aesthetics
            System.out.println("Restarting...");
            continue;
          }
          break;
        }
          
      }//end of game loop
  }//end of void main
    
}