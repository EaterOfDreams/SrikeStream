package com.example.per6.jsontest;

/**
 * Created by per6 on 1/12/18.
 */

public class Word {
    private String word;
    private int score;
    private int numSyllables;

    @Override
    public String toString() {
        return "Word{" +
                "word='" + word + '\'' +
                ", score=" + score +
                ", numSyllables=" + numSyllables +
                '}';
    }

    public Word() {
        word = "default";
        score = 0;
        numSyllables = 2;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setNumSyllables(int numSyllables) {
        this.numSyllables = numSyllables;
    }

    public String getWord() {
        return word;
    }

    public int getScore() {
        return score;
    }

    public int getNumSyllables() {
        return numSyllables;
    }
}
