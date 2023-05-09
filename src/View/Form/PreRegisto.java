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
        
        apelido.setBounds(500,45,400,48);
        apelido.setFont(new Font("baciquete", PLAIN, 40));
        apelidotxt.setBounds(650, 45, 300, 40);
        apelido.setForeground( new Color(250,250,250));
        
        perfil.setBounds(23,150,200,28);
        perfil.setFont(new Font("baciquete", PLAIN, 40));
        perfiltxt.setBounds(160,150, 300, 40);
        perfil.setForeground( new Color(250,250,250));
        
        bi.setBounds(590,150,200,28);
        bi.setFont(new Font("baciquete", PLAIN, 40));
        bitxt.setBounds(650, 150, 300, 40);
        bi.setForeground( new Color(250,250,250));
        
        adress.setBounds(470,250,220,40);
        adress.setFont(new Font("baciquete", PLAIN, 40));
        adresstxt.setBounds(650, 250, 300, 40);
        adress.setForeground( new Color(250,250,250));
        
        senha.setBounds(23,250,200,28);
        senha.setFont(new Font("baciquete", PLAIN, 40));
        senhapss.setBounds(160, 250, 300, 40);
        senha.setForeground( new Color(250,250,250));
        
        savebtn.setBounds(210,380,600,50);
        savebtn.setFont(new Font("Arial", Font.BOLD,20));
        savebtn.setForeground( new Color(0,0,139));
        savebtn.addActionListener(this);
       
    }
   
    public void connect(){
       
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        crud=new CRUD();
       JOptionPane.showMessageDialog(null, "Logado com Sucesso");
           dm.setNome(nometxt.getText());
           dm.setApelido(apelidotxt.getText());
           dm.setAdress(adresstxt.getText());
           dm.setPerfil(perfiltxt.getText());
           dm.setbI(bitxt.getText());
           dm.setSenha(bi.getText());
           
           System.out.print(dm.getSenha());     // crud.inserir(dm);
       
       /*for(Admin ad:cr.findAll()){
           System.out.print(ad.getNome());
           System.out.print(ad.getData());
       }*/
    }
    
}
