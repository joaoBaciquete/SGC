/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.USER;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

/**
 *
 * @author Lenovo T460
 */
@Entity
@Table
public class EmpregadosDom{
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private long id;
@JoinColumn(name = "emp_id")
private Empregdos emp;
@Column(name = "categoria")
private String Categoria;
    
}
