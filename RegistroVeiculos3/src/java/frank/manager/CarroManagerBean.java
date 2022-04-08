/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frank.manager;

import frank.modelo.Carro;
import frank.util.Mensagem;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author frank
 */
@ManagedBean
@ViewScoped
public class CarroManagerBean implements Serializable {

    private Carro carro;
    private List<Carro> carros;
    private Mensagem mensagem;
    
    @PostConstruct
    public void iniciar() {
        this.carro = new Carro();
        this.carros = new ArrayList<>();

    }

    public void imprimir(){
        Mensagem.mensagemInformacao("Sucesso!","Seu Carro "+carro.getNome()+" foi cadastrado com sucesso");
    }
    
    public void adicionarCarro(){
        this.carros.add(this.carro);
        imprimir();
        this.carro = new Carro();
        
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }

}
