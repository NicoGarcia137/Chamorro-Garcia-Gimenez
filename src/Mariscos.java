public abstract class Mariscos extends Prefrito  {
    //atrivutos
    private float kgIngresados;

    //toString
    @Override
    public String toString() {
        return "Mariscos{" +
                "kgIngresados=" + kgIngresados +
                '}';
    }

    //constructor
    public Mariscos(int id, String nombre, float kgXcaja, Receta receta, int cantCajaxPallet, float velocidadTunel, int temperaturaFrio, int temperaturaAceiteCelcius, int tiempoCongeladoMin, int cantBolsasPan, int cantBolsasBatter, float pesoUnidadGr, String tipoPan, float kgIngresados) {
        super(id, nombre, kgXcaja, receta, cantCajaxPallet, velocidadTunel, temperaturaFrio, temperaturaAceiteCelcius, tiempoCongeladoMin, cantBolsasPan, cantBolsasBatter, pesoUnidadGr, tipoPan);
        this.kgIngresados = kgIngresados;
    }
}
