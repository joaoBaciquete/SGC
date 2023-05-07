/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Form;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Lenovo T460
 */
public abstract class LoginForm extends JFrame implements ActionListener {
    
       JTextField txtUser = new JTextField("");
       JPasswordField PassSenha = new JPasswordField("");
       JButton btn1 = new JButton("Entrar");
       JButton btn2 = new JButton("Sair");
       JLabel lblUser = new JLabel("Usuario :");
       JLabel lblSenha = new JLabel("Senha :");
       JLabel lblLogin = new JLabel("TelaLogin");
       
    public LoginForm(){
       setTitle("TelaLogin");
       setVisible(true);
       setSize(800,500);
       setLocationRelativeTo(null);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       
       
       setLayout(null); //set layout para podermos configurar o layout a vontade
       add(btn1);
       add(btn2);
       btn1.setBounds(290,300,100,50);
       btn1.setFont(new Font("Arial", Font.BOLD,20));
       btn1.addActionListener(this);
    
       btn2.setBounds(490,300,100,50);
       btn2.setFont(new Font("Arial", Font.BOLD,20));
       
       add(txtUser);
       add(PassSenha);
       txtUser.setBounds(250,100,400,55);
       txtUser.setFont(new Font("Arial", Font.ITALIC,20));
       txtUser.setText("Digite o seu Username");
       PassSenha.setBounds(250,180,400,55);
       PassSenha.setFont(new Font("Arial", Font.ITALIC,20));
       //PassSenha.setText("Digite a sua senha");
      
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
       JOptionPane.showMessageDialog(null, "Logado com Sucesso");
    }
    
     
}