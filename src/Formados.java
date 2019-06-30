public abstract class Formados extends Prefrito  {

    //Private Attributes
    private static int code=0;
    private int idFormadora;
    private int GolpesXMin;
    private int CantUnidXGolpe;

    //Constructors


    public Formados(String nombre, float kgXcaja, Receta receta, int cantCajaxPallet, float precioxKg, float velocidadTunel, int temperaturaFrio, int temperaturaAceiteCelcius, int tiempoCongeladoMin, int cantBolsasPan, int cantBolsasBatter, float pesoUnidadGr, String tipoPan, int idFormadora, int golpesXMin, int cantUnidXGolpe) {
        super(nombre, kgXcaja, receta, cantCajaxPallet, precioxKg, velocidadTunel, temperaturaFrio, temperaturaAceiteCelcius, tiempoCongeladoMin, cantBolsasPan, cantBolsasBatter, pesoUnidadGr, tipoPan);
        setIdFormadora();
        setGolpesXMin(golpesXMin);
        setCantUnidXGolpe(cantUnidXGolpe);
    }


    //Getters y Setters
    public int getIdFormadora() {
        return idFormadora;
    }

    private void setIdFormadora() {
        idFormadora=code;
        code++;
    }

    public int getGolpesXMin() {
        return GolpesXMin;
    }

    private void setGolpesXMin(int golpesXMin) {
        GolpesXMin = golpesXMin;
    }

    public int getCantUnidXGolpe() {
        return CantUnidXGolpe;
    }

    private void setCantUnidXGolpe(int cantUnidXGolpe) {
        CantUnidXGolpe = cantUnidXGolpe;
    }

    //To String
    public String toString() {
        String previousMessage=super.toString();
        String messageFormat=("\nId Formadora: %d\nGoles por minuto: %d\nCantidad de unidades por golpe: %d\n");
        return previousMessage + String.format(messageFormat,getIdFormadora(),getGolpesXMin(),getCantUnidXGolpe());
    }


}
