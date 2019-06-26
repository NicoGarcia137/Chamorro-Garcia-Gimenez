public class MedallonesPE extends Pescado{
    //atrivutos
    private int cantMedXCaja;

    //Getters y setters
    public int getCantMedXCaja() {
        return cantMedXCaja;
    }

    public void setCantMedXCaja(int cantMedXCaja) {
        this.cantMedXCaja = cantMedXCaja;
    }

    //To String
    @Override
    public String toString() {
        return "MedallonesPE{" +
                "cantMedXCaja=" + cantMedXCaja +
                '}';
    }
    //constructor

    public MedallonesPE(int id, String nombre, float kgXcaja, Receta receta, int cantCajaxPallet, float velocidadTunel, int temperaturaFrio, int temperaturaAceiteCelcius, int tiempoCongeladoMin, int cantBolsasPan, int cantBolsasBatter, float pesoUnidadGr, String tipoPan, int idFormadora, int golpesXMin, int cantUnidXGolpe, String tipoPescado, float kgPescadoUsado, int cantMedXCaja) {
        super(id, nombre, kgXcaja, receta, cantCajaxPallet, velocidadTunel, temperaturaFrio, temperaturaAceiteCelcius, tiempoCongeladoMin, cantBolsasPan, cantBolsasBatter, pesoUnidadGr, tipoPan, idFormadora, golpesXMin, cantUnidXGolpe, tipoPescado, kgPescadoUsado);
        this.cantMedXCaja = cantMedXCaja;
    }
}