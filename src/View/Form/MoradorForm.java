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
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Lenovo T460
 */

public class MoradorForm extends JFrame implements ActionListener{
   ////JTextField Proprietario
   JTextField apelidotxt=new JTextField(10); 
   JTextField nometxt=new JTextField(10);
   JTextField bitxt=new JTextField(10);
   JTextField ncasatxt=new JTextField(10);
   JTextField ruaAvtxt=new JTextField(10);
   JTextField datatxt=new JTextField(10);
   JTextField telefonetxt = new JTextField(10);
   JTextField nAgregadostxt=new JTextField(10);
   JComboBox<String> titulotxt=new JComboBox<String>();
   JComboBox<String> sexotxt=new JComboBox<String>();
   /// JTextField Agregado
   JTextField gapelidotxt=new JTextField(10); 
   JTextField gnometxt=new JTextField(10);
   JTextField gbitxt=new JTextField(10);
   JTextField gdatatxt=new JTextField(10);
   JComboBox<String> gsexotxt=new JComboBox<String>();
   /// JTextField Veiculo
   JTextField marcatxt=new JTextField(10); 
   JTextField matriculatxt=new JTextField(10);
   JTextField anotxt=new JTextField(10);
   JTextField cortxt=new JTextField(10);
  /// JLabel Veiculo
   JLabel marca=new JLabel("Modelo:"); 
   JLabel matricula=new JLabel("Matricula:");
   JLabel ano=new JLabel("AnoFabrico:");
   JLabel cor=new JLabel("Cor:");
   ///JLabel Proprietario
   JLabel nome = new JLabel("Nome:");
   JLabel apelido = new JLabel("Apelido:");
   JLabel bi = new JLabel("BI:");
   JLabel ncasa = new JLabel("NºCasa:");
   JLabel rua = new JLabel("Rua/Av:");
   JLabel titulo = new JLabel("Titulo:");
   JLabel sexo = new JLabel("Sexo:");
   JLabel data = new JLabel("DataNascimento:");
   JLabel nAgregados = new JLabel("NºAgregados:");
   JLabel telefone = new JLabel("Telefone:");
   
   JLabel info = new JLabel("CADASTRO DOS MORADORES");
   JLabel Agreg = new JLabel("DADOS DOS AGREGADOS");
   JLabel Viatura = new JLabel("DADOS DO VEICULO");
   ///JLabel Agregados
   JLabel gnome = new JLabel("Nome:");
   JLabel gapelido = new JLabel("Apelido:");
   JLabel gbi = new JLabel("BI:");
   JLabel gsexo = new JLabel("Sexo:");
   JLabel gdata = new JLabel("DataNascimento:");
   /////JButton CRUD
   JButton savebtn = new JButton("SALVAR");
   JButton deletebtn = new JButton("EXCLUIR");
   JButton readbtn = new JButton ("LISTAR");
   JButton updatebtn = new JButton ("ATUALIZAR");
   JButton Exitbtn = new JButton ("SAIR");
   Telinha tela = new Telinha();
   User usuario;
   EmpregadosCond emp;
   Empregdos emprega; 
    
    
    
public MoradorForm() {
    
    setUndecorated(true);
    setVisible(true);
    setSize(1300, 920);
    setResizable(false);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    this.setLayout(null);
   
        tela.add(sexo);
        tela.add(sexotxt);
        tela.add(titulo);
        tela.add(titulotxt);
        tela.add(ncasa);
        tela.add(ncasatxt);
        tela.add(rua);
        tela.add(ruaAvtxt);
        tela.add(data);
        tela.add(datatxt);
        tela.add(nAgregados);
        tela.add(nAgregadostxt);
        tela.add(bi);
        tela.add(bitxt);
        tela.add(apelido);
        tela.add(apelidotxt);
        tela.add(telefone);
        tela.add(telefonetxt);
        tela.add(nome);
        tela.add(nometxt);
        tela.add(gapelido);
        tela.add(gapelidotxt);
        tela.add(gnome);
        tela.add(gnometxt);
        tela.add(gbi);
        tela.add(gbitxt);
        tela.add(gsexo);
        tela.add(gsexotxt);
        tela.add(gdata);
        tela.add(gdatatxt);
        tela.add(marca);
        tela.add(marcatxt);
        tela.add(matricula);
        tela.add(matriculatxt);
        tela.add(ano);
        tela.add(anotxt);
        tela.add(cor);
        tela.add(cortxt);
        tela.add(savebtn);
        tela.add(deletebtn);
        tela.add(readbtn);
        tela.add(updatebtn);
        tela.add(Exitbtn);
        tela.add(info);
        tela.add(Agreg);
        tela.add(Viatura);
        titulotxt.addItem("Proprietario");
        titulotxt.addItem("Inquilino");
        titulotxt.setFont(new Font("baciquete", PLAIN, 25));
        sexotxt.addItem("Masculino");
        sexotxt.addItem("Feminino");
        sexotxt.setFont(new Font("baciquete", PLAIN, 25));
        gsexotxt.addItem("Masculino");
        gsexotxt.addItem("Feminino");
        gsexotxt.setFont(new Font("baciquete", PLAIN, 25));
        
        
    add(tela);
    tela.setLayout(null);
    tela.setBounds(0,0, 1300, 920);
    
        info.setBounds(23,25,980,28);
        info.setForeground( new Color(250,250,250));
        info.setFont(new Font("baciquete", Font.PLAIN,26 ));
        Agreg.setBounds(23,290,980,28);
        Agreg.setForeground( new Color(250,250,250));
        Agreg.setFont(new Font("baciquete", Font.PLAIN, 26));
        Viatura.setBounds(23,450,980,28);
        Viatura.setForeground( new Color(250,250,250));
        Viatura.setFont(new Font("baciquete", Font.PLAIN, 26));
        nome.setBounds(23,80,250,28);
        nome.setForeground( new Color(250,250,250));
        nome.setFont(new Font("baciquete",Font.BOLD, 25));
        nometxt.setBounds(110,75, 200, 40);
        nometxt.setFont(new Font("baciquete",Font.PLAIN, 30));
        
        apelido.setBounds(350,75,300,48);
        apelido.setFont(new Font("baciquete", Font.BOLD, 25));
        apelidotxt.setBounds(450, 75, 200, 40);
        apelidotxt.setFont(new Font("baciquete", PLAIN, 30));
        apelido.setForeground( new Color(250,250,250));
        
        titulo.setBounds(23,155,150,28);
        titulo.setForeground( new Color(250,250,250));
        titulo.setFont(new Font("baciquete",Font.BOLD, 25));
        titulotxt.setBounds(110,150, 180, 40);
        titulotxt.setFont(new Font("baciquete", PLAIN, 30));
        
        bi.setBounds(680,75,200,28);
        bi.setForeground( new Color(250,250,250));
        bi.setFont(new Font("baciquete",Font.BOLD, 25));
        bitxt.setBounds(720, 75, 220, 40);
        bitxt.setFont(new Font("baciquete", PLAIN, 30));
        
        
        rua.setBounds(350,155,220,40);
        rua.setForeground( new Color(250,250,250));
        rua.setFont(new Font("baciquete",Font.BOLD, 25));
        ruaAvtxt.setBounds(450, 150, 250, 40);
        ruaAvtxt.setFont(new Font("baciquete", PLAIN, 30));
        
        ncasa.setBounds(820,155,220,40);
        ncasa.setForeground( new Color(250,250,250));
        ncasa.setFont(new Font("baciquete",Font.BOLD, 25));
        ncasatxt.setBounds(930, 150, 100, 40);
        ncasatxt.setFont(new Font("baciquete", PLAIN, 30));
        
        data.setBounds(23,225,220,40);
        data.setForeground( new Color(250,250,250));
        data.setFont(new Font("baciquete",Font.BOLD, 25));
        datatxt.setBounds(230, 225, 250, 40);
        datatxt.setFont(new Font("baciquete", PLAIN, 30));
        
        nAgregados.setBounds(500,225,220,40);
        nAgregados.setForeground( new Color(250,250,250));
        nAgregados.setFont(new Font("baciquete",Font.BOLD, 25));
        nAgregadostxt.setBounds(680, 225, 100, 40);
        nAgregadostxt.setFont(new Font("baciquete", PLAIN, 30));
        
        telefone.setBounds(820,225,220,40);
        telefone.setForeground( new Color(250,250,250));
        telefone.setFont(new Font("baciquete",Font.BOLD, 25));
        telefonetxt.setBounds(930, 225, 250, 40);
        telefonetxt.setFont(new Font("baciquete", PLAIN, 30));
        
        sexo.setBounds(950,75,150,28);
        sexo.setForeground( new Color(250,250,250));
        sexo.setFont(new Font("baciquete",Font.BOLD, 25));
        sexotxt.setBounds(1020, 75, 180, 40);
        sexotxt.setFont(new Font("baciquete", PLAIN, 30));
        
//Info dos agregados
        gnome.setBounds(23,350,250,28);
        gnome.setForeground( new Color(250,250,250));
        gnome.setFont(new Font("baciquete",Font.BOLD, 25));
        gnometxt.setBounds(110,350, 200, 40);
        gnometxt.setFont(new Font("baciquete",Font.PLAIN, 30));
        
        gapelido.setBounds(350,350,300,48);
        gapelido.setForeground( new Color(250,250,250));
        gapelido.setFont(new Font("baciquete", Font.BOLD, 25));
        gapelidotxt.setBounds(450, 350, 200, 40);
        gapelidotxt.setFont(new Font("baciquete", PLAIN, 30));
        
        gdata.setBounds(23,400,220,40);
        gdata.setForeground( new Color(250,250,250));
        gdata.setFont(new Font("baciquete",Font.BOLD, 25));
        gdatatxt.setBounds(230,400, 250, 40);
        gdatatxt.setFont(new Font("baciquete", PLAIN, 30));
        
        gbi.setBounds(680,350,200,28);
        gbi.setForeground( new Color(250,250,250));
        gbi.setFont(new Font("baciquete",Font.BOLD, 25));
        gbitxt.setBounds(720, 350, 220, 40);
        gbitxt.setFont(new Font("baciquete", PLAIN, 30));
         
        gsexo.setBounds(950,350,150,28);
        gsexo.setForeground( new Color(250,250,250));
        gsexo.setFont(new Font("baciquete",Font.BOLD, 25));
        gsexotxt.setBounds(1020,350, 180, 40);
        gsexotxt.setFont(new Font("baciquete", PLAIN, 30));
        /// Info Veiculo
        marca.setBounds(23,500,250,28);
        marca.setForeground( new Color(250,250,250));
        marca.setFont(new Font("baciquete",Font.BOLD, 25));
        marcatxt.setBounds(115,500, 200, 40);
        marcatxt.setFont(new Font("baciquete",Font.PLAIN, 30));
        
        ano.setBounds(350,500,300,48);
        ano.setForeground( new Color(250,250,250));
        ano.setFont(new Font("baciquete", Font.BOLD, 25));
        anotxt.setBounds(500,500, 100, 40);
        anotxt.setFont(new Font("baciquete", PLAIN, 30));
         
        cor.setBounds(660,500,200,28);
        cor.setForeground( new Color(250,250,250));
        cor.setFont(new Font("baciquete",Font.BOLD, 25));
        cortxt.setBounds(720, 500, 100, 40);
        cortxt.setFont(new Font("baciquete", PLAIN, 30));
        
        matricula.setBounds(840,500,220,40);
        matricula.setForeground( new Color(250,250,250));
        matricula.setFont(new Font("baciquete",Font.BOLD, 25));
        matriculatxt.setBounds(970, 500, 200, 40);
        matriculatxt.setFont(new Font("baciquete", PLAIN, 30));
        
   //Botoes e suas respectivas accoes     
        savebtn.setBounds(50,580,150,50);
        savebtn.setFont(new Font("Arial", Font.BOLD,20));
        savebtn.setForeground( new Color(255,255,255));
        savebtn.setBackground( new Color(0,139,69));
        savebtn.addActionListener(this);
        
        readbtn.setBounds(250,580,150,50);
        readbtn.setFont(new Font("Arial", Font.BOLD,20));
        readbtn.setForeground( new Color(0,0,139));
        readbtn.addActionListener(this);
        
        updatebtn.setBounds(450,580,150,50);
        updatebtn.setFont(new Font("Arial", Font.BOLD,20));
        updatebtn.setForeground( new Color(0,0,139));
        updatebtn.addActionListener(this);
        
        deletebtn.setBounds(650,580,150,50);
        deletebtn.setFont(new Font("Arial", Font.BOLD,20));
        deletebtn.setForeground( new Color(255,255,255));
        deletebtn.setBackground( new Color(255,0,0));
        deletebtn.addActionListener(this);
        
        Exitbtn.setBounds(1050,850,150,50);
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
