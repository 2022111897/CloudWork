package org.example.gameclient.controller;

import org.example.gameclient.client.GameServiceClient;
import org.example.gameclient.model.Game;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@AllArgsConstructor
@RestController
@Slf4j
public class GameServiceClientController {

    @Autowired
    private final GameServiceClient prodServiceClient;
    /**
     * 根据商品id查询商品
     */
    @GetMapping("/findByGameId/{gameId}")
    public Game findByGameId(@PathVariable Long gameId) throws InterruptedException {
        Game game = prodServiceClient.findByGameId(gameId);
        log.info("--------------In client  findByGameId---------------------");
        return game;
    }
    /**
     * 查询所有商品
     */
    @GetMapping("/queryAllGames")
    public List<Game> queryAllGames() {
        List<Game> gameList = prodServiceClient.queryAllGames();
        log.info("--------------In client  queryAllGames---------------------");
        return gameList;
    }

}
