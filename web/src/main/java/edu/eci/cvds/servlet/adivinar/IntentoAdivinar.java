package edu.eci.cvds.servlet.adivinar;

public class IntentoAdivinar {
    private int numberIntento;
    private int value;

    public IntentoAdivinar(int numberIntento, int value) {
        this.numberIntento = numberIntento;
        this.value = value;
    }

    public int getNumberIntento() {
        return numberIntento;
    }

    public void setNumberIntento(int numberIntento) {
        this.numberIntento = numberIntento;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}