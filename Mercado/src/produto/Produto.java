/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produto;

/**
 *
 * @author frank
 */
public class Produto {

    //Atributos
    String nome;
    String marca;
    double preco;
    int quantidade; //Quantidade produto
    int validade; //Validade em Meses

    //Construtor
    public Produto(String nome, String marca, double preco, int quantidade, int validade) {
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
        this.quantidade = quantidade;
        this.validade = validade;
    }

    public Produto() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

//Métodos
    public void uso() {

        System.out.println("O Produto" + " " + nome + " " + "da marca" + " " + marca + " " + "foi Usado.");

    }

    public void lucro() {

        System.out.println("O produto" + " " + nome + " " + "foi vendido por valor superior ao preço" + " " + preco);

    }

    public void vencer() {

        System.out.println("O produto" + " " + nome + " " + "venceu e deu prejuizo de" + " " + preco);

    }

    @Override
    public String toString() {
        return "Produto{" + "nome=" + nome + ", marca=" + marca + ", pre\u00e7o=" + preco + ", quantidade=" + quantidade + ", validade=" + validade + '}';
    }
}
