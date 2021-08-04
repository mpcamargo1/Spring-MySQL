/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.rc.springtutorial.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author marcospaulo
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Acesso implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @Column(name = "acesso_usuario")
    private String usuario;
    @Column(name = "acesso_senha")
    private String senha;

    public Acesso() {
    }
}