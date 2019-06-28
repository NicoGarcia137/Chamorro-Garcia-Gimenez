public class FiletMerluza extends Mariscos{
    //Private Attrivutes
    private int canBolPanSecundario;
    private String tipoPanSecundario;

    //Constructors

    public FiletMerluza(String nombre, float kgXcaja, Receta receta, int cantCajaxPallet, float velocidadTunel, int temperaturaFrio, int temperaturaAceiteCelcius, int tiempoCongeladoMin, int cantBolsasPan, int cantBolsasBatter, float pesoUnidadGr, String tipoPan, float kgIngresados, int canBolPanSecundario, String tipoPanSecundario) {
        super(nombre, kgXcaja, receta, cantCajaxPallet, velocidadTunel, temperaturaFrio, temperaturaAceiteCelcius, tiempoCongeladoMin, cantBolsasPan, cantBolsasBatter, pesoUnidadGr, tipoPan, kgIngresados);
        setCanBolPanSecundario(canBolPanSecundario);
        setTipoPanSecundario(tipoPanSecundario);
    }

    //Getters y Setters
    public int getCanBolPanSecundario() {
        return canBolPanSecundario;
    }

    private void setCanBolPanSecundario(int canBolPanSecundario) {
        this.canBolPanSecundario = canBolPanSecundario;
    }

    public String getTipoPanSecundario() {
        return tipoPanSecundario;
    }

    private void setTipoPanSecundario(String tipoPanSecundario) {
        this.tipoPanSecundario = tipoPanSecundario;
    }

    //To String
    public String toString() {
        String previousMessage=super.toString();
        String messageFormat=("\nFILET DE MERLUZA\nTipo de Pan secundario: %s\nCantidad de bolsas Pan secundario utilizadas: %d\n");
        return previousMessage+String.format(messageFormat,getTipoPanSecundario(),getCanBolPanSecundario());
    }
}
