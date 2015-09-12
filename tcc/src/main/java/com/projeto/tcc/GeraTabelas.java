/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projeto.tcc;

import java.util.Calendar;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Woshington
 */
public class GeraTabelas {
     public static void main(String[] args) {
        
    Tarefa tarefa = new Tarefa();
tarefa.setDescricao("Estudar JPA");
tarefa.setFinalizado(true);
tarefa.setDataFinalizacao(Calendar.getInstance());

EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefa");
EntityManager manager = factory.createEntityManager();

//manager.getTransaction().begin();    
//manager.persist(tarefa);
//manager.getTransaction().commit();  

//System.out.println("ID da tarefa: " + tarefa.getId());
Tarefa encontrada = manager.find(Tarefa.class, 1L);

System.out.println(encontrada.getDescricao());
manager.close();
  }
}
