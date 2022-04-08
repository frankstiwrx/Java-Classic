/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.frank.util;

import br.com.frank.enums.Especialidade;
import br.com.frank.enums.Sexo;
import br.com.frank.enums.Tipo;
import br.com.frank.enums.Tracao;
import br.com.frank.model.Proprietario;
import br.com.frank.model.Veiculo;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

/**
 *
 * @author frank
 */
public class GerarTabela {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        
        Veiculo carro = new Veiculo();
    Proprietario piloto = new Proprietario();
   
    String name = JOptionPane.showInputDialog(null, "Insira nome do Veiculo: ");
    String indice = (JOptionPane.showInputDialog(null, "Insira o Chassis: "));
    int year = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o ano do veiculo: "));
    String col = JOptionPane.showInputDialog(null, "Insira cor do Veiculo: ");
    String manu = JOptionPane.showInputDialog(null, "Insira Marca do Veiculo: ");
    
    int aux1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o tipo do veiculo:\n0. Sedan\n1. Hatch\n2. Coupe\n3. Wagon\n4. Especial\n5. Utilitario\n"));
    
//Sedan,Hatch,Coupe,Wagon,Especial,Utilitari
    if(aux1==0){
    carro.setTipo(Tipo.Sedan);
    }
    else if(aux1==1){
        carro.setTipo(Tipo.Hatch);
    }
    else if(aux1==2){
        carro.setTipo(Tipo.Coupe);
    }
    else if(aux1==3){
        carro.setTipo(Tipo.Wagon);
    }    
    else if(aux1==4){
        carro.setTipo(Tipo.Especial);
    }
    else if(aux1==5){
        carro.setTipo(Tipo.Utilitario);
    }

    int aux2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o tração do veiculo:\n0. Traseira\n1. Dianteira\n2. Integral"));
    
    if(aux2==0){
    carro.setTracao(Tracao.Traseira);
    }
    else if(aux2==1){
        carro.setTracao(Tracao.Dianteira);
    }
    else if(aux2==2){
        carro.setTracao(Tracao.Integral);
    }
    
    carro.setNome(name);
    carro.setChassis(indice);
    carro.setAno(year);
    carro.setCor(col);
    carro.setFabricante(manu);
    
    String name2 = JOptionPane.showInputDialog(null, "Insira o nome do dono: ");
            
    
    int aux3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o sexo do dono:\n0. Masculino\n1. Feminino"));
    if (aux3==0){
        piloto.setSexo(Sexo.Masculino);
    }
    else if(aux3==1){
        piloto.setSexo(Sexo.Feminino);
    }
    int aux4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a Especialidade do piloto:\n0. Drift\n1. Drag\n2. Circuito\n3. Rally\n4. Rei\n5. Sprint\n"));
    
//Sedan,Hatch,Coupe,Wagon,Especial,Utilitari
    if(aux4==0){
    piloto.setEspecialidade(Especialidade.Drift);
    }
    else if(aux4==1){
        
    piloto.setEspecialidade(Especialidade.Drag);
    }
    else if(aux4==2){
        
    piloto.setEspecialidade(Especialidade.Circuito);
    }
    else if(aux4==3){
        
    piloto.setEspecialidade(Especialidade.Rally);
    }    
    else if(aux4==4){
       
    piloto.setEspecialidade(Especialidade.Rei);
    }
    else if(aux4==5){
        
    piloto.setEspecialidade(Especialidade.Sprint);
    }
    
    piloto.setNome(name2);
    
        
  
        
        
       EntityManager em = Persistence.createEntityManagerFactory("RegistroVeiculosPU").createEntityManager();
       em.getTransaction().begin();
       em.persist(carro);
       em.persist(piloto);
      
       
       em.getTransaction().commit();
       em.close();
       
        
    }
    
}
