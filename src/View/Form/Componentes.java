/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Form;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Lenovo T460
 */
public class Componentes {
    private JLabel texto;
    private JTextField txt;
    private JPasswordField ps;
    private JButton bt;
    private JLabel txtNome;

    public JLabel getTxtNome() {
        return txtNome;
    }

    public void setTxtNome(JLabel txtNome) {
        this.txtNome = txtNome;
    }

    public Componentes() {
        texto=new JLabel();
        txt=new JTextField(10);
    }

    public JLabel getTexto() {
        return texto;
    }

    public void setTexto(JLabel texto) {
        this.texto = texto;
    }

    public JTextField getTxt() {
        return txt;
    }

    public void setTxt(JTextField txt) {
        this.txt = txt;
    }

    public JPasswordField getPs() {
        return ps;
    }

    public void setPs(JPasswordField ps) {
        this.ps = ps;
    }

    public JButton getBt() {
        return bt;
    }

    public void setBt(JButton bt) {
        this.bt = bt;
    }
    
    
}
