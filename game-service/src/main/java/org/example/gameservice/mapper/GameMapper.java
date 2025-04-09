package org.example.gameservice.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.example.gameservice.entity.Game;

import java.util.List;

public interface GameMapper
{
    @Select("select g.game_name as gameName,g.price as price,g.developer_id as developer from game g where id = #{gameId}")
    Game findByGameId(@Param("gameId") Long gameId);

    @Select("select g.id,g.game_name as gameName,g.price as price,g.developer_id as developer from game g")
    List<Game> queryAllGames();
}
