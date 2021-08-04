/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.rc.springtutorial.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
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
    name = "PessoaJuridica",
    uniqueConstraints =  @UniqueConstraint(
        name = "unique_cnpj",
        columnNames = {
            "cnpj"
        }
    )
)
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true, includeFieldNames = true)
public class Juridica extends Pessoa {
    
    private static final long serialVersionUID = 1L;

    private String cnpj;

    public Juridica() {
    }
}
