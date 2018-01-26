package com.wmm.epam.sorleg.service;

import com.wmm.epam.sorleg.domain.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wmm.epam.sorleg.repository.PlayerRepository;

import java.util.List;

@Service
public class PlayerService {

    private PlayerRepository playerRepository;

    @Autowired
    public void setPlayerRepository(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    public List<Player> getAllPlayersFromTeam(long id) {
        return playerRepository.findAllByTeamId(id);
    }

    public Player getPlayerById(long id) {
        return playerRepository.findPlayerById(id);
    }

    public Player getPlayerByLastName(String name) {
        return playerRepository.findPlayerByLastName(name);
    }

}
