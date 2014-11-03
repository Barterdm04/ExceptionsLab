/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab3;

/**
 *
 * @author dbarter1
 */
public class FullNameIllegalArgumentException extends IllegalArgumentException{
    private static String MESSAGE = "Please enter a valid entry for Full Name";

    @Override
    public String getMessage() {
        return MESSAGE; 
    }
    
    
    
}
