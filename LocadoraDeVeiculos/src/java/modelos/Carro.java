/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import enums.Categoria;
import enums.Classe;
import enums.Sexo;
import enums.Tracao;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author frank
 */
@Entity
public class Carro implements Serializable{
    @Id
    @SequenceGenerator(sequenceName = "SequenciaCarros", name = "SequenciaCarros", initialValue = 1)
    @GeneratedValue(generator = "SequenciaCarros", strategy = GenerationType.SEQUENCE)
    
    private Long id;
    @Column(length = 48)
    private String nome;
    @Column(length = 7)
    private String placa;
    @Enumerated(EnumType.STRING)
    private Tracao tracao;
    @Enumerated(EnumType.STRING)
    private Classe classe;
    @Enumerated(EnumType.STRING)
    private Categoria categoria;
    @OneToOne
    private Fabricante fabricante;
    private boolean ativo = true;

    public Carro() {
    }

    public Carro(Long id, String nome, String placa, Tracao tracao, Classe classe, Categoria categoria, Fabricante fabricante) {
        this.id = id;
        this.nome = nome;
        this.placa = placa;
        this.tracao = tracao;
        this.classe = classe;
        this.categoria = categoria;
        this.fabricante = fabricante;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Tracao getTracao() {
        return tracao;
    }

    public void setTracao(Tracao tracao) {
        this.tracao = tracao;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.id);
        hash = 59 * hash + Objects.hashCode(this.nome);
        hash = 59 * hash + Objects.hashCode(this.placa);
        hash = 59 * hash + Objects.hashCode(this.tracao);
        hash = 59 * hash + Objects.hashCode(this.classe);
        hash = 59 * hash + Objects.hashCode(this.categoria);
        hash = 59 * hash + Objects.hashCode(this.fabricante);
        hash = 59 * hash + (this.ativo ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carro other = (Carro) obj;
        if (this.ativo != other.ativo) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.placa, other.placa)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (this.tracao != other.tracao) {
            return false;
        }
        if (this.classe != other.classe) {
            return false;
        }
        if (this.categoria != other.categoria) {
            return false;
        }
        if (!Objects.equals(this.fabricante, other.fabricante)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Carro{" + "id=" + id + ", nome=" + nome + ", placa=" + placa + ", tracao=" + tracao + ", classe=" + classe + ", categoria=" + categoria + ", fabricante=" + fabricante + ", ativo=" + ativo + '}';
    }
    
    
    
    }
