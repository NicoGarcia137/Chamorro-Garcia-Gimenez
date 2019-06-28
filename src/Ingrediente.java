import java.util.Objects;

public class Ingrediente {
private int codigo;
private static int generatecodigo=1;
private String nombre;
private int CantBolsas;
private int KgXBolsa;
private String Descripcion;
private String Vencimiento;
private String Fabricante;

//Constructores
    public Ingrediente(String nombre, int cantBolsas, int kgXBolsa, String descripcion, Integer kgSobrantes, String vencimiento, String fabricante) {
       setCodigo();
        setNombre(nombre);
        setCantBolsas(cantBolsas);
        setKgXBolsa(kgXBolsa);
        setDescripcion(descripcion);
        setVencimiento(vencimiento);
        setFabricante(fabricante);

    }
//Metodos


    private void setCodigo() {
        this.codigo = generatecodigo;
        generatecodigo++;
    }

    public int getCodigo() {
        return codigo;
    }



    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantBolsas() {
        return CantBolsas;
    }

    private void setCantBolsas(Integer cantBolsas) {
        CantBolsas = cantBolsas;
    }

    public int getKgXBolsa() {
        return KgXBolsa;
    }

    private void setKgXBolsa(Integer kgXBolsa) {
        KgXBolsa = kgXBolsa;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    private void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getVencimiento() {
        return Vencimiento;
    }

    private void setVencimiento(String vencimiento) {
        Vencimiento = vencimiento;
    }

    public String getFabricante() {
        return Fabricante;
    }

    private void setFabricante(String fabricante) {
        Fabricante = fabricante;
    }

    //Sobreescritura
    public String toString() {
        String messageFormat = "Codigo: %d \n Nombre:%s \n Cantidad Bolsas:%d \n Kg x Bolsa: %d \n  Descripcion :%s \n Vencimiento:%s \n Fabricante: %s ";

        return String.format(messageFormat,getCodigo(),getNombre(),getCantBolsas(),getKgXBolsa(),getDescripcion(),getVencimiento(),getFabricante());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ingrediente that = (Ingrediente) o;
        return nombre.equals(that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

}
