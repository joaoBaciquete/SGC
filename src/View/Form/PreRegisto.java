/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Form;

import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.PLAIN;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Lenovo T460
 */
public class PreRegisto extends JFrame{
   Componentes comp1;
   List <Componentes> cop;
Telinha tela;
    public PreRegisto() throws HeadlessException {
        comp1=new Componentes();
        setExtendedState(MAXIMIZED_BOTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        cop=new ArrayList<>();
        setTitle("Pre_Registo");
        tela=new Telinha();
        tela.setLayout(null);
        tela.setBounds(450, 150,1024,720);
        comp1.setTexto(new JLabel("Apelido"));
        comp1.getTexto().setBounds(40,50, 200, 40);
        comp1.getTexto().setForeground(Color.yellow);
        comp1.getTexto().setFont(new Font("baciquete",PLAIN,30));
        comp1.setTxt(new JTextField(30));
        comp1.getTxt().setBounds(150,50, 300, 40);
        comp1.getTxt().setFont(new Font("baciquete",PLAIN,25));
        tela.add(comp1.getTexto());
        tela.add(comp1.getTxt());
        this.add(tela);
    }
    
    
    public void compTexto(int index,JLabel texto,JTextField txt){
        
            cop.get(index).setTexto(texto);
            cop.get(index).setTxt(txt);
        
    }
    
}
