public abstract class Formados extends Prefrito  {
    //atrivutos
    private int idFormadora;
    private int GolpesXMin;
    private int CantUnidXGolpe;

    //getters y setters
    public int getIdFormadora() {
        return idFormadora;
    }

    public void setIdFormadora(int idFormadora) {
        this.idFormadora = idFormadora;
    }

    public int getGolpesXMin() {
        return GolpesXMin;
    }

    public void setGolpesXMin(int golpesXMin) {
        GolpesXMin = golpesXMin;
    }

    public int getCantUnidXGolpe() {
        return CantUnidXGolpe;
    }

    public void setCantUnidXGolpe(int cantUnidXGolpe) {
        CantUnidXGolpe = cantUnidXGolpe;
    }

    //To String
    @Override
    public String toString() {
        return "Formados{" +
                "idFormadora=" + idFormadora +
                ", GolpesXMin=" + GolpesXMin +
                ", CantUnidXGolpe=" + CantUnidXGolpe +
                '}';
    }

    //constructor
    public Formados(int id, String nombre, float kgXcaja, Receta receta, int cantCajaxPallet, float velocidadTunel, int temperaturaFrio, int temperaturaAceiteCelcius, int tiempoCongeladoMin, int cantBolsasPan, int cantBolsasBatter, float pesoUnidadGr, String tipoPan, int idFormadora, int golpesXMin, int cantUnidXGolpe) {
        super(id, nombre, kgXcaja, receta, cantCajaxPallet, velocidadTunel, temperaturaFrio, temperaturaAceiteCelcius, tiempoCongeladoMin, cantBolsasPan, cantBolsasBatter, pesoUnidadGr, tipoPan);
        this.idFormadora = idFormadora;
        GolpesXMin = golpesXMin;
        CantUnidXGolpe = cantUnidXGolpe;
    }
}
