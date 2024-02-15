package Objetos;


public class Cuadrado {

	    int id;
	    int lado;
	    double diagonal;

	    public Cuadrado(int id) {
	        this.id = id;
	        this.lado = id / 100;
	        this.diagonal = Math.sqrt(2) * this.lado;
	    }

	    public double calculatePerimeter() {
	        return 4 * this.lado;
	    }

	    public double calculateArea() {
	        return Math.pow(this.lado, 2);
	    }
	}

