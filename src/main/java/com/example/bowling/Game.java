package com.example.bowling;

public class Game {

    private boolean lastFrameWasStrike = false;

    private int strikeBonus = 0;

    private int frameScore = 0;

    private int score = 0;

    private int rolls = 0;

    public int score() {
        return score;
    }

    public void roll(int pins) {

        if(lastFrameWasStrike){
            strikeBonus += pins;
            score += strikeBonus;
            lastFrameWasStrike = false;
        }

        if (rolls == 1 && frameScore == 10) {
            strikeBonus += pins;
            lastFrameWasStrike = true;
        }

        if (rolls == 2) {
            if (frameScore == 10) {
                score += pins;
            }
        }

        frameScore += pins;
        score += pins;
        rolls++;
    }
}
