package com.exemple.model;

public class Habitation {
    //Attributs
    private String nom;
    private double longeur;
    private double largeur;
    private int nbrEtage = 1;

    //constructeurs
    public Habitation() {
    }

    public Habitation(String nom, double longeur, double largeur) {
        this.nom = nom;
        this.longeur = longeur;
        this.largeur = largeur;
    }

    public Habitation(String nom,  double longeur, double largeur, int nbrEtage)
    {
        this.nom = nom;
        this.longeur = longeur;
        this.largeur = largeur;
        this.nbrEtage = nbrEtage;
    }

    //getters et setters
    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getLongeur() {
        return this.longeur;
    }

    public void setLongeur(double longeur) {
        this.longeur = longeur;
    }

    public double getLargeur() {
        return this.largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public int getNbrEtage() {
        return nbrEtage;
    }

    public void setNbrEtage(int nbrEtage) {
        this.nbrEtage = nbrEtage;
    }

    public double surface()
    {
        return this.longeur * this.largeur * this.nbrEtage;
    }
}
