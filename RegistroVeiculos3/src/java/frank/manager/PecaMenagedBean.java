/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frank.manager;

import frank.modelo.PecasEmEstoque;
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
public class PecaMenagedBean implements Serializable{
    
    private PecasEmEstoque peca;
    private List<PecasEmEstoque>pecas;
    
    @PostConstruct
    public void iniciar(){
        this.peca = new PecasEmEstoque();
        this.pecas = new ArrayList<>();
        
    }

    public PecasEmEstoque getPeca() {
        return peca;
    }

    public void setPeca(PecasEmEstoque peca) {
        this.peca = peca;
    }

    public List<PecasEmEstoque> getPecas() {
        return pecas;
    }

    public void setPecas(List<PecasEmEstoque> pecas) {
        this.pecas = pecas;
    }
    
    public void imprimir(){
        Mensagem.mensagemInformacao("Sucesso!","Sua peça "+peca.getNome()+" foi cadastrada com sucesso");
    }
    
    public void adicionarPeca(){
        
        this.pecas.add(this.peca);
        imprimir();
        this.peca = new PecasEmEstoque();
        
    }
    
    
}
