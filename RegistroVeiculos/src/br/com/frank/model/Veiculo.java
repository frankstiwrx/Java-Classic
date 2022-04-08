package br.com.frank.model;

import br.com.frank.enums.Tipo;
import br.com.frank.enums.Tracao;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Veiculo implements Serializable {
    
    @Id
    @SequenceGenerator(sequenceName = "seq_veiculos",name = "seq_veiculos", initialValue = 1)
    @GeneratedValue(generator = "seq_veiculos", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nome;
    private String chassis;
    private int ano;
    private String cor;
    @Enumerated(EnumType.STRING)
    private Tracao tracao;
    @Enumerated(EnumType.STRING)
    private Tipo tipo;
    private String fabricante;
    
    public Veiculo() {
    }

    public Veiculo(long id, String nome, String chassis, int ano, String cor, Tracao tracao, Tipo tipo) {
        this.id = id;
        this.nome = nome;
        this.chassis = chassis;
        this.ano = ano;
        this.cor = cor;
        this.tracao = tracao;
        this.tipo = tipo;
        
    }

    public Veiculo(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
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

    public String getChassis() {
        return chassis;
    }

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Tracao getTracao() {
        return tracao;
    }

    public void setTracao(Tracao tracao) {
        this.tracao = tracao;
    }

    public Tipo getTipo() {
        return tipo;
    }
    
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 97 * hash + Objects.hashCode(this.nome);
        hash = 97 * hash + Objects.hashCode(this.chassis);
        hash = 97 * hash + this.ano;
        hash = 97 * hash + Objects.hashCode(this.cor);
        hash = 97 * hash + Objects.hashCode(this.tracao);
        hash = 97 * hash + Objects.hashCode(this.tipo);
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
        final Veiculo other = (Veiculo) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.ano != other.ano) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.chassis, other.chassis)) {
            return false;
        }
        if (!Objects.equals(this.cor, other.cor)) {
            return false;
        }
        if (this.tracao != other.tracao) {
            return false;
        }
        return this.tipo == other.tipo;
    }
    
    
    
   
    
    
    
    
}
