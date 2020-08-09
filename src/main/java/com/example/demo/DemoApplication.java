package com.example.demo;

import com.example.demo.dao.PlayerRepo;
import com.example.demo.dao.TeamRepo;
import com.example.demo.entities.Player;
import com.example.demo.entities.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.stream.Stream;


@SpringBootApplication
public class DemoApplication implements CommandLineRunner {


    @Autowired
    private PlayerRepo playerRepo;
    @Autowired
    private TeamRepo teamRepo;


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

       /* Stream.of("yousef","alae","yassine","reda","imad","omar","houssam").forEach(name->{
            Player pl=new Player();
            pl.setName(name);
            playerRepo.save(pl);
        });
        Team team=new Team();
        team.setLeader("yassine");
        team.setName("tvnviin");
        team.setPlayers(playerRepo.findAll());
        teamRepo.save(team);*/
    }
}
