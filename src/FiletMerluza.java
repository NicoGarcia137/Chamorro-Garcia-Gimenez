public class FiletMerluza extends Mariscos{
    //atrivutos
    private int canBolPanSecundario;
    private String tipoPanSecundario;

    //getters y setters
    public int getCanBolPanSecundario() {
        return canBolPanSecundario;
    }

    public void setCanBolPanSecundario(int canBolPanSecundario) {
        this.canBolPanSecundario = canBolPanSecundario;
    }

    public String getTipoPanSecundario() {
        return tipoPanSecundario;
    }

    public void setTipoPanSecundario(String tipoPanSecundario) {
        this.tipoPanSecundario = tipoPanSecundario;
    }

    //To String
    @Override
    public String toString() {
        return "FiletMerluza{" +
                "canBolPanSecundario=" + canBolPanSecundario +
                ", tipoPanSecundario='" + tipoPanSecundario + '\'' +
                '}';
    }
    //constructor

    public FiletMerluza(int id, String nombre, float kgXcaja, Receta receta, int cantCajaxPallet, float velocidadTunel, int temperaturaFrio, int temperaturaAceiteCelcius, int tiempoCongeladoMin, int cantBolsasPan, int cantBolsasBatter, float pesoUnidadGr, String tipoPan, float kgIngresados, int canBolPanSecundario, String tipoPanSecundario) {
        super(id, nombre, kgXcaja, receta, cantCajaxPallet, velocidadTunel, temperaturaFrio, temperaturaAceiteCelcius, tiempoCongeladoMin, cantBolsasPan, cantBolsasBatter, pesoUnidadGr, tipoPan, kgIngresados);
        this.canBolPanSecundario = canBolPanSecundario;
        this.tipoPanSecundario = tipoPanSecundario;
    }
}
