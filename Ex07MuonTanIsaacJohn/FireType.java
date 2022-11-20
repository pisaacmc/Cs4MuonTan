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
public class FireType extends Monster{
    public FireType(String name, int maxHP, int base){
        super(name,"fire","grass","water", maxHP, base);
        atk = (int)Math.round(atk*1.3);
        def = (int)Math.round(def*0.7);
    }
    /**
     * changes special
     */
    @Override
    public void special(){
        if(increaseCounter == 3){
            System.out.println(this.getName()+" can no longer use that ability!");
        }
        else{
            atk+=2;
            increaseCounter++;
            hp -= (int)Math.round(maxHP*0.1);
            System.out.println(this.getName() + " reduced their hp to " + hp + " to increase their atk by 2. it can do this "+(3-increaseCounter)+" more times.");
        }
    }
}
