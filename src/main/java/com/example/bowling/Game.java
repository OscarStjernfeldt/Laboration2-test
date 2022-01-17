package com.example.bowling;

public class Game {

    private boolean lastFrameWasStrike = false;

    private int frameCounter = 0;

    private int strikeBonus = 0;

    private int spareBonus = 0;

    private int frameScore = 0;

    private int score = 0;

    private int rolls = 0;

    public int score() {
        return score;
    }

    public void roll(int pins) {

        if(frameCounter == 9) {
            frameScore += pins;
            score += pins;
            rolls++;
            return;
        }

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
            frameCounter++;
        }

        if (rolls == 2 && frameScore == 10) {
            spareBonus += pins;
            rolls = 0;
            score += spareBonus;
            frameScore = 0;
            spareBonus = 0;
            frameCounter++;
        }

        if (rolls == 2) {
            rolls = 0;
            frameScore = 0;
            frameCounter++;
        }

        frameScore += pins;
        score += pins;
        rolls++;
    }
}
