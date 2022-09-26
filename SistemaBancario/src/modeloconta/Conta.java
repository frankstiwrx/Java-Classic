/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloconta;

import javax.swing.JOptionPane;

/**
 *
 * @author frank
 */
public class Conta {

    public double saldog;
    public double valorg;
    
    
    public Conta(double saldog, double valorg) {
        this.saldog = saldog;
        this.valorg = valorg;
    }

    
    public Conta() {
        
    }

    
    
    public void exibirsaldo() {
        JOptionPane.showMessageDialog(null, "Seu Saldo é "+saldog);
    }

    
    
    public void depositar() {
        saldog = saldog + valorg;
       
    }

    
    
    public void sacar() {
        if (valorg > saldog) {
            JOptionPane.showMessageDialog(null, "Saldo Insuficiente!");
            
        } else {
            saldog = saldog - valorg;
            
        }   
}

    
    
    
    
    public double getSaldog() {
        return saldog;
    }

    public void setSaldog(double saldog) {
        this.saldog = saldog;
    }

    public double getValorg() {
        return valorg;
    }

    public void setValorg(double valorg) {
        this.valorg = valorg;
    }

    
    
    
}