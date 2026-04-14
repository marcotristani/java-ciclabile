package org.array.statici;

public class NumeriInteriStatico {

    private int[] arrayNumeriInteri;
    private int index = 0;

    public NumeriInteriStatico(int[] arrayNumeriInteri) {
        this.arrayNumeriInteri = arrayNumeriInteri;
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
}
