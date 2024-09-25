package com.devgabriellucas.desafio.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "tb_bloco")
public class Bloco {
     @Serial
     private static final long serialVersionUID = 1L;

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
     private Instant inicio;
     private Instant fim;

     @ManyToOne
     @JoinColumn(name = "atividade_id")
     private Atividade atividades;

}
