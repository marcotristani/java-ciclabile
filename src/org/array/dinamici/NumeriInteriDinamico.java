package org.array.dinamici;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumeriInteriDinamico {

    private ArrayList<Integer> arrayNumeriInteriDinamico = new ArrayList<>();
    private int index;

    // COSTRUTTORI
    // Costruttore che prende in ingresso un oggetto array di tipo integer
    public NumeriInteriDinamico(Integer[] arrayNumeriInteriStatico) {
        List<Integer> arrayConvertito = Arrays.asList(arrayNumeriInteriStatico);
        arrayNumeriInteriDinamico.addAll(arrayConvertito);
    }

    // costruttore che rende in ingresso un array primiticìvo di tipo int
    public NumeriInteriDinamico(int[] arrayNumeriInteriStatico) {
        for (int numeroIntero : arrayNumeriInteriStatico) {
            arrayNumeriInteriDinamico.add(numeroIntero);
        }
    }

    // costruttore vuoto
    public NumeriInteriDinamico() {
        // la lista è gia inizializzata
    };

    // costruttore che prende in ingresso già una lista
    public NumeriInteriDinamico(List<Integer> listInteri) {
        arrayNumeriInteriDinamico = new ArrayList<>(listInteri);
    }

    // metodi get e set
    public ArrayList<Integer> getArrayNumeriInteriDinamico() {
        return arrayNumeriInteriDinamico;
    }

    public void setArrayNumeriInteriDinamico(ArrayList<Integer> arrayNumeriInteriDinamico) {
        this.arrayNumeriInteriDinamico = arrayNumeriInteriDinamico;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    // metodi aggiuntivi
    public int getElementoSuccessivo() {
        this.setIndex(index + 1);
        return arrayNumeriInteriDinamico.get(index - 1);
    }

    public boolean hasAncoraElementi() {
        if (index < arrayNumeriInteriDinamico.size()) {
            return true;
        } else {
            return false;
        }
    }

    public int getArrayLength() {
        return arrayNumeriInteriDinamico.size();
    }

    public void addElemento(int numeroIntero) {
        this.arrayNumeriInteriDinamico.add(numeroIntero);
    }

}
