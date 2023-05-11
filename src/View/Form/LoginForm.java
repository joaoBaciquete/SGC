/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Form;
import Controller.Rool;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Lenovo T460
 */
public class LoginForm extends JFrame implements ActionListener {
    
       JTextField txtUser = new JTextField("");
       JPasswordField PassSenha = new JPasswordField("");
       JButton btn1 = new JButton("Entrar");
       JButton btn2 = new JButton("Sair");
       JLabel lblUser = new JLabel("Usuario :");
       JLabel lblSenha = new JLabel("Senha :");
       JLabel lblLogin = new JLabel("TelaLogin");
       Rool rool;
       
    public LoginForm(){
       
       setTitle("TelaLogin");
       setVisible(true);
       setSize(800,500);
       setLocationRelativeTo(null);
       setResizable(false);
       setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
       
       
       setLayout(null); //set layout para podermos configurar o layout a vontade
       add(btn1);
       add(btn2);
       btn1.setBounds(290,300,100,50);
       btn1.setFont(new Font("Arial", Font.BOLD,25));
       btn1.addActionListener(this);
    
       btn2.setBounds(490,300,100,50);
       btn2.setFont(new Font("Arial", Font.BOLD,25));
       btn2.addActionListener(this);
       
       add(txtUser);
       add(PassSenha);
       txtUser.setBounds(250,100,400,55);
       txtUser.setFont(new Font("baciquete", Font.BOLD,30));
       PassSenha.setBounds(250,180,400,55);
       PassSenha.setFont(new Font("Arial", Font.BOLD,30));
       
      
       add(lblUser);
       add(lblSenha);
       add(lblLogin);
       lblUser.setBounds(90,100,100,50);
       lblUser.setFont(new Font("Arial", Font.BOLD,20));
       lblSenha.setBounds(100,180,100,50);
       lblSenha.setFont(new Font("Arial", Font.BOLD,20));
       lblLogin.setBounds(300,5,250,50);
       lblLogin.setFont(new Font("Arial", Font.BOLD,40));
       
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
         if(ae.getSource()==btn2){
          JOptionPane.showMessageDialog(null, "Tens a certeza que deseja sair do sistema??");
          //JOpionPane.Yes_NO_OPTION
          System.exit(0);
       }
       rool=new Rool();
       boolean valido=rool.validar(txtUser.getText(), PassSenha.getText());
       if(valido){
           this.dispose();
           new MenuForm().show();
       }else{
           JOptionPane.showMessageDialog(null, "Os seus dados nao sao compativeis,tente novamente!!");
           
       }
      
    }
    
     
}