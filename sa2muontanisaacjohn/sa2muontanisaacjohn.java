/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sa2muontanisaacjohn;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author MUON
 */
public class sa2muontanisaacjohn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student("John");
        Student s2 = new Student("Jeannie","Biology");
        Course c1 = new Course("Communication 1","GenEd",3.0);
        Course c2 = new Course("Math 3","GenEd",5.0);
        Course c3 = new Course("Environmental Biology","Biology",5.0);
        ArrayList<Student> studentList = new ArrayList();
        studentList.add(s1);
        studentList.add(s2);
        ArrayList<Course> courseList= new ArrayList();
        courseList.add(c1);
        courseList.add(c2);
        courseList.add(c3);
        
        for (int i = 0; i<3;i++){
            boolean unitsAbove0 = true;//boolean to check if student units are all >0
            boolean nameMatched = false;//boolean to check if input matches name
            boolean courseMatched = false;//boolean to check if input matches course
            //checks if all units are good
            for (Student s : studentList){
                if(s.getUnitsTaken()==0.0){
                    unitsAbove0 = false;
                }
            }
            if (unitsAbove0){
                break;
            }//end of unit checker
            System.out.print("Select a student: ");
            String studentName = sc.nextLine();
            for (Student s : studentList){
                if(s.getName().equalsIgnoreCase(studentName)){
                    nameMatched = true;
                } 
            }//end of student checker
            if(!nameMatched){
                System.out.println("No student named "+studentName+" is listed.");
                System.out.println("--");
                continue;
            }
            System.out.print("Select a course: ");
            String courseName = sc.nextLine();
            for (Course c : courseList){
                if(c.getName().equalsIgnoreCase(courseName)){
                    courseMatched = true;
                } 
            }
            if(!courseMatched){
                System.out.println("No course named "+courseName+" is listed.");
                System.out.println("--");
                continue;
            }//end of course checker
            for(Student s :studentList){
                if(s.getName().equalsIgnoreCase(studentName)){
                    for(Course c:courseList){
                        if(c.getName().equalsIgnoreCase(courseName)){
                            s.enroll(c);
                        }
                    }
                }
            }
            System.out.println("--");
             
        }//end of main for loop
        System.out.println("Electives taken: "+Student.getElectiveCount());
    }
    
}
