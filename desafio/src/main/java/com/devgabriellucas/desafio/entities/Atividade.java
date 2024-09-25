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
@Table(name = "tb_atividade")
public class Atividade {

     @Serial
     private static final long serialVersionUID = 1L;

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
     private String nome;
     private String descricao;
     private Double preco;

     @ManyToOne
     @JoinColumn(name = "categoria_id")
     private Categoria categoria;

     @ManyToMany
     @JoinTable(
             name = "tb_atividade_participante",
             joinColumns = @JoinColumn(name = "atividade_id"),
                inverseJoinColumns = @JoinColumn(name = "participante_id")
     )
     private List<Participante> participantes = new ArrayList<>();

     @OneToMany(mappedBy = "atividades")
     private List<Bloco> blocos = new ArrayList<>();

}
