/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projeto.tcc;

import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Woshington
 */
@Entity
public class Tarefa {

  @Id
  @GeneratedValue
  private Long id;

  private String descricao;
  private boolean finalizado;

  @Temporal(TemporalType.DATE)
  private Calendar dataFinalizacao;

  // métodos...
}