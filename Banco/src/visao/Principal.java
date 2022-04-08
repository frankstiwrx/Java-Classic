/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import metodos.Conta;

/**
 *
 * @author frank
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Conta conta = new Conta();

	
	conta.setSaldo(1600.00);

	
	conta.depositar(400.0);
        
	conta.sacar(1500);
        
	conta.verificaSaldo();

    }
    
}
