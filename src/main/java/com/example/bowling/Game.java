package com.example.bowling;

public class Game {

    private boolean lastFrameWasStrike = false;

    private boolean lastFrameWasSpare = false;

    private int strikeBonus = 0;

    private int spareBonus = 0;

    private int frameScore = 0;

    private int score = 0;

    private int rolls = 0;

    public int score() {
        return score;
    }

    public void roll(int pins) {

        if (lastFrameWasStrike) {
            strikeBonus += pins;
            score += strikeBonus;
            lastFrameWasStrike = false;
            strikeBonus = 0;
        }

        if (rolls == 1 && frameScore == 10) {
            strikeBonus += pins;
            lastFrameWasStrike = true;
            rolls = 0;
            frameScore = 0;
        }

        if (rolls == 2 && frameScore == 10) {
            spareBonus += pins;
            rolls = 0;
            score += spareBonus;
            frameScore = 0;
            spareBonus = 0;
        }

        frameScore += pins;
        score += pins;
        rolls++;

    }
}
