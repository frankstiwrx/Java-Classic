/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author frank
 */
public class Aluno {
    String nome;
    int idade;
    String cpf;
    String codigoMatricula;
    
    public Aluno() {
        
    }

    public Aluno(String nome, int idade, String cpf, String codigoMatricula) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.codigoMatricula = codigoMatricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCodigoMatricula() {
        return codigoMatricula;
    }

    public void setCodigoMatricula(String codigoMatricula) {
        this.codigoMatricula = codigoMatricula;
    }
    
    
    @Override
    public String toString() {
        return "Dados do Aluno:\n" + "Nome: " + nome + "\nIdade: " + idade + "\nCPF: " + cpf + "\nCodigo de Matricula : " + codigoMatricula;
    }


    
    
}
