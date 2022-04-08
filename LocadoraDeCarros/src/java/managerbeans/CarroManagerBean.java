/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managerbeans;

import Servico.CarroServico;
import Servico.MarcaServico;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.Carro;
import modelo.Marca;
import utilitario.Mensagem;

/**
 *
 * @author frank
 */
@ManagedBean
@ViewScoped
public class CarroManagerBean implements Serializable {

    @EJB
    CarroServico carroServico;
    @EJB
    MarcaServico marcaServico;
    private Carro carro;
    private Marca marca;
    
    
    
    @PostConstruct
    public void iniciar() {

        carro = new Carro();
        marca = new Marca();
        carro.setMarca(marca);
        
    }

    public void salvar() {
        marcaServico.salvar(marca);
        carro.setMarca(marca);
        carroServico.salvar(carro);
        Mensagem.mensagemInfo("Salvo com Sucesso");
        iniciar();

    }

    public void atualizar() {
        carroServico.atualizar(carro);
    }

    public CarroServico getCarroServico() {
        return carroServico;
    }

    public void setCarroServico(CarroServico carroServico) {
        this.carroServico = carroServico;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public MarcaServico getMarcaServico() {
        return marcaServico;
    }

    public void setMarcaServico(MarcaServico marcaServico) {
        this.marcaServico = marcaServico;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    

}
