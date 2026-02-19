package com.exemple.jeu;

public class Joueur {
    //Attributs
    private String nom;
    private int valeurLance = 0;
    private Des des;

    //Constructeurs
    public Joueur() {}

    public Joueur(String nom, Des des) {
        this.nom = nom;
        this.des = des;
    }

    //Getters et Setters

    public String getNom() {
        return nom;
    }

    public int getValeurLance() {
        return valeurLance;
    }

    //Méthode
    public void lancerDes()
    {
        this.des.lancer();
        this.valeurLance = this.des.getScore();
    }
}
