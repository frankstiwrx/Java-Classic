/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author frank
 */
public class Produto {
    


    //Atributos
    String nome;
    double preco;
    int quantidade;
   
    public Produto(){
        
    }
    
    public Produto(String nome, double preco, int quantidade){
    
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        
        
    }
    
    public void AlterarNome(String nome){
        this.nome = nome;
    }
    
    public void AlterarPreco(double preco){
        this.preco = preco;
    }

    public void AlterarQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "nome: " + nome + ", preco : " + preco + ", quantidade: " + quantidade;
    }
    
  
    
    
    
}
