/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bank;

import java.util.ArrayList;

/**
 *
 * @author angelo
 */
public class Bank {
    
    //private Chargement first;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Chargement first = new Chargement();
        first.setVisible(true);
        first.play();
        first.dispose();
        new Login().setVisible(true);
    }
    
}
