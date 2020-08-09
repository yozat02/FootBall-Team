package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity@Data@NoArgsConstructor@AllArgsConstructor@Table(name="player")
public class Player {

    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private Long numTel;
    private String mail;
    private String status;
    private String poste;
}
