/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.USER;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Lenovo T460
 */
@Entity
@Table(name = "financas")
public class Financas {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private float pagamente;
    private String data;

    public Financas() {
        LocalDateTime date=LocalDateTime.now();
        this.data=String.valueOf(date);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getPagamente() {
        return pagamente;
    }

    public void setPagamente(float pagamente) {
        this.pagamente = pagamente;
    }

    @Override
    public String toString() {
        return "Financas{" + "id=" + id + ", pagamente=" + pagamente + '}';
    }
    
}
