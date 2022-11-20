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
public class WaterType extends Monster{
    public WaterType(String name, int maxHP, int base){
        super(name,"water","fire","grass", maxHP, base);
        atk = (int)Math.round(atk*0.7);
        def = (int)Math.round(def*1.3);
    }
    /**
     * changes special
     */
    @Override
    public void special(){
        if(increaseCounter==3){
            System.out.println(this.getName()+" can no longer use that ability!");
        }
        else{
            def+=2;
            increaseCounter++;
            System.out.println((int)Math.round(maxHP*0.1));
            hp -= (int)Math.round(maxHP*0.1);
            System.out.println(this.getName() + " reduced their hp to " + hp + " to increase their def by 2. it can do this "+(3-increaseCounter)+" more times.");
        }
    }
}