public abstract class Pollo extends Formados {
    //Private Attributes
    private float kgPielPollo;
    private float kgPechuga;
    private int cantBolsaSoja;

    //Constructors

    public Pollo(String nombre, float kgXcaja, Receta receta, int cantCajaxPallet, float velocidadTunel, int temperaturaFrio, int temperaturaAceiteCelcius, int tiempoCongeladoMin, int cantBolsasPan, int cantBolsasBatter, float pesoUnidadGr, String tipoPan, int golpesXMin, int cantUnidXGolpe, float kgPielPollo, float kgPechuga, int cantBolsaSoja) {
        super(nombre, kgXcaja, receta, cantCajaxPallet, velocidadTunel, temperaturaFrio, temperaturaAceiteCelcius, tiempoCongeladoMin, cantBolsasPan, cantBolsasBatter, pesoUnidadGr, tipoPan, golpesXMin, cantUnidXGolpe);
        setKgPielPollo(kgPielPollo);
        setKgPechuga(kgPechuga);
        setCantBolsaSoja(cantBolsaSoja);
    }

    //Getters & Setters
    public float getKgPielPollo() {
        return kgPielPollo;
    }

    private void setKgPielPollo(float kgPielPollo) {
        this.kgPielPollo = kgPielPollo;
    }

    public float getKgPechuga() {
        return kgPechuga;
    }

    private void setKgPechuga(float kgPechuga) {
        this.kgPechuga = kgPechuga;
    }

    public int getCantBolsaSoja() {
        return cantBolsaSoja;
    }

    private void setCantBolsaSoja(int cantBolsaSoja) {
        this.cantBolsaSoja = cantBolsaSoja;
    }

    //To String
    public String toString() {
        String previousMessage=super.toString();
        String messageFormat=("\nPOLLO\nKg Piel Pollo: %.2f\nKg Pechuga: %.2f\nCantidad de bolsas Soja utilizadas: %d\n");
        return previousMessage + String.format(messageFormat,getKgPielPollo(),getKgPechuga(),getCantBolsaSoja());
    }


}
