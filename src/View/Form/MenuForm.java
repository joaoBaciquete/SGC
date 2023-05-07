/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Form;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Lenovo T460
 */

public abstract class MenuForm extends JFrame {
      JPanel panel1 = new JPanel();
       JPanel panel2 = new JPanel();
      
    

    public MenuForm(){
       setUndecorated(true);
       setTitle("MenuPrincipal");
       setVisible(true);
       setSize(900,600);
       setLocationRelativeTo(null);
       
       
        setLayout(null);
        add(panel1);
        panel1.setSize(200,600);
        panel1.setBackground(Color.red);
        
        add(panel2);
        panel2.setSize(900,150);
        panel2.setBackground(Color.yellow);
        
    
    
}

}