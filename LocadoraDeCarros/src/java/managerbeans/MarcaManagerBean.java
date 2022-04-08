/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managerbeans;

import Servico.MarcaServico;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.Marca;
import utilitario.Mensagem;

/**
 *
 * @author frank
 */
@ManagedBean
@ViewScoped
public class MarcaManagerBean implements Serializable {

    @EJB
    MarcaServico marcaServico;
    private Marca marca;

    @PostConstruct
    public void iniciar() {

        marca = new Marca();

    }

    public void salvar() {
        marcaServico.salvar(marca);
        Mensagem.mensagemInfo("Salvo com Sucesso");
        iniciar();

    }

    public void atualizar() {
        marcaServico.atualizar(marca);
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
