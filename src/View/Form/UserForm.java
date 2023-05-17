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
   JTextField bitxt=new JTextField(13);
   JTextField datatxt = new JTextField(10);
   JTextField ruaAvtxt = new JTextField(10);
   JTextField ncasatxt=new JTextField(10);
   //JTable tabela = new JTable(8, 9);
   JComboBox<String> perfiltxt=new JComboBox<String>();
   JComboBox<String> sexotxt = new JComboBox<String>();
   JPasswordField senhapss=new JPasswordField(10);
   JLabel nome = new JLabel("Nome:");
   JLabel apelido = new JLabel("Apelido:");
   JLabel bi = new JLabel("BI:");
   JLabel adress = new JLabel("Endereço:");
   JLabel perfil = new JLabel("Perfil:");
   JLabel senha = new JLabel("Senha:");
   JLabel data = new JLabel("DataNascimento:");
   JLabel ruaAv = new JLabel("Rua/Av:");
   JLabel ncasa = new JLabel("NºCasa:");
   JLabel sexo = new JLabel("Sexo:");
   JLabel info = new JLabel("CADASTRO DOS USUARIOS");
   JButton savebtn = new JButton("SALVAR");
   JButton deletebtn = new JButton("EXCLUIR");
   JButton readbtn = new JButton ("LISTAR");
   JButton updatebtn = new JButton ("ATUALIZAR");
   JButton Exitbtn = new JButton ("SAIR");
   Telinha tela = new Telinha();
   User usuario;
   EmpregadosCond emp;
   Empregdos emprega;
public UserForm() {
    
    
    setUndecorated(true);
    setTitle("Cadastro de Usuarios");
    setSize(1300, 920);
    setVisible(true);
    setLocationRelativeTo(null);
    
    this.setLayout(null);
   
        tela.add(senha);
        tela.add(senhapss);
        tela.add(perfil);
        tela.add(perfiltxt);
        tela.add(adress);
        tela.add(bi);
        tela.add(bitxt);
        tela.add(apelido);
        tela.add(apelidotxt);
        tela.add(nome);
        tela.add(nometxt);
        tela.add(data);
        tela.add(datatxt);
        tela.add(ruaAv);
        tela.add(ruaAvtxt);
        tela.add(ncasa);
        tela.add(ncasatxt);
        tela.add(sexo);
        tela.add(sexotxt);
        tela.add(savebtn);
        tela.add(deletebtn);
        tela.add(readbtn);
        tela.add(updatebtn);
        tela.add(Exitbtn);
        tela.add(info);
        //tela.add(tabela);
        perfiltxt.addItem("Sindico");
        perfiltxt.addItem("Porteiro");
        perfiltxt.setFont(new Font("baciquete", PLAIN, 26));
        sexotxt.addItem("Masculino");
        sexotxt.addItem("Feminino");
        sexotxt.setFont(new Font("baciquete", PLAIN, 26));
    
    add(tela);
    tela.setLayout(null);
    tela.setBounds(0,0, 1300, 920);
        //tela.add(tabela);
        //tabela.setBounds(50,330,150,50);
        
        info.setBounds(23,10,450,35);
        info.setForeground( new Color(250,250,250));
        info.setFont(new Font("baciquete", PLAIN, 30));
        
        nome.setBounds(23,75,200,28);
        nome.setForeground( new Color(250,250,250));
        nome.setFont(new Font("baciquete", PLAIN, 30));
        nometxt.setBounds(115,75, 300, 40);
        nometxt.setFont(new Font("baciquete", PLAIN, 30));
        
        apelido.setBounds(450,75,400,30);
        apelido.setFont(new Font("baciquete", PLAIN, 30));
        apelidotxt.setBounds(560, 75, 300, 40);
        apelidotxt.setFont(new Font("baciquete", PLAIN, 30));
        apelido.setForeground( new Color(250,250,250));
        
        perfil.setBounds(23,180,200,30);
        perfil.setFont(new Font("baciquete", PLAIN, 30));
        perfiltxt.setBounds(115,180, 300, 40);
        perfiltxt.setFont(new Font("baciquete", PLAIN, 30));
        perfil.setForeground( new Color(250,250,250));
        
        bi.setBounds(880,75,400,30);
        bi.setFont(new Font("baciquete", PLAIN, 30));
        bitxt.setBounds(930,75,300,40);
        bitxt.setFont(new Font("baciquete", PLAIN, 30));
        bi.setForeground( new Color(250,250,250));
        
        ruaAv.setBounds(23,270,220,40);
        ruaAv.setForeground( new Color(250,250,250));
        ruaAv.setFont(new Font("baciquete", PLAIN, 30));
        ruaAvtxt.setBounds(135, 270, 250, 40);
        ruaAvtxt.setFont(new Font("baciquete", PLAIN, 30));
        
        ncasa.setBounds(430,270,220,40);
        ncasa.setForeground( new Color(250,250,250));
        ncasa.setFont(new Font("baciquete", PLAIN, 30));
        ncasatxt.setBounds(560, 270, 250, 40);
        ncasatxt.setFont(new Font("baciquete", PLAIN, 30));
        
        sexo.setBounds(850,270,220,40);
        sexo.setForeground( new Color(250,250,250));
        sexo.setFont(new Font("baciquete", PLAIN, 30));
        sexotxt.setBounds(940, 270, 250, 40);
        sexotxt.setFont(new Font("baciquete", PLAIN, 30));
        
        
        senha.setBounds(450,180,200,28);
        senha.setFont(new Font("baciquete", PLAIN, 30));
        senhapss.setBounds(560,180, 300, 40);
        senhapss.setFont(new Font("baciquete", PLAIN, 30));
        senha.setForeground( new Color(250,250,250));
        
        data.setBounds(880,180,250,28);
        data.setForeground( new Color(250,250,250));
        data.setFont(new Font("baciquete", PLAIN, 30));
        datatxt.setBounds(1100,180, 150, 40);
        datatxt.setFont(new Font("baciquete", PLAIN, 30));
        
        
        savebtn.setBounds(50,360,150,50);
        savebtn.setFont(new Font("Arial", Font.BOLD,20));
        savebtn.setForeground( new Color(0,0,139));
        savebtn.addActionListener(this);
        
        readbtn.setBounds(250,360,150,50);
        readbtn.setFont(new Font("Arial", Font.BOLD,20));
        readbtn.setForeground( new Color(0,0,139));
        readbtn.addActionListener(this);
        
        updatebtn.setBounds(450,360,150,50);
        updatebtn.setFont(new Font("Arial", Font.BOLD,20));
        updatebtn.setForeground( new Color(0,0,139));
        updatebtn.addActionListener(this);
        
        deletebtn.setBounds(650,360,150,50);
        deletebtn.setFont(new Font("Arial", Font.BOLD,20));
        deletebtn.setForeground( new Color(255,255,255));
        deletebtn.setBackground( new Color(255,0,0));
        deletebtn.addActionListener(this);
        
        Exitbtn.setBounds(950,360,150,50);
        Exitbtn.setFont(new Font("Arial", Font.BOLD,20));
        Exitbtn.setForeground( new Color(255,255,255));
        Exitbtn.setBackground( new Color(0,255,0));
        Exitbtn.addActionListener(this);
}

@Override
    public void actionPerformed(ActionEvent ae) {
        
     if(ae.getSource()==Exitbtn){
           this.dispose();
           new MenuForm().show();
     }
    usuario = new User();
    emp = new EmpregadosCond();
    emprega = new Empregdos();
    
        if(perfiltxt.getSelectedItem()=="Sindico"){
          
           usuario.setNome(nometxt.getText());
           usuario.setApelido(apelidotxt.getText());
           usuario.setPerfil(perfiltxt.getSelectedItem().toString());
           usuario.setAdress(ruaAvtxt.getText());
           usuario.setbI(bitxt.getText());
           usuario.setSenha(senhapss.getText());
           new CRUD().inserir(usuario);
           //JOptionPane.showMessageDialog(null, "Guardado com Sucesso");
      
           }
         if(perfiltxt.getSelectedItem()=="Porteiro"){
             emp.setCategoria(perfiltxt.getSelectedItem().toString());
             emprega.setNome(nometxt.getText());
             emprega.setApelido(apelidotxt.getText());
             emprega.setAdress(ruaAvtxt.getText());
             emprega.setBi(bitxt.getText());
             emprega.setPass(senhapss.getText());
             emp.setEmp(emprega);
             
              new CRUD().inserir(emp);
           }
        
       }
    }
