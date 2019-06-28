public class FInfantiles extends Pescado {
    //Private attributes
    private int cantStilosForm;
    //Constructors

    public FInfantiles(String nombre, float kgXcaja, Receta receta, int cantCajaxPallet, float velocidadTunel, int temperaturaFrio, int temperaturaAceiteCelcius, int tiempoCongeladoMin, int cantBolsasPan, int cantBolsasBatter, float pesoUnidadGr, String tipoPan, int golpesXMin, int cantUnidXGolpe, String tipoPescado, float kgPescadoUsado, int cantStilosForm) {
        super(nombre, kgXcaja, receta, cantCajaxPallet, velocidadTunel, temperaturaFrio, temperaturaAceiteCelcius, tiempoCongeladoMin, cantBolsasPan, cantBolsasBatter, pesoUnidadGr, tipoPan, golpesXMin, cantUnidXGolpe, tipoPescado, kgPescadoUsado);
        setCantStilosForm(cantStilosForm);
    }

    //Getters y Setters
    public int getCantStilosForm() {
        return cantStilosForm;
    }

    private void setCantStilosForm(int cantStilosForm) {
        this.cantStilosForm = cantStilosForm;
    }

    //To String
    public String toString() {
        String previousMessage=super.toString();
        String messageFormat=("\nFORMITAS INFANTILES\nCantidad de estilos de formitas: %d\n");
        return previousMessage+String.format(messageFormat,getCantStilosForm());
    }
}