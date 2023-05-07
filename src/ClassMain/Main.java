/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassMain;

import Controller.DAU.ConnexaoBaseDeDados;
import Model.USER.Usuario;
import View.Form.LoginForm;
import View.Form.MenuForm;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovo T460
 */
public class Main {
      public static void main(String[] args) {

          ConnexaoBaseDeDados con=new ConnexaoBaseDeDados();
          Usuario us=new Usuario();
          List<Usuario> lista=new ArrayList();
          lista.add(con.ler(Usuario.class, 1));
          for(Usuario use:lista){
               System.out.println("Nome: "+use.getNome());
               System.out.println("Apelido: "+use.getApelido());
               System.out.println("Enderesso: "+use.getAdress());
               System.out.println("bi: "+use.getbI());
          }
         
        // con.inserir(us);
    
    /*
     LoginForm log = new LoginForm() {}; 
     log.setVisible(true);
      }*/
    //MenuForm menu = new MenuForm() {}; 
   // menu.setVisible(true);
      
}}
