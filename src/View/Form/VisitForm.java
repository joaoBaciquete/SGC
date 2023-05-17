/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Form;

import Model.USER.EmpregadosCond;
import Model.USER.Empregdos;
import Model.USER.User;
import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.PLAIN;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Lenovo T460
 */

   public class VisitForm extends JFrame implements ActionListener{
   JTextField apelidotxt=new JTextField(10);// nao pode fazer assim o 10 representa 
   JTextField nometxt=new JTextField(10);
   JTextField bitxt=new JTextField(13);
   JTextField datatxt = new JTextField(10);
   JTextField ruaAvtxt = new JTextField(10);
   JTextField ncasatxt = new JTextField(10);
   
   JTextField marcatxt = new JTextField(10);
   JTextField matriculatxt = new JTextField(10);
   JTextField cortxt = new JTextField(10);
   JTextField anotxt = new JTextField(10);
   JTextField ncasadtxt = new JTextField(10);
   JComboBox<String> sexotxt = new JComboBox<String>();
   
   JLabel ncasad = new JLabel("NºCasa:");
   JLabel marca = new JLabel("Modelo:");
   JLabel matricula = new JLabel("Matricula:");
   JLabel cor = new JLabel("Cor:");
   JLabel ano = new JLabel("AnoFabrico:");
   
   JLabel nome = new JLabel("Nome:");
   JLabel apelido = new JLabel("Apelido:");
   JLabel bi = new JLabel("BI:");
   JLabel data = new JLabel("DataNascimento:");
   JLabel ruaAv = new JLabel("Rua/Av:");
   JLabel ncasa = new JLabel("NºCasa:");
   JLabel sexo = new JLabel("Sexo:");
   
   JLabel visita = new JLabel("DADOS DO VEICULO E ENDEREÇO DESTINO");
   JLabel info = new JLabel("CADASTRO DOS VISITANTE");
   
   JButton savebtn = new JButton("SALVAR");
   JButton deletebtn = new JButton("EXCLUIR");
   JButton readbtn = new JButton ("LISTAR");
   JButton updatebtn = new JButton ("ATUALIZAR");
   JButton Exitbtn = new JButton ("SAIR");
   Telinha tela = new Telinha();
   User usuario;
   EmpregadosCond emp;
   Empregdos emprega;
   
public VisitForm() {
    
    setUndecorated(true);
    setSize(1300, 920);
    setVisible(true);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    this.setLayout(null);
   
        tela.add(ano);
        tela.add(anotxt);
        tela.add(marca);
        tela.add(marcatxt);
        tela.add(matricula);
        tela.add(matriculatxt);
        tela.add(cor);
        tela.add(cortxt);
        tela.add(ncasad);
        tela.add(ncasadtxt);
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
        tela.add(visita);
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
        
        visita.setBounds(23,260,900,35);
        visita.setForeground( new Color(250,250,250));
        visita.setFont(new Font("baciquete", PLAIN, 30));
        
        ///Dados do Visitante
        
        nome.setBounds(23,75,200,28);
        nome.setForeground( new Color(250,250,250));
        nome.setFont(new Font("baciquete", PLAIN,25));
        nometxt.setBounds(115,75, 300, 40);
        nometxt.setFont(new Font("baciquete", PLAIN, 30));
        
        apelido.setBounds(450,75,400,30);
        apelido.setFont(new Font("baciquete", PLAIN,25));
        apelidotxt.setBounds(560, 75, 300, 40);
        apelidotxt.setFont(new Font("baciquete", PLAIN, 30));
        apelido.setForeground( new Color(250,250,250));
        
        bi.setBounds(880,75,400,30);
        bi.setFont(new Font("baciquete", PLAIN,25));
        bitxt.setBounds(930,75,300,40);
        bitxt.setFont(new Font("baciquete", PLAIN, 30));
        bi.setForeground( new Color(250,250,250));
        
        ruaAv.setBounds(23,140,220,40);
        ruaAv.setForeground( new Color(250,250,250));
        ruaAv.setFont(new Font("baciquete", PLAIN, 25));
        ruaAvtxt.setBounds(115,140, 250, 40);
        ruaAvtxt.setFont(new Font("baciquete", PLAIN, 30));
        
        ncasa.setBounds(450,140,220,40);
        ncasa.setForeground( new Color(250,250,250));
        ncasa.setFont(new Font("baciquete", PLAIN, 25));
        ncasatxt.setBounds(560,140, 250, 40);
        ncasatxt.setFont(new Font("baciquete", PLAIN, 30));
        
        sexo.setBounds(30,210,220,40);
        sexo.setForeground( new Color(250,250,250));
        sexo.setFont(new Font("baciquete", PLAIN,25));
        sexotxt.setBounds(115,210, 190, 40);
        sexotxt.setFont(new Font("baciquete", PLAIN, 30));
        
        data.setBounds(880,140,250,28);
        data.setForeground( new Color(250,250,250));
        data.setFont(new Font("baciquete", PLAIN, 25));
        datatxt.setBounds(1100,140, 150, 40);
        datatxt.setFont(new Font("baciquete", PLAIN, 30));
        ///Dados do Veiculo dos Visitantes
        marca.setBounds(32,310,200,30);
        marca.setFont(new Font("baciquete", PLAIN, 25));
        marca.setForeground( new Color(250,250,250));
        marcatxt.setBounds(140,310, 230, 40);
        marcatxt.setFont(new Font("baciquete", PLAIN, 30));
         
        ano.setBounds(410,310,200,28);
        ano.setFont(new Font("baciquete", PLAIN, 25));
        ano.setForeground( new Color(250,250,250));
        anotxt.setBounds(550,310, 300, 40);
        anotxt.setFont(new Font("baciquete", PLAIN, 30));
       
        matricula.setBounds(23,380,200,30);
        matricula.setFont(new Font("baciquete", PLAIN, 25));
        matricula.setForeground( new Color(250,250,250));
        matriculatxt.setBounds(140,380, 220, 40);
        matriculatxt.setFont(new Font("baciquete", PLAIN, 30));
       
       
        cor.setBounds(380,380,200,30);
        cor.setFont(new Font("baciquete", PLAIN,25));
        cor.setForeground( new Color(250,250,250));
        cortxt.setBounds(435,380, 150, 40);
        cortxt.setFont(new Font("baciquete", PLAIN, 30));
        
        ncasad.setBounds(620,380,200,30);
        ncasad.setFont(new Font("baciquete", PLAIN,25));
        ncasad.setForeground( new Color(250,250,250));
        ncasadtxt.setBounds(720,380, 100, 40);
        ncasadtxt.setFont(new Font("baciquete", PLAIN, 30));
        
        savebtn.setBounds(50,450,150,50);
        savebtn.setFont(new Font("Arial", Font.BOLD,20));
        savebtn.setForeground( new Color(255,255,255));
        savebtn.setBackground( new Color(0,139,69));
        savebtn.addActionListener(this);
        
        readbtn.setBounds(250,450,150,50);
        readbtn.setFont(new Font("Arial", Font.BOLD,20));
        readbtn.setForeground( new Color(0,0,139));
        readbtn.addActionListener(this);
        
        updatebtn.setBounds(450,450,150,50);
        updatebtn.setFont(new Font("Arial", Font.BOLD,20));
        updatebtn.setForeground( new Color(0,0,139));
        updatebtn.addActionListener(this);
        
        deletebtn.setBounds(650,450,150,50);
        deletebtn.setFont(new Font("Arial", Font.BOLD,20));
        deletebtn.setForeground( new Color(255,255,255));
        deletebtn.setBackground( new Color(255,0,0));
        deletebtn.addActionListener(this);
        
        Exitbtn.setBounds(1100,850,150,50);
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
    }
    }
