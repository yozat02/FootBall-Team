package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity@Data@NoArgsConstructor@AllArgsConstructor
public class Team {
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nameTeam;
    private List<Player> players;
    private String teamLeader;

}
