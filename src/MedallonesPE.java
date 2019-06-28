public class MedallonesPE extends Pescado{
    //Private attributes
    private int cantMedXCaja;

    //Constructors

    public MedallonesPE(String nombre, float kgXcaja, Receta receta, int cantCajaxPallet, float velocidadTunel, int temperaturaFrio, int temperaturaAceiteCelcius, int tiempoCongeladoMin, int cantBolsasPan, int cantBolsasBatter, float pesoUnidadGr, String tipoPan, int golpesXMin, int cantUnidXGolpe, String tipoPescado, float kgPescadoUsado, int cantMedXCaja) {
        super(nombre, kgXcaja, receta, cantCajaxPallet, velocidadTunel, temperaturaFrio, temperaturaAceiteCelcius, tiempoCongeladoMin, cantBolsasPan, cantBolsasBatter, pesoUnidadGr, tipoPan, golpesXMin, cantUnidXGolpe, tipoPescado, kgPescadoUsado);
        setCantMedXCaja(cantMedXCaja);
    }

    //Getters y setters
    public int getCantMedXCaja() {
        return cantMedXCaja;
    }

    private void setCantMedXCaja(int cantMedXCaja) {
        this.cantMedXCaja = cantMedXCaja;
    }

    //To String
    public String toString() {
        String previousMessage=super.toString();
        String messageFormat=("\nMEDALLONES PESCADO\nCantidad de Medallones x caja: %d\n");
        return previousMessage+String.format(messageFormat,getCantMedXCaja());
    }
}