/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import enums.Setor;
import enums.Sexo;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author frank
 */
@Entity
public class Pessoa implements Serializable {

    @Id
    @SequenceGenerator(sequenceName = "SequenciaPessoas", name = "SequenciaPessoas", initialValue = 1)
    @GeneratedValue(generator = "SequenciaPessoas", strategy = GenerationType.SEQUENCE)

    private Long id;
    @Column(length = 48)
    private String nome;
    @Column(length = 11)
    private String CPF;
    @Enumerated(EnumType.STRING)
    private Sexo sexo;
    @Enumerated(EnumType.STRING)
    private Setor setor;
    private boolean ativo = true;

    public Pessoa() {
    }

    public Pessoa(Long id, String nome, String CPF, Sexo sexo, Setor setor) {
        this.id = id;
        this.nome = nome;
        this.CPF = CPF;
        this.sexo = sexo;
        this.setor = setor;
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

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.id);
        hash = 59 * hash + Objects.hashCode(this.nome);
        hash = 59 * hash + Objects.hashCode(this.CPF);
        hash = 59 * hash + Objects.hashCode(this.sexo);
        hash = 59 * hash + Objects.hashCode(this.setor);
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
        final Pessoa other = (Pessoa) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.CPF, other.CPF)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (this.sexo != other.sexo) {
            return false;
        }
        if (this.setor != other.setor) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", nome=" + nome + ", CPF=" + CPF + ", sexo=" + sexo + ", setor=" + setor + '}';
    }

    public boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

}
