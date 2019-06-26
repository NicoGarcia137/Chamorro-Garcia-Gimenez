public abstract class Prefrito extends Producto {
    //atrivutos
    private float velocidadTunel;
    private int temperaturaFrio;
    private int temperaturaAceiteCelcius;
    private int tiempoCongeladoMin;
    private int cantBolsasPan;
    private int cantBolsasBatter;
    private float pesoUnidadGr;
    private String tipoPan;

    //getters y setters
    public float getVelocidadTunel() {
        return velocidadTunel;
    }

    public void setVelocidadTunel(float velocidadTunel) {
        this.velocidadTunel = velocidadTunel;
    }

    public int getTemperaturaFrio() {
        return temperaturaFrio;
    }

    public void setTemperaturaFrio(int temperaturaFrio) {
        this.temperaturaFrio = temperaturaFrio;
    }

    public int getTemperaturaAceiteCelcius() {
        return temperaturaAceiteCelcius;
    }

    public void setTemperaturaAceiteCelcius(int temperaturaAceiteCelcius) {
        this.temperaturaAceiteCelcius = temperaturaAceiteCelcius;
    }

    public int getTiempoCongeladoMin() {
        return tiempoCongeladoMin;
    }

    public void setTiempoCongeladoMin(int tiempoCongeladoMin) {
        this.tiempoCongeladoMin = tiempoCongeladoMin;
    }

    public int getCantBolsasPan() {
        return cantBolsasPan;
    }

    public void setCantBolsasPan(int cantBolsasPan) {
        this.cantBolsasPan = cantBolsasPan;
    }

    public int getCantBolsasBatter() {
        return cantBolsasBatter;
    }

    public void setCantBolsasBatter(int cantBolsasBatter) {
        this.cantBolsasBatter = cantBolsasBatter;
    }

    public float getPesoUnidadGr() {
        return pesoUnidadGr;
    }

    public void setPesoUnidadGr(float pesoUnidadGr) {
        this.pesoUnidadGr = pesoUnidadGr;
    }

    public String getTipoPan() {
        return tipoPan;
    }

    public void setTipoPan(String tipoPan) {
        this.tipoPan = tipoPan;
    }

    //To String

    @Override
    public String toString() {
        return "Prefrito{" +
                "velocidadTunel=" + velocidadTunel +
                ", temperaturaFrio=" + temperaturaFrio +
                ", temperaturaAceiteCelcius=" + temperaturaAceiteCelcius +
                ", tiempoCongeladoMin=" + tiempoCongeladoMin +
                ", cantBolsasPan=" + cantBolsasPan +
                ", cantBolsasBatter=" + cantBolsasBatter +
                ", pesoUnidadGr=" + pesoUnidadGr +
                ", tipoPan='" + tipoPan + '\'' +
                '}';
    }
    //constructor
    public Prefrito(int id, String nombre, float kgXcaja, Receta receta, int cantCajaxPallet, float velocidadTunel, int temperaturaFrio, int temperaturaAceiteCelcius, int tiempoCongeladoMin, int cantBolsasPan, int cantBolsasBatter, float pesoUnidadGr, String tipoPan) {
        super(id, nombre, kgXcaja, receta, cantCajaxPallet);
        this.velocidadTunel = velocidadTunel;
        this.temperaturaFrio = temperaturaFrio;
        this.temperaturaAceiteCelcius = temperaturaAceiteCelcius;
        this.tiempoCongeladoMin = tiempoCongeladoMin;
        this.cantBolsasPan = cantBolsasPan;
        this.cantBolsasBatter = cantBolsasBatter;
        this.pesoUnidadGr = pesoUnidadGr;
        this.tipoPan = tipoPan;
    }
}
