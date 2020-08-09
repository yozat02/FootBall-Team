package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity@Data@NoArgsConstructor@AllArgsConstructor@Table(name = "match")
public class Match {
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Date date;
    private String lieu;
    private String oppenent;
    private Long numPlayers;

}
