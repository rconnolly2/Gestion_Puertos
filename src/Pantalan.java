import java.util.ArrayList;

public class Pantalan {
    private final Integer id;
    private ArrayList<Amarre> listAmarre = new ArrayList<Amarre>();
    private String tipo;
    private static Integer contador = 0;

    public Pantalan(String tipo_arg) {
        if (!(tipo_arg.equals("Comercial") || tipo_arg.equals("Recreo"))) {
            throw new IllegalArgumentException("Tipo de amarre invalido...");
        }

        this.tipo = tipo_arg;
        Pantalan.contador++;
        this.id = contador;
    }

    public ArrayList<Amarre> getListAmarre() {
        return listAmarre;
    }

    public void setListAmarre(ArrayList<Amarre> listAmarre) {
        this.listAmarre = listAmarre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
	public String toString() {
		return "Pantalan \n"
				+ "[id=" + id + ", tipo=" + tipo + "\n"
				+listAmarre + "]\n";
    }
}
