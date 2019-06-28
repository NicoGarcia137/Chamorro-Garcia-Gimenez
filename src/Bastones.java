public class Bastones extends Pescado {
    //Constructors

    public Bastones(String nombre, float kgXcaja, Receta receta, int cantCajaxPallet, float velocidadTunel, int temperaturaFrio, int temperaturaAceiteCelcius, int tiempoCongeladoMin, int cantBolsasPan, int cantBolsasBatter, float pesoUnidadGr, String tipoPan, int golpesXMin, int cantUnidXGolpe, String tipoPescado, float kgPescadoUsado) {
        super(nombre, kgXcaja, receta, cantCajaxPallet, velocidadTunel, temperaturaFrio, temperaturaAceiteCelcius, tiempoCongeladoMin, cantBolsasPan, cantBolsasBatter, pesoUnidadGr, tipoPan, golpesXMin, cantUnidXGolpe, tipoPescado, kgPescadoUsado);
    }
    //To String
    public String toString() {
        return super.toString();
    }
}
