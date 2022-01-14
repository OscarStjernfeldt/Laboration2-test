package com.example.bowling;

public class Game {

    private int score = 0;

    private int frameScore = 0;

    private int rolls = 0;

    public int score() {
        return score;
    }

    public void roll(int pins) {
        if (rolls == 2)
            if(frameScore == 10) {
               score += pins;
            }
        frameScore += pins;
        score += pins;
        rolls++;
    }
}
