package org.array.statici;

import java.util.Random;

public class NumeriInteriStatico {

    private int[] arrayNumeriInteri;
    private int index = 0;

    // costruttori
    public NumeriInteriStatico(int[] arrayNumeriInteri) {
        this.arrayNumeriInteri = arrayNumeriInteri;
    }

    public NumeriInteriStatico() {
        arrayNumeriInteri = new int[0];
    }

    // metodi Get e Set
    public int[] getArrayNumeriInteri() {
        return this.arrayNumeriInteri;
    }

    public void setArrayNumeriInteri(int[] arrayNumeriInteri) {
        this.arrayNumeriInteri = arrayNumeriInteri;
    }

    public int getIndex() {
        return this.index;
    }

    private void setIndex(int index) {
        this.index = index;
    }

    // metodi aggiuntivi

    public int getElementoSuccessivo() {
        if (this.index < this.arrayNumeriInteri.length) {
            setIndex(this.index + 1);
            return this.arrayNumeriInteri[index - 1];
        } else {
            return 0;
        }
    }

    public boolean hasAncoraElementi() {
        if (this.index < this.arrayNumeriInteri.length) {
            return true;
        } else {
            return false;
        }

    }

    public void addElemento() {
        int[] newArray = new int[this.arrayNumeriInteri.length + 1];
        Random random = new Random();
        newArray[this.arrayNumeriInteri.length] = random.nextInt(99);
        for (int i = 0; i < arrayNumeriInteri.length; i++) {
            newArray[i] = arrayNumeriInteri[i];
        }
        arrayNumeriInteri = newArray;
    }

    public void addElemento(int nuovoNumeroIntero) {
        int[] newArray = new int[this.arrayNumeriInteri.length + 1];
        newArray[this.arrayNumeriInteri.length] = nuovoNumeroIntero;
        for (int i = 0; i < arrayNumeriInteri.length; i++) {
            newArray[i] = arrayNumeriInteri[i];
        }
        arrayNumeriInteri = newArray;
    }

    public int getArrayLength() {
        return arrayNumeriInteri.length;
    }

}
