public class Nuggets extends Pollo{
    //atrivutos
    private int cantBolPanSecundario;
    private String tipopanSecundario;

    //getters y setters
    public int getCantBolPanSecundario() {
        return cantBolPanSecundario;
    }

    public void setCantBolPanSecundario(int cantBolPanSecundario) {
        this.cantBolPanSecundario = cantBolPanSecundario;
    }

    public String getTipopanSecundario() {
        return tipopanSecundario;
    }

    public void setTipopanSecundario(String tipopanSecundario) {
        this.tipopanSecundario = tipopanSecundario;
    }

    //To String
    @Override
    public String toString() {
        return "Nuggets{" +
                "cantBolPanSecundario=" + cantBolPanSecundario +
                ", tipopanSecundario='" + tipopanSecundario + '\'' +
                '}';
    }

    //constructor
    public Nuggets(int id, String nombre, float kgXcaja, Receta receta, int cantCajaxPallet, float velocidadTunel, int temperaturaFrio, int temperaturaAceiteCelcius, int tiempoCongeladoMin, int cantBolsasPan, int cantBolsasBatter, float pesoUnidadGr, String tipoPan, int idFormadora, int golpesXMin, int cantUnidXGolpe, float kgPielPollo, float kgPechuga, int cantBolsaSoja, int cantBolPanSecundario, String tipopanSecundario) {
        super(id, nombre, kgXcaja, receta, cantCajaxPallet, velocidadTunel, temperaturaFrio, temperaturaAceiteCelcius, tiempoCongeladoMin, cantBolsasPan, cantBolsasBatter, pesoUnidadGr, tipoPan, idFormadora, golpesXMin, cantUnidXGolpe, kgPielPollo, kgPechuga, cantBolsaSoja);
        this.cantBolPanSecundario = cantBolPanSecundario;
        this.tipopanSecundario = tipopanSecundario;
    }

}
