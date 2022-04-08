/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author frank
 */
public class Conta {
    
    public Double saldo;
    public Double valor;
    
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void depositar(Double valor){
		saldo += valor;
	}

	public void verificaSaldo(){
		System.out.println("Valor do Saldo: "+getSaldo());
	}
        
        public void sacar(double valor){
            if(saldo>valor){
                saldo = saldo - valor;
            }
            else{
                System.out.println("Saldo Insuficiente!");
            }
        }
}

