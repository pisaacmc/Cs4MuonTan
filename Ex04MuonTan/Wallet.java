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
public class Wallet {
    private float money;
    private String cover, owner;
    public Wallet(String cover, float money){
        this.money = money;
        this.cover = cover;
        this.owner = "none";
    }
    public void spend(float amount){
        this.money -= amount;
    }
    public void addMoney(float earnings){
        this.money += earnings;
    }
    public void changeOwner(String owner){
        this.owner = owner;
    }
    
    public void printWalletInfo(){
        System.out.println("Wallet Cover: "+this.cover);
        System.out.println("Wallet Owner: "+this.owner);
        System.out.println("Amount in Wallet: "+this.money);
        System.out.println("");
    }
    
    public String getCover(){
        return this.cover;
    }
    public String getOwner(){
        return this.owner;
    }
}
