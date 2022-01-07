package com.uni.lab04;

public class Ksiazka extends Pozycja {
    private int liczbaStron;


    public Ksiazka() {
        super();
    }

    public Ksiazka(String tytul, int id, String wydawnictwo, int rokWydania, int liczbaStron) {
        super(tytul, id, wydawnictwo, rokWydania);
        this.tytul = tytul;
        this.id = id;
        this.wydawnictwo = wydawnictwo;
        this.rokWydania = rokWydania;
        this.liczbaStron = liczbaStron;
    }
}
