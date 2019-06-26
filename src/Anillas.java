public class Anillas extends Mariscos {
    //atrivutos
    private int cantbolBatterAni;
    private int cantBolPanSecundario;
    private String tipoPanSecundario;

    //getters y setters
    public int getCantbolBatterAni() {
        return cantbolBatterAni;
    }

    public void setCantbolBatterAni(int cantbolBatterAni) {
        this.cantbolBatterAni = cantbolBatterAni;
    }

    public int getCantBolPanSecundario() {
        return cantBolPanSecundario;
    }

    public void setCantBolPanSecundario(int cantBolPanSecundario) {
        this.cantBolPanSecundario = cantBolPanSecundario;
    }

    public String getTipoPanSecundario() {
        return tipoPanSecundario;
    }

    public void setTipoPanSecundario(String tipoPanSecundario) {
        this.tipoPanSecundario = tipoPanSecundario;
    }

    //to string
    @Override
    public String toString() {
        return "Anillas{" +
                "cantbolBatterAni=" + cantbolBatterAni +
                ", cantBolPanSecundario=" + cantBolPanSecundario +
                ", tipoPanSecundario='" + tipoPanSecundario + '\'' +
                '}';
    }
    //constructor


    public Anillas(int id, String nombre, float kgXcaja, Receta receta, int cantCajaxPallet, float velocidadTunel, int temperaturaFrio, int temperaturaAceiteCelcius, int tiempoCongeladoMin, int cantBolsasPan, int cantBolsasBatter, float pesoUnidadGr, String tipoPan, float kgIngresados, int cantbolBatterAni, int cantBolPanSecundario, String tipoPanSecundario) {
        super(id, nombre, kgXcaja, receta, cantCajaxPallet, velocidadTunel, temperaturaFrio, temperaturaAceiteCelcius, tiempoCongeladoMin, cantBolsasPan, cantBolsasBatter, pesoUnidadGr, tipoPan, kgIngresados);
        this.cantbolBatterAni = cantbolBatterAni;
        this.cantBolPanSecundario = cantBolPanSecundario;
        this.tipoPanSecundario = tipoPanSecundario;
    }
}
