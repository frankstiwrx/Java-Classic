/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciador;

import categoria.Sexo;
import diversos.Mensagem;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.model.SelectItem;
import modelo.Aluno;
import modelo.ServicoAluno;

/**
 *
 * @author frank
 */
@ManagedBean
@ViewScoped
public class AlunoManagerBean implements Serializable{
    
    @EJB
    ServicoAluno servicoaluno;
    private Aluno aluno;
    private List<Aluno> alunosmasculino;
    private List<Aluno> alunosfeminino;
    private List<Aluno> alunosvariedade;
    private List<Aluno> alunos;
    
    
    
    @PostConstruct
        public void iniciar() {
        aluno = new Aluno();
        
        alunosmasculino = servicoaluno.buscartodosMasculino();
        alunosfeminino = servicoaluno.buscartodosFeminino();
        alunosvariedade = servicoaluno.buscartodosVariedades();
        alunos = servicoaluno.buscarlistageral();
    }
    
    public void salvar(Aluno aluno) {

            servicoaluno.salvar(aluno);
            Mensagem.mensagemINFOR("Salvo Com Sucesso!");
            iniciar();
        

    }

    public void atualizar() {
        servicoaluno.atualizar(aluno);
    }
    
    public List<SelectItem> getSexo() {
        List<SelectItem> items = new ArrayList<>();
        for (Sexo item : Sexo.values()) {
            items.add(new SelectItem(item, item.name()));
        }
        return items;

    }

    public ServicoAluno getServicoaluno() {
        return servicoaluno;
    }

    public void setServicoaluno(ServicoAluno servicoaluno) {
        this.servicoaluno = servicoaluno;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public List<Aluno> getAlunosmasculino() {
        return alunosmasculino;
    }

    public void setAlunosmasculino(List<Aluno> alunosmasculino) {
        this.alunosmasculino = alunosmasculino;
    }

    public List<Aluno> getAlunosfeminino() {
        return alunosfeminino;
    }

    public void setAlunosfeminino(List<Aluno> alunosfeminino) {
        this.alunosfeminino = alunosfeminino;
    }

    public List<Aluno> getAlunosvariedade() {
        return alunosvariedade;
    }

    public void setAlunosvariedade(List<Aluno> alunosvariedade) {
        this.alunosvariedade = alunosvariedade;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
  

}

