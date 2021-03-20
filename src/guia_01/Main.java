package guia_01;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import javax.swing.filechooser.FileSystemView;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {


    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int selected;

        do {
            selected = menu();
            switch(selected) {
                case 1:
                    Rectangulo rectangulo = new Rectangulo();
                    System.out.println("Ancho: " + rectangulo.getAncho());
                    System.out.println("Alto: " + rectangulo.getAlto());
                    System.out.println("Area: " + rectangulo.calcularArea());
                    System.out.println("Perimetro: " + rectangulo.calcularPerimetro());
                    rectangulo.setAncho(100);
                    rectangulo.setAlto(50);
                    System.out.println("Area: " + rectangulo.calcularArea());
                    System.out.println("Perimetro: " + rectangulo.calcularPerimetro());
                    Pausa.pausar();
                    limpiarPantalla();
                    break;
                case 2:
                    Empleado empleado1 = new Empleado();
                    Empleado empleado2 = new Empleado();
                    empleado1.setDni(23456345);
                    empleado1.setNombre("Carlos");
                    empleado1.setApellido("Gutiérrez");
                    empleado1.setSalario(25000);
                    empleado1.aumentaSalario(15);

                    System.out.println("----------------------------------------------------------------------------------");
                    System.out.println("| Empleado |" + empleado1.muestraEmpleado());
                    System.out.println("----------------------------------------------------------------------------------");

                    System.out.println("Salario Anual del Empleado:  "+ empleado1.getNombre() + " " + empleado1.getApellido() +" $" + empleado1.calcSalarioAnual());

                    empleado2.setDni(34234123);
                    empleado2.setNombre("Ana");
                    empleado2.setApellido("Sánchez");
                    empleado2.setSalario(27500);
                    System.out.println("---------------------------------------------------------------------------");
                    System.out.println("| Empleado | " + empleado2.muestraEmpleado());
                    System.out.println("---------------------------------------------------------------------------");

                    Pausa.pausar();
                    limpiarPantalla();
                    break;
                case 3:
                    System.out.println("Compras: ");
                    Venta venta1 = new Venta(1,"Leche de Almendra",3,20);
                    Venta venta2 = new Venta(2,"Nesquick",2,43);
                    System.out.println("" + venta1.muestraCompra());
                    System.out.println("" + venta2.muestraCompra());

                    Pausa.pausar();
                    limpiarPantalla();
                    break;
                case 4:
                    Cuenta cuenta = new Cuenta(1,"Pepe grillo",15000);
                    System.out.println("" + cuenta.muestraCuenta());
                    cuenta.deposito(2500);
                    System.out.println("Se realiza un Deposito por $2500" + " Nuevo Saldo: " + cuenta.getBalance());
                    cuenta.deposito(1500);
                    System.out.println("Se realiza un Deposito por $1500" + " Nuevo Saldo: " +cuenta.getBalance());
                    System.out.println("Se quiere realiza una compra por $30000");
                    cuenta.debito(30000);

                    Pausa.pausar();
                    limpiarPantalla();
                    break;
                case 5:
                    Hora hora = new Hora(13,04,22);
                    System.out.println("Hora-->" + hora.imprimirHora());
                    hora.avanzaSegundo();
                    System.out.println("Hora-->" + hora.imprimirHora());
                    hora.retrocedeSegundo();
                    System.out.println("Hora-->" + hora.imprimirHora());
                    Pausa.pausar();
                    limpiarPantalla();
                    break;


                case 0:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    limpiarPantalla();
                    System.out.println("¡¡¡Ejercicio Inexistente.!!!");
                    Pausa.pausar();
                    limpiarPantalla();
                    break;
            }
        }while(selected !=0);
    }


    public static int menu() { // Menu
        System.out.println("\n\t____________________________________________________________________");
        System.out.println("\n");
        System.out.println("\t    GUIA 00: INTRODUCCION A JAVA.");
        System.out.println("\n\t____________________________________________________________________");
        System.out.println("\n");
        System.out.println("\t    MENU");
        System.out.println("\n\t____________________________________________________________________");
        System.out.println("\n");
        System.out.println("\t   [1].Ejercicio 01.");
        System.out.println("\t   [2].Ejercicio 02.");
        System.out.println("\t   [3].Ejercicio 03.");
        System.out.println("\t   [4].Ejercicio 04.");
        System.out.println("\t   [5].Ejercicio 05.");

        System.out.println("\n\t____________________________________________________________________");
        System.out.println("\n");
        System.out.println("\t   [0].Salir del programa.");
        System.out.println("\n\t____________________________________________________________________");
        System.out.println("\n\n\t  Elija una opcion: ");
        System.out.println("\n");
        int input = scan.nextInt();
        return input;
    }


    public static void limpiarPantalla() {         // se dejan 60 espacios creando una especie de cls de la consola
        for(int i=0;i<2;i++) {
            System.out.println("\n");
        }
    }


    public static class Pausa {
        public static void pausar() {
            System.out.println("\n");
            System.out.println(" ----------------------------------------");
            System.out.println("|Presionar la tecla ENTER para continuar.|");
            System.out.println(" ----------------------------------------");
            Scanner aceptar = new Scanner(System.in);
            System.out.println("\n");
            aceptar.nextLine(); // queda esperando que precionemos la tecla enter para continuar
        }
    }
}