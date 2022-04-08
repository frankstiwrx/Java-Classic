/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitario;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author frank
 */
public class Mensagem {
    
    public static void mensagemInfo(String mensagem){
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(""+FacesMessage.SEVERITY_INFO,mensagem));
    }
    public static void mensagemWarn(String mensagem){
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(""+FacesMessage.SEVERITY_WARN,mensagem));
    }
    public static void mensagemError(String mensagem){
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(""+FacesMessage.SEVERITY_ERROR,mensagem));
    }
}
