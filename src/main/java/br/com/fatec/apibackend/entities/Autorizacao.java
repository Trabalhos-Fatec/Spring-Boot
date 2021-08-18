package br.com.fatec.apibackend.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@Entity
@Table(name = "auth")
public class Autorizacao {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "auth_id")
  private Long id;

  @NotNull
  @Column(name = "auth_nome")
  private String nome;


}
