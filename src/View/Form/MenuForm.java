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
      JMenuItem itmCont = new JMenuItem("Contabilidade");
      JMenuItem itmVisitor = new JMenuItem("Visitante");
      JMenuItem itmExit = new JMenuItem("Exit");

    public MenuForm(){
       setResizable(false); 
       setTitle("MenuPrincipal");
       setSize(600, 400);
       setVisible(true);
       setLocationRelativeTo(null);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    
       
       this.setLayout(null);
        setJMenuBar(barra);
        barra.add(mArquivos);
        barra.add(mFinancas);
        barra.add(mRecepcao);
        barra.add(mSair);
        mArquivos.add(itmPre);
        mArquivos.add(itmUser);
        mFinancas.add(itmCont);
        mRecepcao.add(itmVisitor);
        mSair.add(itmExit);
        
        
        
        
        
      itmPre.addActionListener(this);
      itmUser.addActionListener(this);
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
          // new VisitForm().show();

       }
       if(ae.getSource()==itmExit){
           this.dispose();
           new LoginForm().show();
       }
    }
}