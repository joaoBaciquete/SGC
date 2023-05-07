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
@Table
public class Recepcao {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
   private String horaEnt,horaSaid;
   private String data;

    public Recepcao() {
        LocalDateTime date=LocalDateTime.now();
        this.data=String.valueOf(date);
    }
}
