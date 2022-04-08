/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servico;

import generico.ServicoGenerico;
import javax.ejb.Stateless;
import modelo.Locatario;

/**
 *
 * @author frank
 */
@Stateless
public class LocatarioServico extends ServicoGenerico<Locatario>{
    
    public LocatarioServico() {
        super(Locatario.class);
    }
    
}
