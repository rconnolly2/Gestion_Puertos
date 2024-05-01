import java.util.ArrayList;
import java.util.Comparator;

public class Puerto {
    private static ArrayList<Barco> barcosEntrantes = new ArrayList<Barco>();
    private static ArrayList<Pantalan> listPantalan = new ArrayList<Pantalan>();
    private static Integer contador = 0;
    

    public Puerto() {
        ; // no hace nada
    }

    public static void verAmarre() {
        for (Pantalan pan : listPantalan) {
            System.out.println(pan.toString());
        }
    }

    public static void buscarAmarre() {
        // Ordeno lista de barcos por su tamanyo
        ArrayList<Barco> lst_ord = new ArrayList<>(Puerto.barcosEntrantes); // shallow copy
        lst_ord.sort(new ComparatorBarcosTamanyo()); // ordenador por el tamanyo
        ArrayList<Barco> lst_barc_sin = new ArrayList<>(); // lista de barcos sin amarre
        boolean encontrado;

        for (int i=0; i<=lst_ord.size(); i++) {
            encontrado = false;
            Barco bar_amarrar = lst_ord.remove(0);

            for (Pantalan pan : listPantalan) {
                if (pan.getTipo().equals(bar_amarrar.getTipo())){
                    for (Amarre am : pan.getListAmarre()) {
                        if (am.getTamaño() >= bar_amarrar.getTamaño() && am.isOcupado() == false) {
                            System.out.println("He encontrado amarre!");
                            am.setBarco(bar_amarrar);
                            encontrado = true;
                            break;
                        }
                    }
                }
            }

            if (encontrado == false) {
                System.out.println("Barco no tiene sitio");
                lst_barc_sin.add(bar_amarrar);
            }
        }
        
    }

    public static ArrayList<Barco> getBarcosEntrantes() {
        return barcosEntrantes;
    }

    public static ArrayList<Pantalan> getListPantalan() {
        return listPantalan;
    }

    


}

class ComparatorBarcosTamanyo implements Comparator<Barco> {

    @Override
    public int compare(Barco b1, Barco b2) {
        return Float.compare(b1.getTamaño(), b2.getTamaño());
    }
}
