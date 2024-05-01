import java.util.ArrayList;
import java.util.Comparator;

public abstract class Barco {
    private String matricula;
    private String nombre;
    private Float tamaño;
    public static BarcoComparator comp = new BarcoComparator();

    public Barco(String matri, String nomb, Float tama) {
        this.matricula = matri;
        this.nombre = nomb;
        this.tamaño = tama;
    }
    
    public static String mayorTamaño(ArrayList<Barco> barcosEntrantes) {
        ArrayList<Barco> lst_ord = new ArrayList<>(barcosEntrantes); // Esto es una shallow copy
        lst_ord.sort(comp);

        return lst_ord.get(0).matricula;
    }

    public abstract boolean encajaTipo(Pantalan pantalan);

    public Float encajarTamaño(Amarre amarre) {
        Float dif = Float.max(this.tamaño, amarre.getTamaño()) - Float.min(this.tamaño, amarre.getTamaño());
        return dif;
    }

    public static void cargarBarcosEntrantes(ArrayList<Barco> barc_entrant) {
        for (Barco b : barc_entrant) {
            Puerto.getBarcosEntrantes().add(b);
        }
    }

    public String getMatricula() {
        return matricula;
    }

    private void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getTamaño() {
        return tamaño;
    }

    private void setTamaño(Float tamaño) {
        this.tamaño = tamaño;
    }

    public abstract String getTipo();

    public String toString() {
        return "[matricula="+this.getMatricula()+", nombre="+this.getNombre()+", tamanyo="+this.getTamaño()+"]";
    }
    
}

class BarcoComparator implements Comparator<Barco> {

    @Override
    public int compare(Barco b1, Barco b2) {
        return b1.getMatricula().compareTo(b2.getMatricula());
    }
}
