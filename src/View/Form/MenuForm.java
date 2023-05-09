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

public class MenuForm extends JFrame {
      JPanel panel1 = new JPanel();
      JPanel panel2 = new JPanel();
      JLabel lblL = new JLabel("CONDOMINIO_VILLA");
      
    

    public MenuForm(){
       setResizable(false); 
       setTitle("MenuPrincipal");
       setVisible(true);
       
       setLocationRelativeTo(null);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       
       
        setLayout(null);
        add(panel1);
        panel1.setSize(200,600);
        panel1.setBackground( new Color(0,0,139));
        
        add(panel2);
        panel2.setSize(900,150);
        panel2.setBackground( new Color(70,130,180));
      //  panel2.add(lblLogo);
        //lblLogo.setBounds(250, 35, 50, 50);
       // lblLogo.setFont(new Font("Arial", Font.BOLD,40));
       // lblLogo.setForeground(Color.white);
        
    
    
}

}