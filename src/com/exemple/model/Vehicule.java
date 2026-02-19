package com.exemple.model;

public class Vehicule {
    //attributs
    private String nom;
    private int nbrRoue;
    private int vitesse;

    //constructeurs

    public Vehicule() {
    }

    public Vehicule(String nom, int nbrRoue, int vitesse) {
        this.nom = nom;
        this.nbrRoue = nbrRoue;
        this.vitesse = vitesse;
    }

    //Getters et Setters

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbrRoue() {
        return this.nbrRoue;
    }

    public void setNbrRoue(int nbrRoue) {
        this.nbrRoue = nbrRoue;
    }

    public int getVitesse() {
        return this.vitesse;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    public String detect()
    {
        if (this.nbrRoue == 2) {
            return "Moto";
        }
        if (this.nbrRoue == 4) {
            return "Voiture";
        }
        return "Autre";
    }

    public void boost()
    {
        this.vitesse += 50;
    }

    public String plusRapide(Vehicule vehicule)
    {
        if (this.vitesse > vehicule.vitesse) {
            return this.nom + " et sa vitesse : " + this.vitesse;
        }
        if (this.vitesse < vehicule.vitesse) {
            return vehicule.nom + " et sa vitesse : " + vehicule.vitesse;
        }
        return " identique avec une vitesse de : " + this.vitesse;
    }
}
