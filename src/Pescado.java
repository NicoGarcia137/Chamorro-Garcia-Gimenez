public abstract class Pescado extends Formados {
    //atrivutos
    private String tipoPescado;
    private float kgPescadoUsado;

    //getters y setters
    public String getTipoPescado() {
        return tipoPescado;
    }

    public void setTipoPescado(String tipoPescado) {
        this.tipoPescado = tipoPescado;
    }

    public float getKgPescadoUsado() {
        return kgPescadoUsado;
    }

    public void setKgPescadoUsado(float kgPescadoUsado) {
        this.kgPescadoUsado = kgPescadoUsado;
    }
    //To string
    @Override
    public String toString() {
        return "Pescado{" +
                "tipoPescado='" + tipoPescado + '\'' +
                ", kgPescadoUsado=" + kgPescadoUsado +
                '}';
    }
    //constructor
    public Pescado(int id, String nombre, float kgXcaja, Receta receta, int cantCajaxPallet, float velocidadTunel, int temperaturaFrio, int temperaturaAceiteCelcius, int tiempoCongeladoMin, int cantBolsasPan, int cantBolsasBatter, float pesoUnidadGr, String tipoPan, int idFormadora, int golpesXMin, int cantUnidXGolpe, String tipoPescado, float kgPescadoUsado) {
        super(id, nombre, kgXcaja, receta, cantCajaxPallet, velocidadTunel, temperaturaFrio, temperaturaAceiteCelcius, tiempoCongeladoMin, cantBolsasPan, cantBolsasBatter, pesoUnidadGr, tipoPan, idFormadora, golpesXMin, cantUnidXGolpe);
        this.tipoPescado = tipoPescado;
        this.kgPescadoUsado = kgPescadoUsado;
    }
}
