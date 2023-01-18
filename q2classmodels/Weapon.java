/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2classmodels;
import q2classmodels.Exceptions.*;
/**
 *
 * @author MUON
 */
public class Weapon extends Item implements Upgradable{
    private int ammo, ammoMax, baseDamage;
    private String damageType;
    public Weapon(String name, int price, int worth, Player player, int tier){
        super(name, "weapon", price, worth, player);
        this.tier = tier;
        String[] damageTypes = {"physical", "explosive", "energy"};
        damageType = damageTypes[(int)Math.floor(Math.random()*(3))];
        staminaCost = (int) Math.floor(Math.random()*(3)+1);
        baseDamage = (int)Math.floor(Math.random()*((5+tier-(staminaCost+tier)+1)+staminaCost+tier));
        ammoMax = (int)Math.floor((Math.random()*(10+staminaCost+1)+staminaCost)*(1+player.getInfluence()/10));
        ammo =ammoMax;
    }
    
    public int getTier(){
        return tier;
    }
    public int getAmmo(){
        return ammo;
    }
    public int getAmmoMax(){
        return ammoMax;
    }
    public int getBaseDamage(){
        return baseDamage;
    }
    public int getUpgradeCost(){
        return upgradeCost;
    }
    
    /**
     * upgrades weapon
     * @throws BrokeException
     * @throws AlreadyMaximumException
     */
    @Override
    public void upgrade() throws BrokeException, AlreadyMaximumException{
        if (owner.getGold()-(upgradeCost*(1+(owner.getInfluence()+tier/10)))<0){
            throw new BrokeException("you dont have enough money for that!");            
        }
        if (tier ==5){
            throw new AlreadyMaximumException("This weapon is already maxxed out!");
        }
        owner.setGold(owner.getGold()-(upgradeCost*(owner.getInfluence()+tier/10)));
        tier+=1;
        ammoMax+=1;
        baseDamage+=1;
        System.out.println(name+" has been upgraded!");
        
        
    }
}
