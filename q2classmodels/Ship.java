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
    private Relic[] activeRelics = {null, null};
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
    public int getStamina(){
        return stamina;
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
    
    public void fireWeapon(Enemy enemy, String weaponName) throws NotEnoughStaminaException, NullPointerException{
        Weapon weapon = null;
        for (int i=0; i<maxWeapon;i++){
            if (weaponsList.get(i).getName().equalsIgnoreCase(weaponName)){
                weapon = weaponsList.get(i);
                break;
            }
            if(i==3){
                throw new NullPointerException();
            }
       
        }
         if(stamina-weapon.getStaminaCost()>0){
            throw new NotEnoughStaminaException("You dont have enough stamina for that!");
        }
        int damage = (int)(weapon.getBaseDamage()*1+(strength/10));
        if (enemy.getWeakAgainst().equalsIgnoreCase(weapon.getDamageType())){
            damage*=2;
        }

        enemy.setHp(enemy.getHp()-damage);
        //apply relic buffs
        for(int i=0; i<activeRelics.length;i++){
            for (int c = 0; c<4;c+=3){
                if (c==0){
                    enemy.setPoison(enemy.getPoison() + activeRelics[i].getBuffs()[c]);
                }
            }
        }
        
    }
    
    public void addWeapon(String weaponName){
        //adds weapon from player inventory to weaponsList, will offer option to replace if no more slots are available. 
    }
    public void removeWeapon(){
        //
    }
    public void removeWeaponForReplacement(){
        
    }
    public void addRelic(){
        
    }
    public void removeRelic(){
        
    }
}
