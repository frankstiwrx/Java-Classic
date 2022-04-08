/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.frank.model;

import br.com.frank.enums.Especialidade;
import br.com.frank.enums.Sexo;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author frank
 */
@Entity
public class Proprietario implements Serializable {
    
    @Id
    @SequenceGenerator(sequenceName = "seq_proprietario",name = "seq_proprietario",initialValue = 1)
    @GeneratedValue(generator = "seq_proprietario", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nome;
    private Sexo sexo;
    private Especialidade especialidade;
    
    
    @OneToMany
    private List<Veiculo> veiculos;

    public Proprietario() {
    }

    public Proprietario(Long id) {
        this.id = id;
    }

    public Proprietario(Long id, String nome, Sexo sexo, Especialidade especialidade, List<Veiculo> veiculos) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.especialidade = especialidade;
        this.veiculos = veiculos;
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

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.id);
        hash = 29 * hash + Objects.hashCode(this.nome);
        hash = 29 * hash + Objects.hashCode(this.sexo);
        hash = 29 * hash + Objects.hashCode(this.especialidade);
        hash = 29 * hash + Objects.hashCode(this.veiculos);
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
        final Proprietario other = (Proprietario) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (this.sexo != other.sexo) {
            return false;
        }
        if (this.especialidade != other.especialidade) {
            return false;
        }
        return Objects.equals(this.veiculos, other.veiculos);
    }

    
    
    
    
}
