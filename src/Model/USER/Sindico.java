/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.USER;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
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
@Table (name = "sindico")
public class Sindico implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "apelido")
    private String apelido;
    @Column(name = "bi")
    private String bI;
    @Column(name = "endereco")
    private String adress;
    @Column(name = "perfil")
    private String perfil;
    @Column(name = "senha")// nao se usa ; para Persistencia de dados
    private String senha;
    @Column(name = "data")
     private String data;
  
    public Sindico() {
        LocalDateTime date=LocalDateTime.now();
        this.data=String.valueOf(date);
    }
    
    
}
