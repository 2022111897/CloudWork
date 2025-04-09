package org.example.gameclient.model;

import lombok.Data;

@Data
public class Game {
    private Long id;

    private String gameName;

    private Double price;

    private String developer;
}
