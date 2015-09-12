/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projeto.tcc;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Woshington
 */
public class AtualizarTarefa {
    public static void main(String[] args) {
        Tarefa tarefa = new Tarefa();
tarefa.setId(2); //esse id já existe no banco
tarefa.setDescricao("Estudar JPA e Hibernate");
tarefa.setFinalizado(false);
tarefa.setDataFinalizacao(null);

EntityManagerFactory factory = Persistence.
        createEntityManagerFactory("tarefa");
        EntityManager manager=factory.createEntityManager();

manager.getTransaction().begin();
manager.merge(tarefa);
manager.getTransaction().commit();
    }
}
