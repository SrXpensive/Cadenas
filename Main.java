// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int opcion;
        do{
            System.out.println("MENU");
            System.out.println("----------");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Ejercicio 4");
            System.out.println("5. Ejercicio 5");
            System.out.println("0. Salir");
            opcion = Leer.leerEntero("Introduce una opción: ");
            switch (opcion){
                case 1:
                    Cadenas.ejer1();
                    break;
                case 2:
                    Cadenas.ejer2();
                    break;
            }
        }while(opcion != 0);
        }
    }
