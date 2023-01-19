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
public class Sea extends Location{
    private Enemy enemy;
    public Sea (String name, String description, Enemy enemy){
        super(name, description,"sea");
    }
    public Sea (String name, String description, Player player){
        super(name, description,"sea");
        enemy = new Enemy(player);
    }
    public void interact(Ship ship, Player player) throws ItemNotFoundException, NotEnoughStaminaException{
        if(this.autoDuel(ship)){
            enemy.dropLoot(player);
            player.setInfluence(player.getInfluence()+1);
        }
        else{
            player.setInfluence(0);
        }
    }
    public boolean autoDuel(Ship ship) throws ItemNotFoundException, NotEnoughStaminaException{//showcases basic combat
        do{
            Scanner sc = new Scanner(System.in);
            ship.fireWeapon(enemy, ship.getWeaponsList().get(0).getName());
            enemy.interact(ship);
        } while((ship.getHp()>0)&&(enemy.getHp()>0));
        if(ship.getHp() == 0){
            ship.setHp(ship.getMaxHp());
            System.out.println("you lose");
            return true;
            
        }
        else{
            ship.setHp(ship.getMaxHp());
            System.out.println("you win");
            return false;
            
        }
        
    }
}
