public class LangostinoPelado extends  Mariscos {
    //Private Attributes
        private int cantBolPanSecundario;
        private String tipoPanSecundario;
        private int cantBolCereal;

    //Constructors

    public LangostinoPelado(String nombre, float kgXcaja, Receta receta, int cantCajaxPallet, float precioxKg, float velocidadTunel, int temperaturaFrio, int temperaturaAceiteCelcius, int tiempoCongeladoMin, int cantBolsasPan, int cantBolsasBatter, float pesoUnidadGr, String tipoPan, float kgIngresados, int cantBolPanSecundario, String tipoPanSecundario, int cantBolCereal) {
        super(nombre, kgXcaja, receta, cantCajaxPallet, precioxKg, velocidadTunel, temperaturaFrio, temperaturaAceiteCelcius, tiempoCongeladoMin, cantBolsasPan, cantBolsasBatter, pesoUnidadGr, tipoPan, kgIngresados);
        setCantBolPanSecundario(cantBolPanSecundario);
        setTipoPanSecundario(tipoPanSecundario);
        setCantBolCereal(cantBolCereal);
    }


    //Getters y Setters

    public int getCantBolPanSecundario() {
            return cantBolPanSecundario;
        }

        private void setCantBolPanSecundario(int cantBolPanSecundario) {
            this.cantBolPanSecundario = cantBolPanSecundario;
        }

        public String getTipoPanSecundario() {
            return tipoPanSecundario;
        }

        private void setTipoPanSecundario(String tipoPanSecundario) {
            this.tipoPanSecundario = tipoPanSecundario;
        }

        public int getCantBolCereal() {
            return cantBolCereal;
        }

        private void setCantBolCereal(int cantBolCereal) {
            this.cantBolCereal = cantBolCereal;
        }
        //To string

        public String toString() {
            String previousMessage=super.toString();
            String messageFormat=("\nLangostino Pelado\nTipo de Pan Secundario: %s\nCantidad de bolsa Pan Secundario utilizadas: %d\nCantidad de bolsas de Cereal utilizadas: %d\n");
            return previousMessage + String.format(messageFormat,getTipoPanSecundario(),getCantBolPanSecundario(),getCantBolCereal());
        }

}


