public class Comercial extends Barco {
    private String carga;
    private final String tipo = "Comercial";

    public Comercial(String matri, String nom, Float tama, String carg) {
        super(matri, nom, tama);
        this.carga = carg;
    }

    public boolean encajaTipo(Pantalan pantalan) {
        return pantalan.getTipo().equals(this.tipo);
    }

    public String getCarga() {
        return carga;
    }

    public void setCarga(String carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "[matricula="+this.getMatricula()+", nombre="+this.getNombre()+", tamanyo="+this.getTamaño()+", carga="+this.carga+"]";
    }

    public String getTipo() {
        return tipo;
    }

    

}
