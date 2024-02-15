package Objetos;

public class Circulo {

	    int id;
	    double radio;
	    double circunferencia;
	    double area;

	    public Circulo(int id) {
	        this.id = id;
	        this.radio = (double) id / 100;
	        this.circunferencia = 2 * Math.PI * this.radio;
	        this.area = Math.PI * Math.pow(this.radio, 2);
	    }

	    public double getCircunferencia() {
	        return circunferencia;
	    }

	    public double getArea() {
	        return area;
}
}