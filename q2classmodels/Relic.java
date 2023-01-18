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
public class Relic extends Item implements Upgradable{
    private int[] buffs = {0,0,0,0};//poison, healing, power, weakness
    private boolean activated = false;
    public Relic (String name, int price, int worth, Player player){
        super(name, "weapon", price, worth, player);
        int buffPoints = player.getInfluence()+5;
        System.out.println(buffPoints);
        while (buffPoints>0){
            int buffLevel = (int)Math.floor(Math.random()*(buffPoints+1));
            buffs[(int)Math.floor(Math.random()*(4))]+=buffLevel;
            buffPoints-=buffLevel;
            System.out.println(buffPoints);
        }
        System.out.println("poison "+buffs[0]);
        System.out.println("healing "+buffs[1]);
        System.out.println("power "+buffs[2]);
        System.out.println("weakness "+buffs[3]);
        
        staminaCost = 1;
    }

    public int[] getBuffs(){
        return buffs;
    }
    
    /**
     * upgrades weapon
     * @throws BrokeException
     */
    @Override
    public void upgrade() throws BrokeException, AlreadyMaximumException{
        if (owner.getGold()-(upgradeCost*(1+(owner.getInfluence()+tier/10)))<0){
            throw new BrokeException("you dont have enough money for that!");            
        }
        if (tier ==3){
            throw new AlreadyMaximumException("This relic is already maxxed out!");
        }
        owner.setGold(owner.getGold()-(upgradeCost*(owner.getInfluence()+tier/10)));
        for (int i=0;i<buffs.length;i++){
            if(buffs[i]!=0){
                buffs[i]+=1;
            }
        }
        System.out.println(name+" has been upgraded!");
        
        
    }
    
    public void activate(){
        System.out.println(name+" has been activated!");
        activated = true;
    }
}
