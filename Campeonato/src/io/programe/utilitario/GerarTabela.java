package io.programe.utilitario;

import io.programe.enums.Posicao;
import io.programe.enums.Sexo;
import io.programe.modelo.Jogador;
import io.programe.modelo.Tecnico;
import io.programe.modelo.Time;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;



// CLASSE DESTINADA A GERAR TABELA E TESTAR O MAPEAMENTO
public class GerarTabela {
    
    
    public static void main(String[] args) {
        // INSTANCIANDO OBJETOS
        
        
        // INSTANCIANDO JOGADOR
        Jogador jogador1 = new Jogador();
        jogador1.setNome("João Pedro");
        jogador1.setPosicao(Posicao.Zagueiro);
        jogador1.setNumero(4);
        
        Jogador jogador2 = new Jogador();
        jogador2.setNome("Lukas Maques");
        jogador2.setPosicao(Posicao.Atacante);
        jogador2.setNumero(10);
        
        
        // INSTANCIANDO TECNICO
        
        Tecnico tecnico = new Tecnico();
        tecnico.setNome("Ely Júnior");
        tecnico.setSexo(Sexo.Masculino);
        tecnico.setSalario(30.00);
        
        
        // INSTANCIANDO O TIME
        
        Time t = new Time();
        t.setNome("Flamengo");
        t.setTecnico(tecnico);
       
        
        // INSTANCIANDO LISTA DE JOGADORES PARA SER UTILIZADO NO TIME
        List<Jogador> jogadores = new ArrayList<>();
        jogadores.add(jogador1);
        jogadores.add(jogador2);
        
        
        t.setJogadores(jogadores);
        
        
        
        
        
        
        
        // INICIANDO O GERENCIADOR DE BANCO DE DADOS
        EntityManager em = Persistence.createEntityManagerFactory("CampeonatoPU").createEntityManager();
        em.getTransaction().begin();
        em.persist(jogador1);
        em.persist(jogador2);
        em.persist(tecnico);
        em.persist(t);
        em.getTransaction().commit();
        em.close();
    
    
    }
    
}
