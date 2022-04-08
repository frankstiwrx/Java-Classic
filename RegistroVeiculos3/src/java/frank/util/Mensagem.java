/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frank.util;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author frank
 */
public class Mensagem {

    public static void mensagemInformacao(String mensagemTitulo, String mensagemCorpo) {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(mensagemTitulo,mensagemCorpo));
    }
}
