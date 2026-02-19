package com.exemple.jeu;

import java.util.Random;

public class Des {
    //attributs
    private int nbrface = 6;
    private int score = 0;

    //constructeurs
    public Des() {}

    public Des(int nbrface)
    {
        this.nbrface = nbrface;
    }

    public int getScore() {
        return score;
    }

    public void lancer()
    {
        this.score = new Random().nextInt(nbrface) + 1;
    }
}
