public class Recreo extends Barco {
    private String permiso;
    private final String tipo = "Recreo";

    public Recreo(String matri, String nom, Float tama, String perm) {
        super(matri, nom, tama);
        this.permiso = perm;
    }

    public boolean encajaTipo(Pantalan pantalan) {
        return pantalan.getTipo().equals(this.tipo);
    }

    public String getPermiso() {
        return permiso;
    }

    public void setPermiso(String permiso) {
        this.permiso = permiso;
    }

    @Override
    public String toString() {
        return "[matricula="+this.getMatricula()+", nombre="+this.getNombre()+", tamanyo="+this.getTamaño()+", permiso="+this.permiso+"]";
    }

    public String getTipo() {
        return tipo;
    }

    
}
