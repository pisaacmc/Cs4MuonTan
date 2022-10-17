/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sa2muontanisaacjohn;

/**
 *
 * @author MUON
 */
public class Course {
    private String name, program;
    private double units;
    private int classSize;
    
    public Course(String name, String program, double units) {
        this.name = name;
        this.program = program;
        this.units = units;
        classSize = 0;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getProgram(){
        return this.program;
    }
    
    public double getUnits(){
        return this.units;
    }
    
    public int getClassSize(){
        return this.classSize;
    }
    public void addStudent(){
        this.classSize++;
    }
}
