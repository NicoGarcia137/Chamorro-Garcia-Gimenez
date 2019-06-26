public abstract class Pollo extends Formados {
    //atrivutos
    private float kgPielPollo;
    private float kgPechuga;
    private int cantBolsaSoja;

    //getters y setters
    public float getKgPielPollo() {
        return kgPielPollo;
    }

    public void setKgPielPollo(float kgPielPollo) {
        this.kgPielPollo = kgPielPollo;
    }

    public float getKgPechuga() {
        return kgPechuga;
    }

    public void setKgPechuga(float kgPechuga) {
        this.kgPechuga = kgPechuga;
    }

    public int getCantBolsaSoja() {
        return cantBolsaSoja;
    }

    public void setCantBolsaSoja(int cantBolsaSoja) {
        this.cantBolsaSoja = cantBolsaSoja;
    }

    //to string
    @Override
    public String toString() {
        return "Pollo{" +
                "kgPielPollo=" + kgPielPollo +
                ", kgPechuga=" + kgPechuga +
                ", cantBolsaSoja=" + cantBolsaSoja +
                '}';
    }

    //constructor
    public Pollo(int id, String nombre, float kgXcaja, Receta receta, int cantCajaxPallet, float velocidadTunel, int temperaturaFrio, int temperaturaAceiteCelcius, int tiempoCongeladoMin, int cantBolsasPan, int cantBolsasBatter, float pesoUnidadGr, String tipoPan, int idFormadora, int golpesXMin, int cantUnidXGolpe, float kgPielPollo, float kgPechuga, int cantBolsaSoja) {
        super(id, nombre, kgXcaja, receta, cantCajaxPallet, velocidadTunel, temperaturaFrio, temperaturaAceiteCelcius, tiempoCongeladoMin, cantBolsasPan, cantBolsasBatter, pesoUnidadGr, tipoPan, idFormadora, golpesXMin, cantUnidXGolpe);
        this.kgPielPollo = kgPielPollo;
        this.kgPechuga = kgPechuga;
        this.cantBolsaSoja = cantBolsaSoja;
    }

}
