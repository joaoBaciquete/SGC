/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Form;

import javax.swing.*;
import java.awt.*;
import static java.awt.Font.PLAIN;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Lenovo T460
 */

public class MenuForm extends JFrame implements ActionListener{
     
      JMenuBar barra = new JMenuBar();
      JMenu mArquivos = new JMenu("Arquivos");
      JMenu mFinancas = new JMenu("Finanças");
      JMenu mRecepcao = new JMenu("Recepçao");
      JMenu mSair = new JMenu("Sair");
      JMenuItem itmPre = new JMenuItem("Pre_Registo");
      JMenuItem itmUser = new JMenuItem("Usuario");
      JMenuItem itmMorador = new JMenuItem("Morador");
      JMenuItem itmCont = new JMenuItem("Contabilidade");
      JMenuItem itmVisitor = new JMenuItem("Visitante");
      JMenuItem itmExit = new JMenuItem("Exit");
      ImageIcon imagem = new ImageIcon(getClass().getResource("pngwing.com.png"));
      JLabel label = new JLabel(imagem);
    public MenuForm(){
       setExtendedState(MAXIMIZED_BOTH);
       setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
       setTitle("MenuPrincipal");
       setVisible(true);
       setResizable(false);
       setLocationRelativeTo(null);
       
       
    
       
       this.setLayout(null);
       add(label);
       label.setBounds(0,0, 1950, 1050);
       
        setJMenuBar(barra);
        barra.add(mArquivos);
        barra.add(mFinancas);
        barra.add(mRecepcao);
        barra.add(mSair);
        mArquivos.add(itmPre);
        mArquivos.add(itmUser);
        mArquivos.add(itmMorador);
        mFinancas.add(itmCont);
        mRecepcao.add(itmVisitor);
        mSair.add(itmExit);
        
        mArquivos.setFont(new Font("Arial", Font.BOLD,30));
        mFinancas.setFont(new Font("Arial", Font.BOLD,30));
        mRecepcao.setFont(new Font("Arial", Font.BOLD,30));
        mSair.setFont(new Font("Arial", Font.BOLD,30)); 
        
        itmPre.setFont(new Font("Arial", Font.BOLD,20));
        itmUser.setFont(new Font("Arial", Font.BOLD,20));
        itmMorador.setFont(new Font("Arial", Font.BOLD,20));
        itmCont.setFont(new Font("Arial", Font.BOLD,20));
        itmVisitor.setFont(new Font("Arial", Font.BOLD,20));
        itmExit.setFont(new Font("Arial", Font.BOLD,20));
        
        
        
      itmPre.addActionListener(this);
      itmUser.addActionListener(this);
      itmMorador.addActionListener(this);
      itmCont.addActionListener(this);
      itmVisitor.addActionListener(this);
      itmExit.addActionListener(this);
        
    
    
}

    @Override
    public void actionPerformed(ActionEvent ae) {
       if(ae.getSource()==itmPre){
           this.dispose();
           new PreRegisto().show();
       }
       if(ae.getSource()==itmUser){
           this.dispose();
           new UserForm().show();
       }
       if(ae.getSource()==itmCont){
           this.dispose();
          // new ContForm().show();
       }
       if(ae.getSource()==itmVisitor){
           this.dispose();
           new VisitForm().show();
       }
       if(ae.getSource()==itmExit){
           this.dispose();
           new LoginForm().show();
       }
       if(ae.getSource()==itmMorador){
           this.dispose();
           new MoradorForm().show();
       }
    }
}