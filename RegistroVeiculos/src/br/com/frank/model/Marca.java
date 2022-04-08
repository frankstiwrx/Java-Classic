package br.com.frank.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Marca implements Serializable{
    
    @Id
    @SequenceGenerator(sequenceName = "seq_marca", name = "seq_marca",initialValue = 1)
    @GeneratedValue(generator = "seq_marca" , strategy = GenerationType.SEQUENCE)
    private long id;
    private String nome;
    private String ano;
    private String nacionalidade;

    public Marca() {
    }

    public Marca(long id, String nome, String ano, String nacionalidade) {
        this.id = id;
        this.nome = nome;
        this.ano = ano;
        this.nacionalidade = nacionalidade;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 53 * hash + Objects.hashCode(this.nome);
        hash = 53 * hash + Objects.hashCode(this.ano);
        hash = 53 * hash + Objects.hashCode(this.nacionalidade);
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
        final Marca other = (Marca) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.ano, other.ano)) {
            return false;
        }
        return Objects.equals(this.nacionalidade, other.nacionalidade);
    }
    
    
}
