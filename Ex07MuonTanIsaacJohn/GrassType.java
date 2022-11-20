/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex07MuonTanIsaacJohn;

/**
 *
 * @author MUON
 */
public class GrassType extends Monster{
    public GrassType(String name, int maxHP, int base){
        super(name,"grass","water","fire", maxHP, base);
    }
    
    /**
     * changes special
     */
    @Override
    public void special(){
        hp += (int)Math.round(0.2*maxHP);
        if(hp > maxHP) hp = maxHP;
        System.out.println(this.getName() + " used their special to heal, bringing it to " + hp + " hp.");
    }

    /**
     *buffs healing to 50% from 15%
     */
    @Override
    public void rest(){
        hp += (int)Math.round(0.5*maxHP);
        if(hp > maxHP) hp = maxHP;
        System.out.println(this.getName() + " rested. It's health is now " + hp + ".");        
    }
}
