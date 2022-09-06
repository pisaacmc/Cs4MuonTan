/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q1Ex1;
import java.util.Scanner;
/**
 *
 * @author MUON
 */
public class Q1Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //"object" 1: me
        String title = "Me";
        String name = "Isaac Tan";
        int age  = 16;
        boolean isHuman = true;
        //"object" 2: my dog
        String title2 = "Doggo";
        String name2 = "Toby";
        int age2  = 5;
        boolean isHuman2 = false;
        
        //operation results
        boolean bothHuman = isHuman&&isHuman2;
        int yearsLivedWithoutDog = age-age2;
        int totalAge = age+age2;
        
        //print out data here
        //object 1
        System.out.printf("Object 1: %s %nName: %s %nAge: %s %nHuman:%b %n%n",
        title, name, age, isHuman);
        //object 2
        System.out.printf("Object 1: %s %nName: %s %nAge: %s %nHuman:%b %n",
        title2, name2, age2, isHuman2);
        
        System.out.println("---");
        
        //print out operation results here
        System.out.println("Are " +name+" and "+name2 + " both human:"
        + bothHuman + " //Operation: AND");
        System.out.println("What is the total age of " +name+" and "+name2 + ":"
        + totalAge + " //Operation: Addition");
        System.out.println("How many years did " +name+" live without "+name2
        + ": " + yearsLivedWithoutDog + " //Operation: Subtraction");
    }
    
}
