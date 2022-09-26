/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author frank
 */


@Stateless
public class ServicoAluno extends ServicoGenerico {

    public ServicoAluno() {
        super(Aluno.class);
    }

    public List<Aluno> buscartodosVariedades() {
        return entityManager.createQuery("select e from Aluno e where e.sexo like 'Variedades%'").getResultList();
    }

    public List<Aluno> buscartodosFeminino() {
        return entityManager.createQuery("select e from Aluno e where e.sexo like 'Feminino%'").getResultList();
    }

    public List<Aluno> buscartodosMasculino() {
        return entityManager.createQuery("select e from Aluno e where e.sexo like 'Masculino%'").getResultList();
    }
    
    public List<Aluno> buscarlistageral() {
        return entityManager.createQuery("select e from Aluno e ").getResultList();
    }

    public List<Aluno> Buscar(String cpf) {

        String jpql = " select u from  Aluno u where u.cpf = :desc ";
        return entityManager.createQuery(jpql, Aluno.class)
                .setParameter("desc", cpf)
                .getResultList();
    }

    public Aluno Buscar2(String cpf) {

        String jpql = " select u from  Aluno u where u.cpf = :desc ";
        return entityManager.createQuery(jpql, Aluno.class)
                .setParameter("desc", cpf)
                .getSingleResult();
    }

}
