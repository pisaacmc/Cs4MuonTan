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
public class Ex04MuonTan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Wallet myWallet = new Wallet("Rattan", 200.00f);
        Wallet yourWallet = new Wallet("Leather", 2500.00f);
        Wallet theirWallet = new Wallet("Aluminum", 20000.00f);
        myWallet.printWalletInfo();
        yourWallet.printWalletInfo();
        theirWallet.printWalletInfo();
        
        Song barnyardBonanza = new Song("Barnyard Bonanza", "country", 300);
        Song clearestSight = new Song("Clearest Sight","rock", 900);
        barnyardBonanza.printSongInfo();
        clearestSight.printSongInfo();
        Singer normalAlYankovic = new Singer("Normal Al Yankovic");
        normalAlYankovic.changeFavSong(barnyardBonanza);
        normalAlYankovic.printSingerInfo();
        normalAlYankovic.performForAudience(12);       
        normalAlYankovic.printSingerInfo();
        normalAlYankovic.changeFavSong(clearestSight);
        normalAlYankovic.printSingerInfo();
        Singer jimmathy = new Singer("Jimmathy");
        jimmathy.changeFavSong(barnyardBonanza);
        normalAlYankovic.performForAudience(jimmathy, 20);
        jimmathy.printSingerInfo();
        normalAlYankovic.printSingerInfo();
        barnyardBonanza.printSongInfo();
        clearestSight.printSongInfo();        
        System.out.println("Total Performances: "+Singer.getTotalPerformances());
        
    }
    
}
