/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.USER;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Lenovo T460
 */
@Entity
@Table(name ="empcondominio")
public class EmpregadosCond implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String categoria;
    private String data;
    @JoinColumn(name = "emp_id", unique = true)
    @ManyToOne(cascade = CascadeType.ALL)
    private Empregdos emp;

    public EmpregadosCond() {
        LocalDateTime date=LocalDateTime.now();
        this.data=String.valueOf(date);
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Empregdos getEmp() {
        return emp;
    }

    public void setEmp(Empregdos emp) {
        this.emp = emp;
    }

    @Override
    public String toString() {
        return "EmpregadosCond{" + "categoria=" + categoria + ", data=" + data + ", emp=" + emp + '}';
    }
  
    
    
}
