package com.wmm.epam.sorleg.controller;

import com.wmm.epam.sorleg.domain.Player;
import com.wmm.epam.sorleg.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PlayerController {

    private PlayerService playerService;

    @Autowired
    public void setPlayerService(PlayerService playerService) {
        this.playerService = playerService;
    }

    @RequestMapping(path = "/team/{id}")
    public List<Player> listAllPlayersFromTeam(@PathVariable("id") Long id) {
        return playerService.getAllPlayersFromTeam(id);
    }

    @RequestMapping("/player")
    public List<Player> listAllPlayers() {
        return playerService.getAllPlayers();
    }

    @RequestMapping(path = "/player/{id}")
    public Player getPlayerById(@PathVariable("id") Long id) {
        return playerService.getPlayerById(id);
    }

    @RequestMapping(path = "/player/name/{name}")
    public Player getPlayerByLastName(@PathVariable("name") String name) {
        return playerService.getPlayerByLastName(name);
    }

    @RequestMapping("/player/first")
    public Player getFirstPlayerByPoints() {
        return playerService.getFirstPlayerByPoints();
    }

}
