public class Vehiculo {

    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private double tarifa;
    private boolean disponible;

    public Vehiculo(String matricula,
                    String marca,
                    String modelo,
                    String color,
                    double tarifa,
                    boolean disponible)
    {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tarifa = tarifa;
        this.disponible = disponible;
    }

    public String getAtributos()
    {
        return "Matricula: " + this.matricula +
                " Modelo: " + this.marca + " " + this.modelo +
                " Color: " + this.color +
                " Tarifa: " + this.tarifa +
                " Disponible: " + this.disponible;
    }

    public double getTarifa()
    {
        return this.tarifa;
    }

}
