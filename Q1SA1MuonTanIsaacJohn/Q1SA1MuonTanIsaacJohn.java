/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q1SA1MuonTanIsaacJohn;
import java.util.Scanner;
/**
 *
 * @author MUON
 */
public class Q1SA1MuonTanIsaacJohn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ans = "";
        double schoolRatio, gameRatio, youtubeRatio, socmedRatio;
        double onlineTime=0, offlineTime=0;
        Scanner sc = new Scanner(System.in);
        System.out.printf("How many hours offline for each hour of school? ");
        schoolRatio=Double.parseDouble(sc.nextLine());
        System.out.printf("How many hours offline for each hour of gaming? ");
        gameRatio=Double.parseDouble(sc.nextLine());
        System.out.printf("How many hours offline for each hour of youtube? ");
        youtubeRatio=Double.parseDouble(sc.nextLine());
        System.out.printf("How many hours offline for each hour of social media? ");
        socmedRatio=Double.parseDouble(sc.nextLine());
        while (true){
            double hoursUsed;
            while(true){
                System.out.printf("%nWhat will you do (school, game, youtube, social media)? ");
                ans = sc.nextLine();                
                if(ans.equalsIgnoreCase("school")){
                    System.out.printf("For how many hours? ");
                    hoursUsed = Double.parseDouble(sc.nextLine());
                    onlineTime+=hoursUsed;
                    offlineTime+=hoursUsed*schoolRatio;           
                }
                else if(ans.equalsIgnoreCase("game")){
                    System.out.printf("For how many hours? ");
                    hoursUsed = Double.parseDouble(sc.nextLine());
                    onlineTime+=hoursUsed;
                    offlineTime+=hoursUsed*gameRatio;                    
                }
                else if(ans.equalsIgnoreCase("youtube")){
                    System.out.printf("For how many hours? ");
                    hoursUsed = Double.parseDouble(sc.nextLine());
                    onlineTime+=hoursUsed;
                    offlineTime+=hoursUsed*youtubeRatio;                    
                }
                else if(ans.equalsIgnoreCase("social media")){
                    System.out.printf("For how many hours? ");
                    hoursUsed = Double.parseDouble(sc.nextLine());
                    onlineTime+=hoursUsed;
                    offlineTime+=hoursUsed*socmedRatio;                    
                }
                else{
                    break;
                }
            }
            System.out.printf("Total hours online: %.1f%nTotal hours offline: %.1f%n", onlineTime, offlineTime);
            if(onlineTime+offlineTime > 24){
                System.out.println("Notice: You have spent too much time online!");
            }
            System.out.print("Will you continue the program (y/n)? ");
            if(sc.nextLine().equals("y")){
            }
            else {
                break;
            }
        }
    }//end of voidmain
}
    

