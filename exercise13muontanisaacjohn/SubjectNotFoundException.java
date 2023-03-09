/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package exercise13muontanisaacjohn;

/**
 *
 * @author isaac
 */
public class SubjectNotFoundException extends Exception{

    /**
     * Creates a new instance of <code>SubjectNotFoundException</code> without
     * detail message.
     */
    public SubjectNotFoundException() {
    }

    /**
     * Constructs an instance of <code>SubjectNotFoundException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public SubjectNotFoundException(String msg) {
        super(msg);
    }
}
