/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import javax.swing.JOptionPane;
import modeloconta.Conta;
import sistemausuario.Usuario;

/**
 *
 * @author frank
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Bem Vindo ao Sistema Bancário!"); //Mensagem de Introdução

        Conta c = new Conta(); //Criando nova conta c.

        String nome = JOptionPane.showInputDialog(null, "Insira nome Usuário:"); //Inserir Nome de Usuario.
        String cpf = JOptionPane.showInputDialog(null, "Insira o seu CPF do Usuário:"); //Inserir dado de CPF.

        Usuario novo = new Usuario(); //Criar novo usuário.
        novo.setNome(nome); //Passando os dois valores para as variáveis internas da classe Usuario.
        novo.setCpf(cpf);

        c.saldog = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o Saldo Inicial: ")); //Passar Valor do Saldo Inicial.

        int aux = 10; //Declarando valor

        while (aux != 0) { //Controlador de menu.

            aux = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha a Operação desejada:\n1. Ver Saldo\n2. Depositar\n3. Sacar\n4. Ver Dados Gerais\n0. Sair"));
            //Variavel que seleciona as opções no menu.
            if (aux == 1) {

                c.exibirsaldo();//Chama função da classe Conta que exibe o saldo.

            } else if (aux == 2) {

                c.valorg = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o Valor a ser depositado: "));//Variavel que recebe valor a ser adicionado.
                c.depositar(); //Chama função da classe Conta que acrescenta valores na conta. 

            } else if (aux == 3) {
                c.valorg = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o Valor a ser sacado: "));//Variavel que recebe valor a ser retirado.
                c.sacar(); //Chama função da classe Conta que reduz valores na conta.
            } else if (aux == 4) {

                JOptionPane.showMessageDialog(null, "Seus Dados são: \n " + "Seu Nome é " + nome + "\n" + "Seu Cpf é " + cpf + "\n" + "Seu Saldo Final é " + c.saldog);
                //Função da classe principal que exibe dados gerais    
            }
        }

        JOptionPane.showMessageDialog(null, "Encerrando Obrigado Por Usar.");//Encerramento.

    }

}
