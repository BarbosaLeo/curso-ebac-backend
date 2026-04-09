/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.barbosaleo.domain;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Leonardo
 */
@Entity
@Table(name="TB_CARRO")
public class Carro {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="carro_sq")
    @SequenceGenerator(name="carro_sq", sequenceName="sq_carro", initialValue=1, allocationSize = 1)
    private Long id;
    
    @Column(name="codigo", length = 10, nullable=false, unique=true)
    private String codigo;
    
    @Column(name="nome", length = 50, nullable=false)
    private String nome;
    
    @ManyToOne
    @JoinColumn(name="id_marca_fk",
        foreignKey = @ForeignKey(name="fk_marca_carro"),
        referencedColumnName = "id", nullable = false
    )
    private Marca marca;
    
    @Column(name="valor",nullable=false)
    private Double valor;
    
    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
        name= "TB_CARRO_ACESSORIO",
        joinColumns = {@JoinColumn(name="id_carro_fk")},
        inverseJoinColumns = {@JoinColumn(name="id_acessorio_fk")}
    )
    private List<Acessorio> acessorios;

    public Carro(){
        this.acessorios = new ArrayList<Acessorio>();
    }
    
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

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public List<Acessorio> getAcessorios() {
        return acessorios;
    }

    public void setAcessorios(List<Acessorio> acessorios) {
        this.acessorios = acessorios;
    }
    
    public void addAcessorio(Acessorio a){
        this.acessorios.add(a);
    }
}
