/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1ex2;
import java.util.Scanner;
/**
 *
 * @author MUON
 */
public class Q1Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //while (true) [NOTE: possible loop for QoL features
        //generates answer
        
        //see if win condition is met
        
        //main gameplay loop
        while (true){
            int answer = (int) Math.floor(Math.random()*10) + 1;
            boolean didYouWin = false;
            
            for(int guessCount = 3; guessCount !=0;guessCount--){
                System.out.printf("You have %d guess(es) left. What is your guess: ", guessCount);
                int guess = sc.nextInt();
                System.out.printf("%n%d%n", guess);
            }
            break;
        }
    }
    
}
