/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.util.List;
import javax.ejb.Stateless;
import modelos.Pessoa;

/**
 *
 * @author frank
 */
@Stateless
public class ServicoPessoa extends ServicoGenerico {

    public ServicoPessoa() {
        super(Pessoa.class);
    }

    public List<Pessoa> buscartodosCamarote() {
        return entityManager.createQuery("select e from Pessoa e where e.setor like 'Camarote%' and e.ativo = true ").getResultList();
    }

    public List<Pessoa> buscartodosPista() {
        return entityManager.createQuery("select e from Pessoa e where e.setor like 'Pista%' and e.ativo = true ").getResultList();
    }

    public List<Pessoa> buscartodosFront() {
        return entityManager.createQuery("select e from Pessoa e where e.setor like 'Front%' and e.ativo = true ").getResultList();
    }

    public List<Pessoa> Buscafffqdq(String cpf) {

        String jpql = " select u from  Pessoa u where u.CPF = :desc ";
        return entityManager.createQuery(jpql, Pessoa.class)
                .setParameter("desc", cpf)
                .getResultList();
    }

    public Pessoa Buscar2(String cpf) {

        String jpql = " select u from  Pessoa u where u.CPF = :desc ";
        return entityManager.createQuery(jpql, Pessoa.class)
                .setParameter("desc", cpf)
                .getSingleResult();
    }

}
