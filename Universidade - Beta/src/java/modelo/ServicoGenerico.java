/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author frank
 */
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author frank
 * @param <T>
 */
public class ServicoGenerico<T> {

    final Class<T> entity;
    @PersistenceContext
    EntityManager entityManager;

    public ServicoGenerico(Class<T> entity) {
        this.entity = entity;
    }

    public void salvar(T entity) {
        entityManager.persist(entity);
    }

    public void atualizar(T entity) {
        entityManager.merge(entity);
        entityManager.flush();
    }

    public T buscar(Long entityID) {
        T objeto = getEntityManager().find(entity, entityID);
        getEntityManager().refresh(objeto);
        return objeto;
    }

    public List<T> buscartodosAtivo() {
        return entityManager.createQuery("select e from " + entity.getSimpleName() + " e where e.ativo = true ").getResultList();
    }
    
    public List<T> buscartodos(String cpf) {
        return entityManager.createQuery("select e from " + entity.getSimpleName() + " e where e.CPF = "+cpf).getResultList();
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

}
