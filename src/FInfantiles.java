public class FInfantiles extends Pescado {
    //atrivutos
    private int cantStilosForm;

    //getters y setters
    public int getCantStilosForm() {
        return cantStilosForm;
    }

    public void setCantStilosForm(int cantStilosForm) {
        this.cantStilosForm = cantStilosForm;
    }

    //To String
    @Override
    public String toString() {
        return "FInfantiles{" +
                "cantStilosForm=" + cantStilosForm +
                '}';
    }

    //constructor

    public FInfantiles(int id, String nombre, float kgXcaja, Receta receta, int cantCajaxPallet, float velocidadTunel, int temperaturaFrio, int temperaturaAceiteCelcius, int tiempoCongeladoMin, int cantBolsasPan, int cantBolsasBatter, float pesoUnidadGr, String tipoPan, int idFormadora, int golpesXMin, int cantUnidXGolpe, String tipoPescado, float kgPescadoUsado, int cantStilosForm) {
        super(id, nombre, kgXcaja, receta, cantCajaxPallet, velocidadTunel, temperaturaFrio, temperaturaAceiteCelcius, tiempoCongeladoMin, cantBolsasPan, cantBolsasBatter, pesoUnidadGr, tipoPan, idFormadora, golpesXMin, cantUnidXGolpe, tipoPescado, kgPescadoUsado);
        this.cantStilosForm = cantStilosForm;
    }
}