package exercise13muontanisaacjohn;
import java.util.ArrayList;

public class Subject {
    private String name, imgFileName;
    private double units, grade;
    private static ArrayList<Subject> subjectList = new ArrayList();
    public Subject(String n, String i, double u, double g){
        name = n;
        imgFileName = i;
        units = u;
        grade = g;
        subjectList.add(this);
    }
    public String getName() {
        return name;
    }
    public String getImgFileName(){
        return imgFileName;
    }
    public double getUnits() {
        return units;
    }
    public void setUnits(double units) {
        units = units;
    }
    public double getGrade() {
        return grade;
    }
    public void setGrade(double grade) {
        grade = grade;
    }
    public static int getSubjectListSize(){
        return subjectList.size();
    }
    public static ArrayList<Subject> getSubjectList(){
        return subjectList;
    }
    public static int getIndexOf(Subject subject) throws NullPointerException{
        if (subjectList.isEmpty()){
            throw new NullPointerException("No subjects have been created!");
        }
        return subjectList.indexOf(subject);
    }
    public static Subject searchSubject(String subjectName) throws NullPointerException, SubjectNotFoundException{
        if (subjectList.isEmpty()){
            throw new NullPointerException("No subjects have been created!");
        }
        for (Subject s : subjectList){
            if(s.getName().equalsIgnoreCase(subjectName)){
                return s;
            }
        }
        throw new SubjectNotFoundException("That subject does not exist!");
    }
}
