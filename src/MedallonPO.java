public class MedallonPO extends Pollo {
    //Private Attributes
    private int cantMedXCaja;

    //Constructors


    public MedallonPO(String nombre, float kgXcaja, Receta receta, int cantCajaxPallet, float velocidadTunel, int temperaturaFrio, int temperaturaAceiteCelcius, int tiempoCongeladoMin, int cantBolsasPan, int cantBolsasBatter, float pesoUnidadGr, String tipoPan, int golpesXMin, int cantUnidXGolpe, float kgPielPollo, float kgPechuga, int cantBolsaSoja, int cantMedXCaja) {
        super(nombre, kgXcaja, receta, cantCajaxPallet, velocidadTunel, temperaturaFrio, temperaturaAceiteCelcius, tiempoCongeladoMin, cantBolsasPan, cantBolsasBatter, pesoUnidadGr, tipoPan, golpesXMin, cantUnidXGolpe, kgPielPollo, kgPechuga, cantBolsaSoja);
        setCantMedXCaja(cantMedXCaja);
    }

    //Getters y Setters
    public int getCantMedXCaja() {
        return cantMedXCaja;
    }

    private void setCantMedXCaja(int cantMedXCaja) {
        this.cantMedXCaja = cantMedXCaja;
    }

    //To String
    public String toString() {
        String previousMessage=super.toString();
        String messageFormat=("\nMEDALLON POLLO\nCantidad de Meddalones x caja: %d\n");
        return previousMessage+String.format(messageFormat,getCantMedXCaja());
    }

}
