package com.exemple.jeu;

public class Partie {
    //attributs
    private Joueur j1;
    private Joueur j2;
    private int nbrTour = 5;
    private int scoreJ1 = 0;
    private int scoreJ2 = 0;

    //constructeurs
    public Partie(){}
    public Partie(Joueur j1,Joueur j2)
    {
        this.j1 = j1;
        this.j2 = j2;
    }
    public Partie(Joueur j1, Joueur j2, int nbrTour)
    {
        this.j1 = j1;
        this.j2 = j2;
        this.nbrTour = nbrTour;
    }

    //Getters et setters

    public Joueur getJ1() {
        return j1;
    }

    public Joueur getJ2() {
        return j2;
    }

    public int getScoreJ1() {
        return scoreJ1;
    }

    public int getScoreJ2() {
        return scoreJ2;
    }

    //Méthodes
    public void lancerPartie()
    {
        for (int i = 0; i < this.nbrTour; i++) {
            //Le joueur 1 lance un dès de 6 faces (score 1 à 6).
            this.j1.lancerDes();
            //Le joueur 2 lance un dès de 6 faces (score 1 à 6).
            this.j2.lancerDes();
            //Si le joueur 1 fait plus que le joueur2, ajouter 2 pts au score du joueur 1,
            if (this.j1.getValeurLance() > this.j2.getValeurLance()) {
                this.scoreJ1 += 2;
            }
            //Si le joueur 2 fait plus que le joueur 1, ajouter 2 pts au score du joueur 2,
            if (this.j1.getValeurLance() < this.j2.getValeurLance()) {
                this.scoreJ2 += 2;
            }
            //si égalité
            if  (this.j1.getValeurLance() == this.j2.getValeurLance()) {
                this.scoreJ1++;
                this.scoreJ2++;
            }
        }
        //Le joueur 1 gagne
        if (this.scoreJ1 > this.scoreJ2) {
            System.out.println("le gagnant est " + this.j1.getNom() + " avec un score de  " + this.scoreJ1 + " pts");
        }
        //le joueur 2 gagne
        if (this.scoreJ1 < this.scoreJ2) {
            System.out.println("le gagnant est " + this.j2.getNom() + " avec un score de  " + this.scoreJ2 + " pts");
        }
        //sinon égalité
        if (this.scoreJ2 == this.scoreJ1) {
            System.out.println("Egalité les 2 joueurs ont le même score : " + this.scoreJ2 + " pts");
        }
        //Remise à zéro des scores
        this.scoreJ1 = 0;
        this.scoreJ2 = 0;
    }
}
