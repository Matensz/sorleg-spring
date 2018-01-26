package com.wmm.epam.sorleg.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class Team {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    private String teamName;

    @JsonBackReference
    @OneToMany(mappedBy = "team")
    private List<Player> players;

    public Team() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setMembers(List<Player> players) {
        this.players = players;
    }

    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", teamName='" + teamName + '\'' +
                ", players=" + players +
                '}';
    }
}
