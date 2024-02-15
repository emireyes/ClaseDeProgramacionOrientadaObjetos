package Objetos;

class Cuadrado {
    int id;
    double lado;
    public String diagonal;

    public Cuadrado(int id) {
        this.id = id;
        this.lado = (double) id / 100;
    }

    public double getPerimetro() {
        return 4 * this.lado;
    }

    public double getArea() {
        return Math.pow(this.lado, 2);
    }

    public String calculatePerimeter() {
        throw new UnsupportedOperationException("Unimplemented method 'calculatePerimeter'");
    }

    public String calculateArea() {
        throw new UnsupportedOperationException("Unimplemented method 'calculateArea'");
    }
}
