package org.example.gameclient.client;

import org.example.gameclient.model.Game;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * 商品服务远程调用客户端
 * @FeignClient(name="game-service",fallback = GameServiceFallback.class):
 * 这个注解标记了该接口是一个Feign客户端，它将远程调用名为game-service的服务。fallback属性指定了一个降级处理类GameServiceFallback，用于在远程调用失败时提供备用的处理逻辑。
 * *
 * @GetMapping("/findByGameId/{gameId}"): 这个注解标记了该方法将处理一个HTTP GET请求，并且指定了请求的路径为/findByGameId/{gameId}。其中，
 * {gameId}是一个路径参数。
 * *
 * Game findByGameId(@RequestParam(value = "gameId") Long gameId):
 * 这个方法用于远程调用商品服务，通过传入商品id作为请求参数，调用商品服务的findByGameId方法，并返回一个Game对象。
 * *
 * @GetMapping("queryAllGame"): 这个注解标记了该方法将处理一个HTTP GET请求，并且指定了请求的路径为queryAllGame。
 * *
 * List<Game> queryAllGame(): 这个方法用于远程调用商品服务，调用商品服务的queryAllGame方法，并返回一个List<Game>对象。
 * *
 * @GetMapping("queryAllt"): 这个注解标记了该方法将处理一个HTTP GET请求，并且指定了请求的路径为queryAllt。
 *
 * * List<Game> queryAl(): 这个方法用于远程调用商品服务，调用商品服务的queryAl方法，并返回一个List<Game>对象。
 */
@FeignClient(name="game-service",fallback = GameServiceFallback.class)
public interface GameServiceClient {

    /**
     * 根据商品id获取商品对象
     */
    @GetMapping("/findByGameId/{gameId}")
    Game findByGameId(@RequestParam(value = "gameId") Long gameId);

    /**
     * 获取所有商品集合
     */
    @GetMapping("/queryAllGames")
    List<Game> queryAllGames();
}
