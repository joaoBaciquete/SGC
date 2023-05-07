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
public class Morador {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String apelido;
    private String sexo;
    private String bI;
    private String titulo;
    private String endereco;
    private int data_nasc;
    private int telefone;
    private String data;

    public Morador() {
        LocalDateTime date=LocalDateTime.now();
        this.data=String.valueOf(date);
    }
    
}
