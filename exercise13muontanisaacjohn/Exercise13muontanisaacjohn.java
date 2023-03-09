/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package exercise13muontanisaacjohn;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author isaac
 */
public class Exercise13muontanisaacjohn extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("exercise13UI.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Subject math = new Subject("Math", "exercise13muontanisaacjohn/images/math.png", 4, 1.75);
        Subject bio = new Subject("Biology", "exercise13muontanisaacjohn/images/biology.png", 3, 2.0);
        Subject chem = new Subject("Chemistry", "exercise13muontanisaacjohn/images/chemistry.png", 3, 1.5);
        Subject physics = new Subject("Physics", "exercise13muontanisaacjohn/images/physics.png", 3, 1.75);
        Subject cs = new Subject("CS", "exercise13muontanisaacjohn/images/computer science.png", 1, 1.5); 
        launch(args);
    }
    
}
