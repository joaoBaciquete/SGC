/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author trido
 */
public class CRUD {
    EntityManagerFactory fatory;
    EntityManager con;

    public CRUD() {
        fatory=Persistence.createEntityManagerFactory("SistemPU");
        con=fatory.createEntityManager();
        
           
          
    }
    
   
    public Object inserir(Object ob){
      con.getTransaction().begin();
      try{
        con.persist(ob);
        con.getTransaction().commit();
        con.close();
      return ob;
      }catch(Exception e){System.out.println(e.getLocalizedMessage());
          return null;
      }finally {
                //entidade.close();
      }
  }
    
    public <T> T ler(Class<T>  cl , long id){
      con.getTransaction().begin();
      try{
          return cl.cast(con.find(cl,id)); 
          
      }catch(Exception ex){
          
      }finally{
          con.close();
      }return null;
  } 
    
}
