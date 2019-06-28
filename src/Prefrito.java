public abstract class Prefrito extends Producto {
    //Private attributes
    private float velocidadTunel;
    private int temperaturaFrio;
    private int temperaturaAceiteCelcius;
    private int tiempoCongeladoMin;
    private int cantBolsasPan;
    private int cantBolsasBatter;
    private float pesoUnidadGr;
    private String tipoPan;

    //Constructors
    public Prefrito(String nombre, float kgXcaja, Receta receta, int cantCajaxPallet, float velocidadTunel, int temperaturaFrio, int temperaturaAceiteCelcius, int tiempoCongeladoMin, int cantBolsasPan, int cantBolsasBatter, float pesoUnidadGr, String tipoPan) {
        super(nombre, kgXcaja, receta, cantCajaxPallet);
        setVelocidadTunel(velocidadTunel);
        setTemperaturaFrio(temperaturaFrio);
        setTemperaturaAceiteCelcius(temperaturaAceiteCelcius);
        setTiempoCongeladoMin(tiempoCongeladoMin);
        setCantBolsasPan(cantBolsasPan);
        setCantBolsasBatter(cantBolsasBatter);
        setPesoUnidadGr(pesoUnidadGr);
        setTipoPan(tipoPan);
    }

    //Getters y Setters
    public float getVelocidadTunel() {
        return velocidadTunel;
    }

    private void setVelocidadTunel(float velocidadTunel) {
        this.velocidadTunel = velocidadTunel;
    }

    public int getTemperaturaFrio() {
        return temperaturaFrio;
    }

    private void setTemperaturaFrio(int temperaturaFrio) {
        this.temperaturaFrio = temperaturaFrio;
    }

    public int getTemperaturaAceiteCelcius() {
        return temperaturaAceiteCelcius;
    }

    private void setTemperaturaAceiteCelcius(int temperaturaAceiteCelcius) {
        this.temperaturaAceiteCelcius = temperaturaAceiteCelcius;
    }

    public int getTiempoCongeladoMin() {
        return tiempoCongeladoMin;
    }

    private void setTiempoCongeladoMin(int tiempoCongeladoMin) {
        this.tiempoCongeladoMin = tiempoCongeladoMin;
    }

    public int getCantBolsasPan() {
        return cantBolsasPan;
    }

    private void setCantBolsasPan(int cantBolsasPan) {
        this.cantBolsasPan = cantBolsasPan;
    }

    public int getCantBolsasBatter() {
        return cantBolsasBatter;
    }

    private void setCantBolsasBatter(int cantBolsasBatter) {
        this.cantBolsasBatter = cantBolsasBatter;
    }

    public float getPesoUnidadGr() {
        return pesoUnidadGr;
    }

    private void setPesoUnidadGr(float pesoUnidadGr) {
        this.pesoUnidadGr = pesoUnidadGr;
    }

    public String getTipoPan() {
        return tipoPan;
    }

    private void setTipoPan(String tipoPan) {
        this.tipoPan = tipoPan;
    }

    //To String

    public String toString() {
        String previousMessage = super.toString();
        String messageFormat=("\nVelocidad del Tunel IQF: %.2f\nTemperatura del Frio (°C): %d\nTemperatura Aceite (°C): %d\nTiempo de congelado (MIN): %d\nPeso unidad en gramos: %.2f\nCantidad de Bolsas de Pan utilizadas: %d\nTipo de pan utilizado: %s\nCantidad de bolsas Batter utilizadas: %d\n");
        return previousMessage + String.format(messageFormat,getVelocidadTunel(),getTemperaturaFrio(),getTemperaturaAceiteCelcius(),getTiempoCongeladoMin(),getPesoUnidadGr(),getCantBolsasPan(),getTipoPan(),getCantBolsasBatter());
    }
}
