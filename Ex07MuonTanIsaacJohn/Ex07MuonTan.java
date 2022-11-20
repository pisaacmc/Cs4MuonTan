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
public class Ex07MuonTan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Location sinnoh = new Location("Sinnoh","Whole-Roasted Piloswine");
        Location alola = new Location("Alola","Deep-Fried Magikarp fillet");
        Monster charmander = new FireType("Charmander",15,5);
        Trainer trainer = new Trainer("Jimmy",sinnoh);
        NPC barryButcher = new NPC("Barry the Butcher","So, what can I get ya "+trainer.getName()+"?");
        
        trainer.inspect(sinnoh);
        trainer.inspect(alola);
        trainer.travel(alola);
        trainer.inspect(charmander);
        trainer.inspect(barryButcher);
    }
    
}
