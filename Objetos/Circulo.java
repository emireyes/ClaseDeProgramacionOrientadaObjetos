package Objetos;

public class Circulo {
    private int id;
    private double radio;

    public Circulo(int id, double radio) {
        this.id = id;
        this.radio = radio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getCircunferencia() {
        return 2 * Math.PI * this.radio;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radio, 2);
    }
}