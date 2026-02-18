package com.cda.classe;

public class Des {
    private int nbrface;
    private int score;

    public Des(int nbrface) {
        this.nbrface = nbrface;
    }

    public void lancer() {
        this.score = 1 + (int) ( Math.random() * this.nbrface );
    }

    public int getNbrface() {
        return nbrface;
    }

    public void setNbrface(int nbrface) {
        this.nbrface = nbrface;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
