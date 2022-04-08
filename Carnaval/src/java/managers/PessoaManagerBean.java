/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import daos.ServicoPessoa;
import enums.Setor;
import enums.Sexo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.model.SelectItem;
import modelos.Pessoa;
import utilitario.Mensagem;

/**
 *
 * @author frank
 */
@ManagedBean
@ViewScoped
public class PessoaManagerBean implements Serializable {

    @EJB
    ServicoPessoa servicopessoa;
    private Pessoa pessoa;
    private List<Pessoa> pessoas;
    private List<Pessoa> pessoas2;
    private List<Pessoa> pessoas3;
    private List<Pessoa> pessoas4;

    @PostConstruct
    public void iniciar() {
        pessoa = new Pessoa();
        pessoas = servicopessoa.buscartodosAtivo();
        pessoas2 = servicopessoa.buscartodosCamarote();
        pessoas3 = servicopessoa.buscartodosFront();
        pessoas4 = servicopessoa.buscartodosPista();
    }

    public void salvar(Pessoa pessoa) {

        if (servicopessoa.Buscafffqdq(pessoa.getCPF()).size() > 0) {
            Pessoa p = servicopessoa.Buscar2(pessoa.getCPF());
            p.setAtivo(true);
            servicopessoa.atualizar(p);
            Mensagem.mensagemINFOR("Atualizado Com Sucesso!");
            iniciar();
        } else {
            servicopessoa.salvar(pessoa);
            Mensagem.mensagemINFOR("Salvo Com Sucesso!");
            iniciar();
        }

    }

    public void atualizar() {
        servicopessoa.atualizar(pessoa);
    }

    public void removerPessoa(Pessoa item) {

        item.setAtivo(false);
        servicopessoa.atualizar(item);
        Mensagem.mensagemINFOR("Pessoa Removida.");
        iniciar();
    }

    public ServicoPessoa getServicopessoa() {
        return servicopessoa;
    }

    public void setServicopessoa(ServicoPessoa servicopessoa) {
        this.servicopessoa = servicopessoa;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public List<SelectItem> getSexo() {
        List<SelectItem> items = new ArrayList<>();
        for (Sexo item : Sexo.values()) {
            items.add(new SelectItem(item, item.name()));
        }
        return items;

    }

    public List<SelectItem> getSetor() {
        List<SelectItem> items = new ArrayList<>();
        for (Setor item : Setor.values()) {
            items.add(new SelectItem(item, item.name()));
        }
        return items;

    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public List<Pessoa> getPessoas2() {
        return pessoas2;
    }

    public void setPessoas2(List<Pessoa> pessoas2) {
        this.pessoas2 = pessoas2;
    }

    public List<Pessoa> getPessoas3() {
        return pessoas3;
    }

    public void setPessoas3(List<Pessoa> pessoas3) {
        this.pessoas3 = pessoas3;
    }

    public List<Pessoa> getPessoas4() {
        return pessoas4;
    }

    public void setPessoas4(List<Pessoa> pessoas4) {
        this.pessoas4 = pessoas4;
    }

}
