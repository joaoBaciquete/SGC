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
       JButton btn1 = new JButton("ENTRAR");
       JLabel lblUser = new JLabel("Usuario");
       JLabel lblSenha = new JLabel("Senha");
       JLabel lblLogin = new JLabel("Login");
       JLabel info = new JLabel("Insira corretamente os seus dados de usuario!!!");
       Rool rool;
       PainelBackgroundForm panel = new PainelBackgroundForm();
       JPanel panelLogin = new JPanel();
       
    public LoginForm(){
       setExtendedState(MAXIMIZED_BOTH);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setTitle("TelaLogin");
       setVisible(true);
       setLocationRelativeTo(null);
       setResizable(false);
       
       
       this.setLayout(null); //set layout para podermos configurar o layout a vontade
       add(panel);
       panel.add(panelLogin);
       panelLogin.add(btn1);
       panelLogin.add(txtUser);
       panelLogin.add(PassSenha);
       panelLogin.add(lblUser);
       panelLogin.add(lblSenha);
       panelLogin.add(lblLogin);
       panelLogin.add(info);
       
       panel.setLayout(null);
       panel.setBounds(0, 0, 2000, 2000);
       
       panelLogin.setLayout(new BorderLayout());
       panelLogin.setBackground(new Color(181,181,181));
       panelLogin.setBounds(680, 150, 490, 750);
      
       btn1.setBounds(50,460,395,50);
       btn1.setFont(new Font("Tahoma", Font.BOLD,25));
       btn1.setForeground( new Color(250,250,250));
       btn1.setBackground(new Color(0,139,69));
       btn1.addActionListener(this);
   
       txtUser.setBounds(50,295,395,50);
       txtUser.setFont(new Font("Arial", Font.BOLD,30));
       PassSenha.setBounds(50,400,395,50);
       PassSenha.setFont(new Font("Arial", Font.BOLD,30));
       
       lblUser.setBounds(50,250,150,40);
       lblUser.setForeground( new Color(250,250,250));
       lblUser.setFont(new Font("Tahoma", Font.BOLD,30));
       lblSenha.setBounds(50,350,150,40);
       lblSenha.setForeground( new Color(250,250,250));
       lblSenha.setFont(new Font("Tahoma", Font.BOLD,30));
       lblLogin.setBounds(170,90,250,60);
       lblLogin.setForeground( new Color(250,250,250));
       lblLogin.setFont(new Font("SenSerif", Font.BOLD,50));
       info.setBounds(40,560,450,60);
       info.setForeground( new Color(250,250,250));
       info.setFont(new Font("SenSerif", Font.ITALIC,20));
       
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
       rool=new Rool();
       boolean valido=rool.validar(txtUser.getText(), PassSenha.getText());
       if(valido){
           this.dispose();
           new MenuForm().show();
       }else{
           JOptionPane.showMessageDialog(null, "Preencha corretamente os seus dados!!");
           
       }
      
    }
}  