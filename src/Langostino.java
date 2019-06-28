public class LangostinoPelado extends Mariscos {
    //atrivutos
    private int cantBolPanSecundario;
    private String tipoPanSecundario;
    private int cantBolCereal;

    //getters y setters
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

    public int getCantBolCereal() {
        return cantBolCereal;
    }

    public void setCantBolCereal(int cantBolCereal) {
        this.cantBolCereal = cantBolCereal;
    }

    //To string
    @Override
    public String toString() {
        return "LangostinoPelado{" +
                "cantBolPanSecundario=" + cantBolPanSecundario +
                ", tipoPanSecundario='" + tipoPanSecundario + '\'' +
                ", cantBolCereal=" + cantBolCereal +
                '}';
    }

    //constructor

    public LangostinoPelado(int id, String nombre, float kgXcaja, Receta receta, int cantCajaxPallet, float velocidadTunel, int temperaturaFrio, int temperaturaAceiteCelcius, int tiempoCongeladoMin, int cantBolsasPan, int cantBolsasBatter, float pesoUnidadGr, String tipoPan, float kgIngresados, int cantBolPanSecundario, String tipoPanSecundario, int cantBolCereal) {
        super(id, nombre, kgXcaja, receta, cantCajaxPallet, velocidadTunel, temperaturaFrio, temperaturaAceiteCelcius, tiempoCongeladoMin, cantBolsasPan, cantBolsasBatter, pesoUnidadGr, tipoPan, kgIngresados);
        this.cantBolPanSecundario = cantBolPanSecundario;
        this.tipoPanSecundario = tipoPanSecundario;
        this.cantBolCereal = cantBolCereal;
    }
}
