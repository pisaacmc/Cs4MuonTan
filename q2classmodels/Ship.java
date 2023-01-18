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
public class Ship {
    private String name;
    private int hp, hull, healing, flatDamage, stamina, maxHp, maxStamina,
                maxWeapon, strength, poison, weakness;
    private Lieutenant activeLieutenant;
    private ArrayList<Relic> activeRelics = new ArrayList();
    private Player player;
    private ArrayList<Weapon> weaponsList = new ArrayList();
    //getters
    
    
    public String getName(){
        return name;
    }
    public int getMaxHp(){
        return maxHp;
    }
    public int getHp(){
        return hp;
    }
    public int getHull(){
        return hull;
    }
    public int getHealing(){
        return healing;
    }
    public int getmaxStamina(){
        return maxStamina;
    }
    public int getMaxWeapon(){
        return maxWeapon;
    }
    public int getFlatDamage(){
        return flatDamage;
    }
    //setters
    public void setMaxHp(int newValue){
        maxHp = newValue;
    }
    public void setHp(int newValue){
        hp = newValue;
    }
    public void setHull(int newValue){
        hull = newValue;
    }
    public void setHealing(int newValue){
        healing = newValue;
    }
    public void setmaxStamina(int newValue){
        maxStamina = newValue;
    }
    public void setMaxWeapon(int newValue){
        maxWeapon = newValue;
    }
    public void setFlatDamage(int newValue){
        flatDamage = newValue;
    }
    public void WeaponChoices(){
        //parse thru list
    }
    
    public void fireWeapon(Enemy enemy, Weapon weapon) throws NotEnoughStaminaException{
        //search weapon list for correct weapon, and fire, deducting ammo and stamina costs
    }
    
    public void addWeapon(){
        //adds weapon from player inventory to weaponsList, will throw error 
    }
    public void removeWeapon(){
        
    }
    public void addRelic(){
        
    }
    public void removeRelic(){
        
    }
}
