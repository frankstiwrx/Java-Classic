/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servico;

import generico.ServicoGenerico;
import javax.ejb.Stateless;
import modelo.Carro;

/**
 *
 * @author frank
 */
@Stateless
public class CarroServico extends ServicoGenerico<Carro> {
    
    public CarroServico(){
        super(Carro.class);
    }
    
    
    
}
