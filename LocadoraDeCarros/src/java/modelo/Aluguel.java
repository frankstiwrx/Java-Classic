/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author frank
 */
@Entity
public class Aluguel implements Serializable {

    @Id
    @SequenceGenerator(sequenceName = "SequenciaAluguel", name = "SequenciaAluguel", initialValue = 1)
    @GeneratedValue(generator = "SequenciaAluguel", strategy = GenerationType.SEQUENCE)
    private Long id;
    @Temporal(TemporalType.DATE)
    private Date dataAluguel;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataDevolucao;
    @OneToOne
    private Locatario locatario;
    @OneToMany
    private List<Carro> carros;

    public Aluguel() {
    }

    public Aluguel(Long id, Date dataAluguel, Date dataDevolucao, Locatario locatario, List<Carro> carros) {
        this.id = id;
        this.dataAluguel = dataAluguel;
        this.dataDevolucao = dataDevolucao;
        this.locatario = locatario;
        this.carros = carros;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataAluguel() {
        return dataAluguel;
    }

    public void setDataAluguel(Date dataAluguel) {
        this.dataAluguel = dataAluguel;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Locatario getLocatario() {
        return locatario;
    }

    public void setLocatario(Locatario locatario) {
        this.locatario = locatario;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.id);
        hash = 59 * hash + Objects.hashCode(this.dataAluguel);
        hash = 59 * hash + Objects.hashCode(this.dataDevolucao);
        hash = 59 * hash + Objects.hashCode(this.locatario);
        hash = 59 * hash + Objects.hashCode(this.carros);
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
        final Aluguel other = (Aluguel) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.dataAluguel, other.dataAluguel)) {
            return false;
        }
        if (!Objects.equals(this.dataDevolucao, other.dataDevolucao)) {
            return false;
        }
        if (!Objects.equals(this.locatario, other.locatario)) {
            return false;
        }
        if (!Objects.equals(this.carros, other.carros)) {
            return false;
        }
        return true;
    }

}
