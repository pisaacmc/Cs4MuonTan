/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex04MuonTan;
/**
 *
 * @author MUON
 */
public class Singer {
    private final String name;
    private int noOfPerformances = 0;
    private static int totalPerformances = 0;
    private double earnings;
    private Song favSong;
    
    public Singer(String name){
        this.name = name;
        this.earnings = 0;
    }
    public void performForAudience(int noOfPeople){
        this.noOfPerformances++;
        this.earnings += noOfPeople*100;
        Singer.totalPerformances++;
        if (this.favSong != null){
            this.favSong.addPerformance();
        }
    }
    public void performForAudience (Singer duet, int noOfPeople){
        int individualEarnings = (noOfPeople*100)/2;
        duet.addPerformance();
        this.noOfPerformances++;
        this.earnings += individualEarnings;
        duet.addEarnings(individualEarnings);
        if (this.favSong != null){
            this.favSong.addPerformance();
        }
        if(duet.getFavSong() != null){
            duet.getFavSong().addPerformance();
        }
        Singer.totalPerformances++;
    }
    
    public void changeFavSong(Song favSong){
        this.favSong = favSong;
    }
    public void printSingerInfo(){
        System.out.println("Singer Name: "+this.name);
        System.out.println("Singer Performances: "+this.noOfPerformances);
        System.out.printf("Singer Earnings: %.2f%n",this.earnings);
        if(this.favSong!=null){
            System.out.println("Singer Fave Song: "+this.favSong.getName());
        }
        else{
            System.out.println("Singer Fave Song: N/A");
        }
        System.out.println("");
    }
    
    public String getName(){
        return this.name;
    }
    public int getnoOfPerformances(){
        return this.noOfPerformances;
    }
    public double getEarnings(){
        return this.earnings;
    }
    public static int getTotalPerformances(){
        return Singer.totalPerformances;
    }
    public Song getFavSong(){
        return this.favSong;
    }
    public void addPerformance(){
        this.noOfPerformances++;
    }
    public void addEarnings(double earnings){
        this.earnings+=earnings;
    }
    public void subtractEarnings(double costs){
        this.earnings -=costs;
    }
}
