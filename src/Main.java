import org.array.statici.NumeriInteriStatico;

public class Main {
    public static void main(String[] args) throws Exception {
        int[] arrayprova = { 1, 8, 9, 55, 79 };
        NumeriInteriStatico arrayNumeri = new NumeriInteriStatico(arrayprova);
        arrayNumeri.addElemento();
        arrayNumeri.addElemento(5);
        arrayNumeri.addElemento(5);

        while (arrayNumeri.hasAncoraElementi()) {
            System.out.println(arrayNumeri.getElementoSuccessivo());

        }

    }
}
