/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.rc.springtutorial.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author marcospaulo
 */
@Entity
@Table(
    name = "PessoaFisica",
    uniqueConstraints =  @UniqueConstraint(
        name = "unique_cpf",
        columnNames = {
            "cpf"
        }
    )
)
@Getter
@Setter
@EqualsAndHashCode(callSuper = false, exclude = {"dataNascimento"})
@ToString(callSuper = true, includeFieldNames = true)

public class Fisica extends Pessoa {
    
     private static final long serialVersionUID = 1L;

    private String cpf;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataNascimento;

    public Fisica() {
    }    
}