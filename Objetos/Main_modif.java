package Objetos;

import java.util.Scanner;

public class Main_modif {
    public static void main(String[] args) {
        int option = 0;
        Scanner scanner = null;

        try {
            scanner = new Scanner(System.in);
            while (option != 3) {
                menu();
                option = scanner.nextInt();

                switch (option) {
                    case 1:
                        System.out.print("Ingrese el ID del círculo: ");
                        int circleId = scanner.nextInt();
                        Circulo circulo = new Circulo(circleId, circleId / 100.0);

                        System.out.println("Seleccione una opción: ");
                        System.out.println("1. Calcular circunferencia");
                        System.out.println("2. Calcular área");
                        System.out.print("Opción: ");
                        int circleOption = scanner.nextInt();

                        switch (circleOption) {
                            case 1:
                                System.out.println("La circunferencia del círculo es: " + circulo.getCircunferencia());
                                break;
                            case 2:
                                System.out.println("El área del círculo es: " + circulo.getArea());
                                break;
                            default:
                                System.out.println("Opción inválida. Intente de nuevo.");
                                break;
                        }
                        break;
                    case 2:
                        System.out.print("Ingrese el ID del cuadrado: ");
                        int squareId = scanner.nextInt();
                        Cuadrado cuadrado = new Cuadrado(squareId);

                        System.out.println("Seleccione una opción: ");
                        System.out.println("1. Calcular perímetro");
                        System.out.println("2. Calcular área");
                        System.out.print("Opción: ");
                        int squareOption = scanner.nextInt();

                        switch (squareOption) {
                            case 1:
                                System.out.println("El perímetro del cuadrado es: " + cuadrado.getPerimetro());
                                break;
                            case 2:
                                System.out.println("El área del cuadrado es: " + cuadrado.getArea());
                                break;
                            default:
                                System.out.println("Opción inválida. Intente de nuevo.");
                                break;
                        }
                        break;
                }
            }
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }

    private static void menu() {
        System.out.println("=================================");
        System.out.println(" Bienvenido al programa de figuras ");
        System.out.println("=================================");
        System.out.println("Seleccione una opción: ");
        System.out.println("1. Crear círculo");
        System.out.println("2. Crear cuadrado");
        System.out.println("3. Salir");
        System.out.print("Opción: ");
    }

		
}

