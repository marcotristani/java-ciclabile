import org.array.statici.NumeriInteriStatico;

public class Main {
    public static void main(String[] args) throws Exception {
        int[] arrayprova = { 1, 8, 9, 55, 79 };
        NumeriInteriStatico arrayNumeri = new NumeriInteriStatico();
        arrayNumeri.addElemento();
        arrayNumeri.addElemento();
        arrayNumeri.addElemento();

        do {
            System.out.println(arrayNumeri.getElementoSuccessivo());
            System.out.println(arrayNumeri.getIndex());
        } while (arrayNumeri.hasAncoraElementi());

    }
}
