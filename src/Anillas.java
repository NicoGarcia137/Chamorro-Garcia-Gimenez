public class Anillas extends Mariscos {
    //Private Attributes

    private int cantbolBatterAni;
    private int cantBolPanSecundario;
    private String tipoPanSecundario;

    //Constructors


    public Anillas(String nombre, float kgXcaja, Receta receta, int cantCajaxPallet, float velocidadTunel, int temperaturaFrio, int temperaturaAceiteCelcius, int tiempoCongeladoMin, int cantBolsasPan, int cantBolsasBatter, float pesoUnidadGr, String tipoPan, float kgIngresados, int cantbolBatterAni, int cantBolPanSecundario, String tipoPanSecundario) {
        super(nombre, kgXcaja, receta, cantCajaxPallet, velocidadTunel, temperaturaFrio, temperaturaAceiteCelcius, tiempoCongeladoMin, cantBolsasPan, cantBolsasBatter, pesoUnidadGr, tipoPan, kgIngresados);
        setCantbolBatterAni(cantbolBatterAni);
        setCantBolPanSecundario(cantBolPanSecundario);
        setTipoPanSecundario(tipoPanSecundario);
    }

    //Getters y Setters
    public int getCantbolBatterAni() {
        return cantbolBatterAni;
    }

    private void setCantbolBatterAni(int cantbolBatterAni) {
        this.cantbolBatterAni = cantbolBatterAni;
    }

    public int getCantBolPanSecundario() {
        return cantBolPanSecundario;
    }

    private void setCantBolPanSecundario(int cantBolPanSecundario) {
        this.cantBolPanSecundario = cantBolPanSecundario;
    }

    public String getTipoPanSecundario() {
        return tipoPanSecundario;
    }

    private void setTipoPanSecundario(String tipoPanSecundario) {
        this.tipoPanSecundario = tipoPanSecundario;
    }

    //Methods
    //To String
    public String toString() {
        String previousMessage=super.toString();
        String messageFormat=("\nANILLAS\nTipo de Pan secundario: %s\nCantidad de bolsas Pan Secundario utilizadas: %d\nCantdad de Bolsas de Batter Anillas: %d\n");
        return previousMessage+String.format(messageFormat,getTipoPanSecundario(),getCantBolPanSecundario(),getCantbolBatterAni());
    }
}
