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

    public static final String SucessFull = "Operação Realizada com sucesso";
    public static final String Failure = "Erro ao realizar a operação";
    public static final String PermissaoNegada = "Você não tem Permissão para executar esta operação !";

    public static void mensagemINFOR(String Mensage){
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO ,Mensage ,""));
    } 
     public static void mensagemError(String Mensage){
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR ,Mensage ,""));
    } 
    
}