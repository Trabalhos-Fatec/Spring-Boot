package br.com.fatec.apibackend.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "telefone")
public class Telefone {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "tel_id")
  private Long id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "data_user_id")
  private DadosUsuario dadosUsuario;

  @Column(name = "telefone")
  private String telefone;

}
