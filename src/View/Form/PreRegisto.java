/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Form;

import Controller.CRUD;
import Model.USER.Admin;

import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.PLAIN;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Lenovo T460
 */
public final class PreRegisto extends JFrame implements ActionListener{
  
   JTextField apelidotxt=new JTextField(10);// nao pode fazer assim o 10 representa 
   JTextField nometxt=new JTextField(10);
   JTextField bitxt=new JTextField(10);
   JTextField adresstxt=new JTextField(10);
   JTextField perfiltxt=new JTextField(10);
   JPasswordField senhapss=new JPasswordField(10);
   JLabel nome = new JLabel("Nome:");
   JLabel apelido = new JLabel("Apelido:");
   JLabel bi = new JLabel("BI:");
   JLabel adress = new JLabel("Endereço:");
   JLabel perfil = new JLabel("Perfil:");
   JLabel senha = new JLabel("Senha:");
   JButton savebtn = new JButton("Salvar");
   JButton deletebtn = new JButton("EXcluir");
   JButton sairbtn = new JButton("SAIR");

    Admin dm = new Admin();
    List<Admin> user;
    Telinha tela;
    CRUD crud;

    public PreRegisto() throws HeadlessException {
        config();
       
        tela.add(senha);
        tela.add(senhapss);
        tela.add(perfil);
        tela.add(perfiltxt);
        tela.add(adress);
        tela.add(adresstxt);
        tela.add(bi);
        tela.add(bitxt);
        tela.add(apelido);
        tela.add(apelidotxt);
        tela.add(nome);
        tela.add(nometxt);
        tela.add(savebtn);
        tela.add(sairbtn);
       
       
        this.add(tela);

    }
    
     
    public void config(){
       
        setExtendedState(MAXIMIZED_BOTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        user = new ArrayList<>();
        setTitle("Pre_Registo");
        tela = new Telinha();
        tela.setLayout(null);
        tela.setBounds(450, 150, 1024, 720);
        
        nome.setBounds(23,50,200,28);
        nome.setForeground( new Color(250,250,250));
        nome.setFont(new Font("baciquete", PLAIN, 40));
        nometxt.setBounds(160,45, 300, 40);
        nometxt.setFont(new Font("baciquete", PLAIN, 30));
        
        apelido.setBounds(500,45,400,48);
        apelido.setForeground( new Color(250,250,250));
        apelido.setFont(new Font("baciquete", PLAIN, 40));
        apelidotxt.setBounds(650, 45, 300, 40);
        apelidotxt.setFont(new Font("baciquete", PLAIN, 30));
        
        
        perfil.setBounds(23,150,200,28);
        perfil.setForeground( new Color(250,250,250));
        perfil.setFont(new Font("baciquete", PLAIN, 40));
        perfiltxt.setBounds(160,150, 300, 40);
        perfiltxt.setFont(new Font("baciquete", PLAIN, 30));
       
        
        bi.setBounds(590,150,200,28);
        bi.setForeground( new Color(250,250,250));
        bi.setFont(new Font("baciquete", PLAIN, 40));
        bitxt.setBounds(650, 150, 300, 40);
        bitxt.setFont(new Font("baciquete", PLAIN, 30));
        
        
        adress.setBounds(470,250,220,40);
        adress.setForeground( new Color(250,250,250));
        adress.setFont(new Font("baciquete", PLAIN, 40));
        adresstxt.setBounds(650, 250, 300, 40);
        adresstxt.setFont(new Font("baciquete", PLAIN, 30));
        
        
        senha.setBounds(23,250,200,28);
        senha.setForeground( new Color(250,250,250));
        senha.setFont(new Font("baciquete", PLAIN, 40));
        senhapss.setBounds(160, 250, 300, 40);
        senhapss.setFont(new Font("baciquete", PLAIN, 30));
        
        
        savebtn.setBounds(210,380,150,50);
        savebtn.setForeground( new Color(255,255,255));
        savebtn.setFont(new Font("Arial", Font.BOLD,20));
        savebtn.setBackground( new Color(0,139,69));
        savebtn.addActionListener(this);
       
        sairbtn.setBounds(650,550,150,50);
        sairbtn.setForeground( new Color(255,255,255));
        sairbtn.setBackground( new Color(0,255,0));
        sairbtn.setFont(new Font("Arial", Font.BOLD,20));
        sairbtn.addActionListener(this);
    }
   
    public void connect(){
       
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
         if(ae.getSource()==sairbtn){
           this.dispose();
           new MenuForm().show();
       }
        crud=new CRUD();
       JOptionPane.showMessageDialog(null, "Guardado com Sucesso");
           dm.setNome(nometxt.getText());
           dm.setApelido(apelidotxt.getText());
           dm.setAdress(adresstxt.getText());
           dm.setPerfil(perfiltxt.getText());
           dm.setbI(bitxt.getText());
           dm.setSenha2(senhapss.getText());
           
           //System.out.print(dm.getSenha2());     
           crud.inserir(dm);
       
       
    }
    
}
