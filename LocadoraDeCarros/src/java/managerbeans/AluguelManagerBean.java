/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managerbeans;

import Servico.AluguelServico;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.Aluguel;
import utilitario.Mensagem;

/**
 *
 * @author frank
 */
@ManagedBean
@ViewScoped
public class AluguelManagerBean implements Serializable{

    @EJB
    AluguelServico aluguelServico;

    Aluguel aluguel;

    @PostConstruct
    public void iniciar() {
        aluguel = new Aluguel();
    }

    public void salvar() {
        aluguelServico.salvar(aluguel);
        Mensagem.mensagemInfo("Salvo com Sucesso");
        iniciar();
        
    }

    public void atualizar() {
        aluguelServico.atualizar(aluguel);
    }

    public AluguelServico getAluguelServico() {
        return aluguelServico;
    }

    public void setAluguelServico(AluguelServico aluguelServico) {
        this.aluguelServico = aluguelServico;
    }

    public Aluguel getAluguel() {
        return aluguel;
    }

    public void setAluguel(Aluguel aluguel) {
        this.aluguel = aluguel;
    }

}
