/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise11muontanisaacjohn;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*; 


/**
 *
 * @author MUON
 */
public class ActionListenerController implements ActionListener{
    public void actionPerformed(ActionEvent e){
        System.out.println("PlaceHolder");
    }
    public void actionPerformed(ActionEvent e, JLabel field){  
            field.setText("Welcome to Javatpoint.");  
    }  
 
}
