public class Amarre {
    private final Integer id;
    private Float tamaño;
    private boolean ocupado = false;
    private Barco barco;
    private static Integer contador = 0;

    public Amarre(Float taman) {
        this.tamaño = taman;

        Amarre.contador++;
        this.id = contador;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public Float getTamaño() {
        return tamaño;
    }

    @Override
    public String toString() {
        if (this.barco != null) {
            return "Amarre[id="+this.id+", tamanyo="+this.tamaño+", ocupado="+this.ocupado+", barco="+this.barco.toString()+" "+this.barco.getClass().getName()+"]";
        } else {
            return "Amarre[id="+this.id+", tamanyo="+this.tamaño+", ocupado="+this.ocupado+"]";
        }
    }

    
}
