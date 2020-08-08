package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity@Data@NoArgsConstructor@AllArgsConstructor
public class Player {
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private Long numTel;
    private String mail;
    private String status;
    private String poste;
}
