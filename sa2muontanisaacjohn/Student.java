/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sa2muontanisaacjohn;

public class Student{
	private String name, major;
	private double unitsTaken;
	private static int electiveCount = 0;
	
	public Student(String n){
		name = n;
		major = "GenEd";
                unitsTaken = 0;
	}
	public Student(String n, String m){
		name = n;
		major = m;
		unitsTaken = 0;
	}
	
	public String getName(){
            return name;
	}
	public String getMajor(){
            return major;
	}
	public double getUnitsTaken(){
            return unitsTaken;
	}
	public static int getElectiveCount(){
            return electiveCount;
	}
	public void enroll(Course c){
		c.addStudent();
		if(major.equalsIgnoreCase(c.getProgram())){
			unitsTaken += c.getUnits();
			System.out.printf("%s enrolled in %s.%n", name, c.getName());
		}
		else{
			electiveCount+=1;
			System.out.printf("%s enrolled in %s as an elective.%n", name, c.getName());
		}
	}
}
