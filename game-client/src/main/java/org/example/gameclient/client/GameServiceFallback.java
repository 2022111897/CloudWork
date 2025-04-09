package org.example.gameclient.client;

import org.example.gameclient.model.Game;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import java.util.List;

@Slf4j
@Component
public class GameServiceFallback implements GameServiceClient {

    @Override
    public Game findByGameId(Long gameId) {
        log.info("findByGameId callback");
        Game pro=new Game();
        pro.setGameName("Error");
        return pro;
    }

    @Override
    public List<Game> queryAllGames() {
        log.info("queryAllGames callback");
        return null;
    }
}
