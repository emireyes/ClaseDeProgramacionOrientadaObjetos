package Objetos;

public class Main {

	    public static void main(String[] args) {
	        int id = 209;
	        Cuadrado cuadrado = new Cuadrado(id);

	        System.out.println("ID: " + cuadrado.id);
	        System.out.println("Lado: " + cuadrado.lado + " cm");
	        System.out.println("Diagonal: " + cuadrado.diagonal + " cm");
	        System.out.println("Perímetro: " + cuadrado.calculatePerimeter() + " cm");
	        System.out.println("Área: " + cuadrado.calculateArea() + " cm²");
        }
    }

 
    

