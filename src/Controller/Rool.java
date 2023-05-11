/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.USER.Admin;

/**
 *
 * @author Lenovo T460
 */
public class Rool {
CRUD cr;
    public Rool() {
        cr=new CRUD();
    }
    
  public boolean validar(String nome, String senha){
      for(Admin ad:cr.findAll()){
           return  ad.getNome().equals(nome) && ad.getSenha2().equals(senha);
        }
      return false;
  }
    
}
