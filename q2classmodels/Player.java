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
    private Location location;
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
    public ArrayList<Item> getInventory(){
        return inventory;
    }
    public void addItem(Item item){
        inventory.add(item);
    }
    public void removeItem(Item item){
        inventory.remove(item);
    }
    public void hire(){
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
        if (choice.equalsIgnoreCase("medic")){
            ship.setHealing(ship.getHealing()+1);
        }
             
    }
    public void travelTo(Location location){
        this.location = location;
        if (location.getType().equalsIgnoreCase("island")){
            location.interact(this);
        }
        
    }
}
