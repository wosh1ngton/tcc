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
public class RemoveTarefa {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.
        createEntityManagerFactory("tarefa");
        EntityManager manager=factory.createEntityManager();
        
        Tarefa encontrada = manager.find(Tarefa.class, 1L);

manager.getTransaction().begin();
manager.remove(encontrada);
manager.getTransaction().commit();
    }
}
