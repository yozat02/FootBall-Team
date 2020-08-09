package com.example.demo.Controllers;

import com.example.demo.dao.PlayerRepo;
import com.example.demo.dao.TeamRepo;
import com.example.demo.entities.Player;
import com.example.demo.entities.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@CrossOrigin("*")
public class RestController {

    @Autowired
    private PlayerRepo playerRepo;
    @Autowired
    private TeamRepo teamRepo;

    @GetMapping("/players")
    public List<Player> getPlayers(){
        return playerRepo.findAll();

    }
    @GetMapping("/teams")
    public List<Team> getTeams(){
        return teamRepo.findAll();
    }


    @PostMapping("/addPlayer")
    public Player addPlayer(@RequestBody Player p){
        return playerRepo.save(p);
    }


    @DeleteMapping("/deletePlayer/{id}")
    public Player delete(@PathVariable Integer id){
       Player p=playerRepo.findById(id).get();
       playerRepo.delete(p);
       return p;
    }
    @GetMapping("/poste/{poste}")
    public List<Player> getByPoste(@PathVariable String poste){
        return playerRepo.findByPoste(poste);
    }

    @GetMapping("/status/{status}")
    public List<Player> getByStatus(@PathVariable String status){
        return playerRepo.findByStatus(status);
    }


}
