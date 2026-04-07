/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.barbosaleo.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

/**
 *
 * @author Leonardo
 */
@Entity
@Table(name = "TB_CURSO")
public class Curso {
        
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="curso_sq")
    @SequenceGenerator(name="curso_sq", sequenceName="sq_curso", initialValue=1, allocationSize = 1)
    private Long id;
    
    @Column(name="CODIGO", length = 10, nullable=false, unique=true)
    private String codigo;

    @Column(name="NOME", length = 50, nullable=false)
    private String nome;
    
    @Column(name="DESCRICAO", length = 200, nullable=false)
    private String descricao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}
