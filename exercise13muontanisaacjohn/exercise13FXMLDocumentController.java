/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package exercise13muontanisaacjohn;

import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;

/**
 *
 * @author isaac
 */
public class exercise13FXMLDocumentController implements Initializable {
    private HashMap<String, Boolean> currentlyActiveKeys = new HashMap<>();
    private Subject activeSubject;
    @FXML private Label name;
    @FXML private TextField searchField;
    @FXML private Label grade;
    @FXML private Label units;
    @FXML private Label errorLabel;
    @FXML private void nextSubject(ActionEvent event) {
        if((activeSubject==null)||(Subject.getIndexOf(activeSubject)+1==Subject.getSubjectListSize())){
            activeSubject = Subject.getSubjectList().get(0);
        }
        else{
            activeSubject = Subject.getSubjectList().get(Subject.getIndexOf(activeSubject)+1);
        }
        setSubject();
    }
    @FXML private void prevSubject(ActionEvent event) {
        if((activeSubject==null)||(Subject.getIndexOf(activeSubject)-1<0)){
            activeSubject = Subject.getSubjectList().get(Subject.getSubjectListSize()-1);
        }
        else{
            activeSubject = Subject.getSubjectList().get(Subject.getIndexOf(activeSubject)-1);
        }
        setSubject();
    }
    @FXML private void searchSubject(){
        try{
            activeSubject = Subject.searchSubject(searchField.getText());
            setSubject();
            errorLabel.setText("");
        }
        catch(NullPointerException e){
            errorLabel.setText("No Subjects Available!");
        }
        catch(SubjectNotFoundException e){
            errorLabel.setText("Subject Does Not Exist!");
        }
        
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }       
    
    @FXML private void setSubject(){
        ImageView icon = new ImageView(activeSubject.getImgFileName());
        name.setGraphic(icon);
        name.setText(activeSubject.getName());
        grade.setText("Grade: "+activeSubject.getGrade());
        units.setText("Units: "+activeSubject.getUnits());
    }
    
}
