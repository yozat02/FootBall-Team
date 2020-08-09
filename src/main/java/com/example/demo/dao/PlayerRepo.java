package com.example.demo.dao;

import com.example.demo.entities.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerRepo extends JpaRepository<Player,Integer> {

    String query_1="select * from player where player.poste=:poste";
    @Query(value = query_1,nativeQuery = true)
    public List<Player> findByPoste(@Param("poste") String poste);


    String query_2="select * from player where player.status=:status";
    @Query(value = query_2,nativeQuery = true)
    public List<Player> findByStatus(@Param("status") String status);
}
