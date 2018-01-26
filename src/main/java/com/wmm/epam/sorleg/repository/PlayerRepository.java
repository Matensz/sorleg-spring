package com.wmm.epam.sorleg.repository;

import com.wmm.epam.sorleg.domain.Player;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerRepository extends CrudRepository<Player, Long> {

    List<Player> findAll();

    List<Player> findAllByTeamId(long id);

    Player findPlayerById(long id);

    Player findPlayerByLastName(String name);

}
