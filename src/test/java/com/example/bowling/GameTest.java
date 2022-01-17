package com.example.bowling;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GameTest {

    @Test
    @DisplayName("Score should return current score")
    void rollShouldAddToScore(){
        Game game = new Game();

        var result = game.score();

        assertThat(result).isEqualTo(0);
    }

    @Test
    @DisplayName("Verify numbers of pins after first roll")
    void verifyNumbersOfPinsOnFirstRoll(){
        Game game = new Game();

        game.roll(7);

        var result = game.score();

        assertThat(result).isEqualTo(7);
    }

    @Test
    @DisplayName("Verify numbers of pins after two rolls")
    void verifyNumbersOfPinsOnTwoRolls(){
        Game game = new Game();

        game.roll(7);
        game.roll(2);

        var result = game.score();

        assertThat(result).isEqualTo(9);
    }

    @Test
    @DisplayName("Verify score after spare")
    void verifyScoreAfterSpare(){
        Game game = new Game();

        game.roll(4);
        game.roll(6);
        game.roll(7);

        var result = game.score();

        assertThat(result).isEqualTo(24);
    }

    @Test
    @DisplayName("Verify score after three rolls")
    void verifyScoreAfterThreeRolls(){
        Game game = new Game();

        game.roll(3);
        game.roll(6);
        game.roll(7);

        var result = game.score();

        assertThat(result).isEqualTo(16);
    }

    @Test
    @DisplayName("Verify score after Strike")
    void verifyScoreAfterStrike(){
        Game game = new Game();

        game.roll(10);
        game.roll(4);
        game.roll(3);

        var result = game.score();

        assertThat(result).isEqualTo(24);
    }

    @Test
    @DisplayName("Verify score after 2 strike")
    void verifyScoreAfterTwoStrikes() {
        Game game = new Game();

        game.roll(10);
        game.roll(10);
        game.roll(5);
        game.roll(0);

        var result = game.score();

        assertThat(result).isEqualTo(45);
    }

    @Test
    @DisplayName("Verify score after 3 strikes")
    void verifyScoreAfterThreeStrikes() {
        Game game = new Game();

        game.roll(10);
        game.roll(10);
        game.roll(10);
        game.roll(5);
        game.roll(0);

        var result = game.score();

        assertThat(result).isEqualTo(75);
    }

    @Test
    @DisplayName("Verify score after 2 spares")
    void verifyScoreAfterTwoSpares() {
        Game game = new Game();

        game.roll(4);
        game.roll(6);
        game.roll(7);
        game.roll(3);
        game.roll(5);
        game.roll(3);

        var result = game.score();

        assertThat(result).isEqualTo(40);
    }

}
