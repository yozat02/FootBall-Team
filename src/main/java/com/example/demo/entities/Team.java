package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity@Data@NoArgsConstructor@AllArgsConstructor@Table(name="team")
public class Team {

    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String leader;
    private String name;
    @Transient
    private List<Player> players;


}
