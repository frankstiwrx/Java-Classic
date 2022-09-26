/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;


import javax.swing.JOptionPane;

/**
 *
 * @author frank
 */
public class Notas {
    
    
    double nota1;
    double nota2;
    double nota3;
    double media;

    public Notas(double nota1, double nota2, double nota3, double media) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.media = media;
    }

    public Notas() {

    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public double calcularMedia() {
        
        return media = (nota1 + nota2 + nota3) / 3; 
        
    }
  
   public void situacaoAluno(){
       if(calcularMedia()>=7){
           JOptionPane.showMessageDialog(null,"Aprovado.");
       }
       else if(calcularMedia()<7 && calcularMedia()>=4){
           JOptionPane.showMessageDialog(null, "Recuperação.");
       }
       else{
           JOptionPane.showMessageDialog(null, "Reprovado.");
       }
   }
    
    @Override
    public String toString() {
        return "As Notas do Aluno São:\n" + "Primeira nota : " + nota1 + "\nSegunda nota : " + nota2 + "\nTerceira nota : " + nota3 + "\nMedia : " + calcularMedia();
    }

}
