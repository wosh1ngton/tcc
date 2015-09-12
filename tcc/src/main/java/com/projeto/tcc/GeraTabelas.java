/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projeto.tcc;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Woshington
 */
public class GeraTabelas {
     public static void main(String[] args) {
    EntityManagerFactory factory = Persistence.
          createEntityManagerFactory("tarefa");

    factory.close();
  }
}
