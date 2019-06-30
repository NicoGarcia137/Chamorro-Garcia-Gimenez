public abstract class Mariscos extends Prefrito  {
    //Private Attributes

    private float kgIngresados;


    //Constructors

    public Mariscos(String nombre, float kgXcaja, Receta receta, int cantCajaxPallet, float precioxKg, float velocidadTunel, int temperaturaFrio, int temperaturaAceiteCelcius, int tiempoCongeladoMin, int cantBolsasPan, int cantBolsasBatter, float pesoUnidadGr, String tipoPan, float kgIngresados) {
        super(nombre, kgXcaja, receta, cantCajaxPallet, precioxKg, velocidadTunel, temperaturaFrio, temperaturaAceiteCelcius, tiempoCongeladoMin, cantBolsasPan, cantBolsasBatter, pesoUnidadGr, tipoPan);
        setKgIngresados(kgIngresados);
    }


    //Getters & Setters

    public float getKgIngresados() {
        return kgIngresados;
    }

    private void setKgIngresados(float kgIngresados) {
        this.kgIngresados = kgIngresados;
    }

    //Methods
    //To String
    public String toString() {
        String previousMessage=super.toString();
        String messageFormat=("\nKg Ingresados: %.2f\n");
        return previousMessage + String.format(messageFormat,getKgIngresados());
    }

}
