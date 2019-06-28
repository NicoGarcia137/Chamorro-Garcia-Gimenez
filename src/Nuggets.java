public class Nuggets extends Pollo{
    //Private attributes
    private int cantBolPanSecundario;
    private String tipopanSecundario;

    //Constructors

    public Nuggets(String nombre, float kgXcaja, Receta receta, int cantCajaxPallet, float velocidadTunel, int temperaturaFrio, int temperaturaAceiteCelcius, int tiempoCongeladoMin, int cantBolsasPan, int cantBolsasBatter, float pesoUnidadGr, String tipoPan, int golpesXMin, int cantUnidXGolpe, float kgPielPollo, float kgPechuga, int cantBolsaSoja, int cantBolPanSecundario, String tipopanSecundario) {
        super(nombre, kgXcaja, receta, cantCajaxPallet, velocidadTunel, temperaturaFrio, temperaturaAceiteCelcius, tiempoCongeladoMin, cantBolsasPan, cantBolsasBatter, pesoUnidadGr, tipoPan, golpesXMin, cantUnidXGolpe, kgPielPollo, kgPechuga, cantBolsaSoja);
        setTipopanSecundario(tipoPan);
        setCantBolPanSecundario(cantBolPanSecundario);
    }

    //Getters y Setters
    public int getCantBolPanSecundario() {
        return cantBolPanSecundario;
    }

    private void setCantBolPanSecundario(int cantBolPanSecundario) {
        this.cantBolPanSecundario = cantBolPanSecundario;
    }

    public String getTipopanSecundario() {
        return tipopanSecundario;
    }

    private void setTipopanSecundario(String tipopanSecundario) {
        this.tipopanSecundario = tipopanSecundario;
    }

    //To String
    public String toString() {
        String previousMessage=super.toString();
        String messageFormat=("\nNUGGETS DE POLLO\nTipo de pan Secundario\nCantidad de bolsas de Pan secundario utilizadas: %d\n");
        return previousMessage+String.format(messageFormat,getTipopanSecundario(),getCantBolPanSecundario());
    }

}
