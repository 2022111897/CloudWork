package org.example.gameservice.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.gameservice.mapper.GameMapper;
import org.example.gameservice.entity.Game;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@AllArgsConstructor
@RestController
public class GameController
{
    private final GameMapper gameMapper;

    @GetMapping("/findByGameId/{gameId}")
    public Game findByGameId(@PathVariable Long gameId) throws InterruptedException {
        Game game = gameMapper.findByGameId(gameId);
        log.info("-------------OK   /findByGameId/{gameId}--------------------");
        return game;
    }
    @GetMapping("/queryAllGames")
    public List<Game> queryAllGames() {
        List<Game> gameList = gameMapper.queryAllGames();
        log.info("-------------OK   queryAllGames--------------------");
        return gameList;
    }
}
