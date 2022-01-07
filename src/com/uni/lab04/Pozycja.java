package com.uni.lab04;

public abstract class Pozycja  {
    protected String tytul;
    protected int id;
    protected String wydawnictwo;
    protected int rokWydania;

    Pozycja(String tytul, int id, String wydawnictwo, int rokWydania){
        this.tytul = tytul;
        this.id = id;
        this.wydawnictwo = wydawnictwo;
        this.rokWydania = rokWydania;
    }

    public String getTytul() {
        return tytul;
    }

    public int getId() {
        return id;
    }

    public String getWydawnictwo() {
        return wydawnictwo;
    }

    public int getRokWydania() {
        return rokWydania;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setWydawnictwo(String wydawnictwo) {
        this.wydawnictwo = wydawnictwo;
    }

    public void setRokWydania(int rokWydania) {
        this.rokWydania = rokWydania;
    }


    public void wypiszInfo(){
        System.out.println(tytul + "\n" + id + "\n" + wydawnictwo + "\n" + rokWydania);
    }

}
