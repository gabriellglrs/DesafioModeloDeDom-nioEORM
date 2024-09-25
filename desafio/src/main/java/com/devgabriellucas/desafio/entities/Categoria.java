package com.devgabriellucas.desafio.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "tb_categoria")
public class Categoria {
     @Serial
     private static final long serialVersionUID = 1L;

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;

     @Column(columnDefinition = "TEXT")
     private String descricao;

     @OneToMany(mappedBy = "categoria")
     private List<Atividade> atividades = new ArrayList<>();


}
