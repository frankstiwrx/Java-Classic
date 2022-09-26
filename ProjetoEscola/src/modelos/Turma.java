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
public class Turma {

    String materia;
    int quantidadeAlunos;
    double mediaBase;
    String codigoTurma;

    public Turma(String materia, int quantidadeAlunos, double mediaBase, String codigoTurma) {
        this.materia = materia;
        this.quantidadeAlunos = quantidadeAlunos;
        this.mediaBase = mediaBase;
        this.codigoTurma = codigoTurma;
    }

    public Turma() {
        
    }

    
    
    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getQuantidadeAlunos() {
        return quantidadeAlunos;
    }

    public void setQuantidadeAlunos(int quantidadeAlunos) {
        this.quantidadeAlunos = quantidadeAlunos;
    }

    public double getMediaBase() {
        return mediaBase;
    }

    public void setMediaBase(double mediaBase) {
        this.mediaBase = mediaBase;
    }

    public String getCodigoTurma() {
        return codigoTurma;
    }

    public void setCodigoTurma(String codigoTurma) {
        this.codigoTurma = codigoTurma;
    }

    @Override
    public String toString() {
        return "Dados da Turma:\n" + "Materia: " + materia + "\nQuantidade de Alunos: " + quantidadeAlunos + "\nMedia Base: " + mediaBase + "\nCodigo da Turma: " + codigoTurma;
    }
    
    
}
