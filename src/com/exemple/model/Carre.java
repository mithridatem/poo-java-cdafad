package com.exemple.model;

public class Carre extends Forme
{
    private int cote;
    public Carre(){
        super();
    }

    public void surface() {
        System.out.println(this.cote * this.cote);
    }

    public void surface(String metric) {
        System.out.println((this.cote * this.cote) + " m²");
    }

    public String surface(int us)
    {
        return (this.cote * this.cote) + " feets ²";
    }
}
