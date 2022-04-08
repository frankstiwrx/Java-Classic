/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frank.modelo;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author frank
 */
public class Carro {

    private Long id;
    private String nome;
    private int ano;
    private String placa;
    private String valor;
    private List<PecasEmEstoque> pecas;
    private Marca marca;

    public Carro() {
    }

    public Carro(Long id, String nome, int ano, String placa, String valor, List<PecasEmEstoque> pecas, Marca marca) {
        this.id = id;
        this.nome = nome;
        this.ano = ano;
        this.placa = placa;
        this.valor = valor;
        this.pecas = pecas;
        this.marca = marca;
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

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public List<PecasEmEstoque> getPecas() {
        return pecas;
    }

    public void setPecas(List<PecasEmEstoque> pecas) {
        this.pecas = pecas;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.id);
        hash = 37 * hash + Objects.hashCode(this.nome);
        hash = 37 * hash + this.ano;
        hash = 37 * hash + Objects.hashCode(this.placa);
        hash = 37 * hash + Objects.hashCode(this.valor);
        hash = 37 * hash + Objects.hashCode(this.pecas);
        hash = 37 * hash + Objects.hashCode(this.marca);
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
        if (this.ano != other.ano) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.placa, other.placa)) {
            return false;
        }
        if (!Objects.equals(this.valor, other.valor)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.pecas, other.pecas)) {
            return false;
        }
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        return true;
    }

}
