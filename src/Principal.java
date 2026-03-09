import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 7) {

            System.out.println("*****************************");
            System.out.println("Conversor de Monedas");
            System.out.println("1) USD -> ARS");
            System.out.println("2) ARS -> USD");
            System.out.println("3) USD -> BRL");
            System.out.println("4) BRL -> USD");
            System.out.println("5) USD -> COP");
            System.out.println("6) COP -> USD");
            System.out.println("7) Salir");
            System.out.println("*****************************");

            System.out.println("Elija una opción:");
            opcion = lectura.nextInt();

            if (opcion == 7) {
                System.out.println("Programa finalizado.");
                break;
            }

            System.out.println("Ingrese el valor:");
            double valor = lectura.nextDouble();

            try {

                switch (opcion) {

                    case 1 -> ConversorAPI.convertir("USD", "ARS", valor);
                    case 2 -> ConversorAPI.convertir("ARS", "USD", valor);
                    case 3 -> ConversorAPI.convertir("USD", "BRL", valor);
                    case 4 -> ConversorAPI.convertir("BRL", "USD", valor);
                    case 5 -> ConversorAPI.convertir("USD", "COP", valor);
                    case 6 -> ConversorAPI.convertir("COP", "USD", valor);

                    default -> System.out.println("Opción inválida");

                }

            } catch (Exception e) {

                System.out.println("Error al realizar la conversión");

            }

        }

    }
}