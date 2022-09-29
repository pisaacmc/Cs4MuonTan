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
public class Song {
    private String name, genre;
    private int secondsLength, timesSung;
    private String playlists[];
    
    public Song(String name, String genre, int secondsLength){
        this.name = name;
        this.genre = genre;
        this.secondsLength = secondsLength;
    }
    public void printSongInfo(){
        System.out.println("Song Name: "+this.name);
        System.out.println("Times Performed: "+this.timesSung);
        System.out.printf("Song length: %d%n",this.secondsLength);
        try{
            System.out.println("Currently In "+this.playlists.length +" playlists");
        } catch(NullPointerException e){
            System.out.println("Currently In 0 playlists");
        }
        
        System.out.println("");
    }
    //placeholder for playlist class because yes
    public void addToPlaylist(String playlist){
        
    }
    public String getName(){
        return this.name;
    }
    public int getLength(){
        return this.secondsLength;
    }
    public String getGenre(){
        return this.genre;
    }
    public void changeName(String newName){
        this.name = newName;
    }
    public void changeGenre(String newGenre){
        this.genre = newGenre;
    }
    public void addPerformance(){
        this.timesSung++;
    }
  
    
}
