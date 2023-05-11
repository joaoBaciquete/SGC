package View.Form;


import Controller.CRUD;
import Model.USER.EmpregadosCond;
import Model.USER.Empregdos;
import Model.USER.User;
import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.PLAIN;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo T460
 */



public class UserForm extends JFrame implements ActionListener{
   JTextField apelidotxt=new JTextField(10);// nao pode fazer assim o 10 representa 
   JTextField nometxt=new JTextField(10);
   JTextField bitxt=new JTextField(10);
   JTextField adresstxt=new JTextField(10);
   JComboBox<String> perfiltxt=new JComboBox<String>();
   JPasswordField senhapss=new JPasswordField(10);
   JLabel nome = new JLabel("Nome:");
   JLabel apelido = new JLabel("Apelido:");
   JLabel bi = new JLabel("BI:");
   JLabel adress = new JLabel("Endereço:");
   JLabel perfil = new JLabel("Perfil:");
   JLabel senha = new JLabel("Senha:");
   JButton savebtn = new JButton("SALVAR");
   JButton deletebtn = new JButton("EXCLUIR");
   JButton readbtn = new JButton ("LISTAR");
   JButton updatebtn = new JButton ("ATUALIZAR");
   Telinha tela = new Telinha();
   User usuario;
   EmpregadosCond emp;
   Empregdos emprega;
public UserForm() {
    
    setExtendedState(MAXIMIZED_BOTH);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Cadastro de Usuarios");
    setVisible(true);
    setLocationRelativeTo(null);
    
    this.setLayout(null);
   
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
        tela.add(deletebtn);
        tela.add(readbtn);
        tela.add(updatebtn);
        perfiltxt.addItem("Sindico");
        perfiltxt.addItem("Porteiro");
        perfiltxt.setFont(new Font("baciquete", PLAIN, 30));
    
    add(tela);
    tela.setLayout(null);
    tela.setBounds(450, 150, 1024, 720);
    
     nome.setBounds(23,50,200,28);
        nome.setForeground( new Color(250,250,250));
        nome.setFont(new Font("baciquete", PLAIN, 40));
        nometxt.setBounds(160,45, 300, 40);
        nometxt.setFont(new Font("baciquete", PLAIN, 30));
        
        apelido.setBounds(500,45,400,48);
        apelido.setFont(new Font("baciquete", PLAIN, 40));
        apelidotxt.setBounds(650, 45, 300, 40);
        apelidotxt.setFont(new Font("baciquete", PLAIN, 30));
        apelido.setForeground( new Color(250,250,250));
        
        perfil.setBounds(23,150,200,28);
        perfil.setFont(new Font("baciquete", PLAIN, 40));
        perfiltxt.setBounds(160,150, 300, 40);
        perfiltxt.setFont(new Font("baciquete", PLAIN, 30));
        perfil.setForeground( new Color(250,250,250));
        
        bi.setBounds(590,150,200,28);
        bi.setFont(new Font("baciquete", PLAIN, 40));
        bitxt.setBounds(650, 150, 300, 40);
        bitxt.setFont(new Font("baciquete", PLAIN, 30));
        bi.setForeground( new Color(250,250,250));
        
        adress.setBounds(470,250,220,40);
        adress.setFont(new Font("baciquete", PLAIN, 40));
        adresstxt.setBounds(650, 250, 300, 40);
        adresstxt.setFont(new Font("baciquete", PLAIN, 30));
        adress.setForeground( new Color(250,250,250));
        
        senha.setBounds(23,250,200,28);
        senha.setFont(new Font("baciquete", PLAIN, 40));
        senhapss.setBounds(160, 250, 300, 40);
        senhapss.setFont(new Font("baciquete", PLAIN, 30));
        senha.setForeground( new Color(250,250,250));
        
        savebtn.setBounds(150,330,150,50);
        savebtn.setFont(new Font("Arial", Font.BOLD,20));
        savebtn.setForeground( new Color(0,0,139));
        savebtn.addActionListener(this);
        
        readbtn.setBounds(350,330,150,50);
        readbtn.setFont(new Font("Arial", Font.BOLD,20));
        readbtn.setForeground( new Color(0,0,139));
        readbtn.addActionListener(this);
        
        updatebtn.setBounds(550,330,150,50);
        updatebtn.setFont(new Font("Arial", Font.BOLD,20));
        updatebtn.setForeground( new Color(0,0,139));
        updatebtn.addActionListener(this);
        
        deletebtn.setBounds(750,330,150,50);
        deletebtn.setFont(new Font("Arial", Font.BOLD,20));
        deletebtn.setForeground( new Color(0,0,139));
        deletebtn.addActionListener(this);
        
}

@Override
    public void actionPerformed(ActionEvent ae) {
      usuario = new User();
    emp = new EmpregadosCond();
    emprega = new Empregdos();
        if(perfiltxt.getSelectedItem()=="Sindico"){
           usuario.setNome(nometxt.getText());
           usuario.setApelido(apelidotxt.getText());
           usuario.setPerfil(perfiltxt.getSelectedItem().toString());
           usuario.setAdress(adresstxt.getText());
           usuario.setbI(bitxt.getText());
           usuario.setSenha(senhapss.getText());
           new CRUD().inserir(usuario);
      
}
         if(perfiltxt.getSelectedItem()=="Porteiro"){
             emp.setCategoria(perfiltxt.getSelectedItem().toString());
             emprega.setNome(nometxt.getText());
             emprega.setApelido(apelidotxt.getText());
             emprega.setAdress(adresstxt.getText());
             emprega.setBi(bitxt.getText());
             emprega.setPass(senhapss.getText());
             emp.setEmp(emprega);
             
              new CRUD().inserir(emp);
}}
}