public class MedallonPO extends Pollo {
    //atrivutos
    private int cantMedXCaja;

    //getters y setters
    public int getCantMedXCaja() {
        return cantMedXCaja;
    }

    public void setCantMedXCaja(int cantMedXCaja) {
        this.cantMedXCaja = cantMedXCaja;
    }

    //to String
    @Override
    public String toString() {
        return "MedallonPO{" +
                "cantMedXCaja=" + cantMedXCaja +
                '}';
    }

    //constructor
    public MedallonPO(int id, String nombre, float kgXcaja, Receta receta, int cantCajaxPallet, float velocidadTunel, int temperaturaFrio, int temperaturaAceiteCelcius, int tiempoCongeladoMin, int cantBolsasPan, int cantBolsasBatter, float pesoUnidadGr, String tipoPan, int idFormadora, int golpesXMin, int cantUnidXGolpe, float kgPielPollo, float kgPechuga, int cantBolsaSoja, int cantMedXCaja) {
        super(id, nombre, kgXcaja, receta, cantCajaxPallet, velocidadTunel, temperaturaFrio, temperaturaAceiteCelcius, tiempoCongeladoMin, cantBolsasPan, cantBolsasBatter, pesoUnidadGr, tipoPan, idFormadora, golpesXMin, cantUnidXGolpe, kgPielPollo, kgPechuga, cantBolsaSoja);
        this.cantMedXCaja = cantMedXCaja;
    }

}
