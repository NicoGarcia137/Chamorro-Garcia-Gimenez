public class Patitas extends Pollo {
    //Constructors


    public Patitas(String nombre, float kgXcaja, Receta receta, int cantCajaxPallet, float precioxKg, float velocidadTunel, int temperaturaFrio, int temperaturaAceiteCelcius, int tiempoCongeladoMin, int cantBolsasPan, int cantBolsasBatter, float pesoUnidadGr, String tipoPan, int idFormadora, int golpesXMin, int cantUnidXGolpe, float kgPielPollo, float kgPechuga, int cantBolsaSoja) {
        super(nombre, kgXcaja, receta, cantCajaxPallet, precioxKg, velocidadTunel, temperaturaFrio, temperaturaAceiteCelcius, tiempoCongeladoMin, cantBolsasPan, cantBolsasBatter, pesoUnidadGr, tipoPan, idFormadora, golpesXMin, cantUnidXGolpe, kgPielPollo, kgPechuga, cantBolsaSoja);
    }

    //To String
    public String toString() {
        return super.toString();
    }
}
