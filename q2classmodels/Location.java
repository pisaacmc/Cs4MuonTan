/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2classmodels;

/**
 *
 * @author MUON
 */
abstract class Location implements Interactable{
    protected String name, background;
    
    public Location(String name, String background){
        this.name = name;
        this.background = background;
    }
}
