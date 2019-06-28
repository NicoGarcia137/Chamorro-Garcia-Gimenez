public abstract class Pescado extends Formados {
    //Private Attributes
    private String tipoPescado;
    private float kgPescadoUsado;

    //Constructors

    public Pescado(String nombre, float kgXcaja, Receta receta, int cantCajaxPallet, float velocidadTunel, int temperaturaFrio, int temperaturaAceiteCelcius, int tiempoCongeladoMin, int cantBolsasPan, int cantBolsasBatter, float pesoUnidadGr, String tipoPan, int golpesXMin, int cantUnidXGolpe, String tipoPescado, float kgPescadoUsado) {
        super(nombre, kgXcaja, receta, cantCajaxPallet, velocidadTunel, temperaturaFrio, temperaturaAceiteCelcius, tiempoCongeladoMin, cantBolsasPan, cantBolsasBatter, pesoUnidadGr, tipoPan, golpesXMin, cantUnidXGolpe);
        setTipoPescado(tipoPescado);
        setKgPescadoUsado(kgPescadoUsado);
    }

    //Getters y Setters
    public String getTipoPescado() {
        return tipoPescado;
    }

    private void setTipoPescado(String tipoPescado) {
        this.tipoPescado = tipoPescado;
    }

    public float getKgPescadoUsado() {
        return kgPescadoUsado;
    }

    private void setKgPescadoUsado(float kgPescadoUsado) {
        this.kgPescadoUsado = kgPescadoUsado;
    }

    //To string
    public String toString() {
        String previousMessage=super.toString();
        String messageFormat=("\nPESCADO\nTipo de pescado: %s\nKg Pescado usado: %.2f\n");
        return previousMessage + String.format(messageFormat,getTipoPescado(),getKgPescadoUsado());
    }
}
