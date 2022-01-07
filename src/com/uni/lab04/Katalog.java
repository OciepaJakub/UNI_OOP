package com.uni.lab04;

import java.util.ArrayList;
import java.util.List;

public class Katalog {
    private String dzialTematyczny;
    Pozycja pozycja;

    Katalog(String dzialTematyczny){
        this.dzialTematyczny = dzialTematyczny;
    }

    public String getDzialTematyczny() {
        return dzialTematyczny;
    }

    public void setDzialTematyczny(String dzialTematyczny) {
        this.dzialTematyczny = dzialTematyczny;
    }

    public Pozycja DodajPozycje(){
        final List<Pozycja> dodaj = new ArrayList<>();
        dodaj.add(pozycja);
        return pozycja;
    }

    public void ZnajdzPozycjePoTytule(){
        return;
    }
    public void ZnajdzPozycjePoId(){
        return;
    }
    public void WpiszWszystkiePozycje(){
        return;
    }
}
