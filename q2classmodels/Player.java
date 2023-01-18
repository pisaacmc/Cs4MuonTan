/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2classmodels;
import q2classmodels.Exceptions.*;
import java.util.*;
/**
 *
 * @author MUON
 */
public class Player {
    private String name;
    private int influence, gold;
    private ArrayList<Item> inventory = new ArrayList<Item>();
    private Ship ship;
    
    public Player (String name, int influence, int gold){
        this.name = name;
        this.influence = influence;
        this.gold = gold;
        
    }
    public int getGold(){
        return gold;
    }
    public int getInfluence(){
        return influence;
    }
    public String getName(){
        return name;
    }
    public void setGold(int newValue){
        gold+=newValue;
    }
    public void setInfluence(int newValue){
        influence+=newValue;
    }
    public void hire(){
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
        if (choice.equalsIgnoreCase("medic")){
            
        }
        
        
    }
    
}
