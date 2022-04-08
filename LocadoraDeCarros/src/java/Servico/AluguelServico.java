/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servico;

import generico.ServicoGenerico;
import javax.ejb.Stateless;
import modelo.Aluguel;

/**
 *
 * @author frank
 */
@Stateless
public class AluguelServico extends ServicoGenerico<Aluguel> {
    
    public AluguelServico() {
        super(Aluguel.class);
    }
    
    
}
