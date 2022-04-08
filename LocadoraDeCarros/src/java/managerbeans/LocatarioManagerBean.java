/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managerbeans;

import Servico.LocatarioServico;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.Locatario;
import utilitario.Mensagem;

/**
 *
 * @author frank
 */
@ManagedBean
@ViewScoped
public class LocatarioManagerBean implements Serializable{

    @EJB
    LocatarioServico locatarioServico;

    Locatario locatario;

    @PostConstruct
    public void iniciar() {
        locatario = new Locatario();
    }

    public void salvar() {
        locatarioServico.salvar(locatario);
        Mensagem.mensagemInfo("Salvo com Sucesso");
        iniciar();
        
    }

    public void atualizar() {
        locatarioServico.atualizar(locatario);
    }

    public LocatarioServico getLocatarioServico() {
        return locatarioServico;
    }

    public void setLocatarioServico(LocatarioServico locatarioServico) {
        this.locatarioServico = locatarioServico;
    }

    public Locatario getLocatario() {
        return locatario;
    }

    public void setLocatario(Locatario locatario) {
        this.locatario = locatario;
    }

}
