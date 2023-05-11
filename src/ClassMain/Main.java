/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassMain;

import Controller.CRUD;
import Controller.Rool;
import Model.USER.Admin;
import View.Form.LoginForm;
import View.Form.PreRegisto;
import View.Form.UserForm;

/**
 *
 * @author Lenovo T460
 */
public class Main {
      public static void main(String[] args) {
         //new PreRegisto().show();
         // new MenuForm().show();
        //new UserForm().show();
        new LoginForm().setVisible(true);
        // CRUD cr=new CRUD();
         // Rool rl=new Rool();
         // System.out.println(rl.validar("Joao", "13345"));
         
}}