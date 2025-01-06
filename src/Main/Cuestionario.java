package Main;

import java.util.Scanner;

public class Cuestionario {
    public static void main(String[] args) {
        String dato1;
        String dato2;
        InicioSesion inicio = new InicioSesion();
        Scanner ingreso = new Scanner(System.in);

        System.out.println("!Bienvenid@ al cuestionario!");
        System.out.println("\nVersion: Alpha 6.0.0");
        System.out.println("\n!Para Continuar Es Necesario Iniciar Sesion!");
        System.out.println("\n¿Iniciar sesion con?");
        System.out.println("\n(1) Usuario (2) Administrador");
        switch (ingreso.nextInt()) {
            case 1:
                System.out.println("\nIngrese su usuario");
                dato1 = ingreso.next();
                System.out.println("\nIngrese su contraceña");
                dato2 = ingreso.next();
                inicio.setComparador(dato1, dato2);
                break;

            case 2:
                System.out.println("\nIngrese su usuario");
                dato1 = ingreso.next();
                System.out.println("\nIngrese su contraceña");
                dato2 = ingreso.next();
                inicio.setAdministrador(dato1, dato2);
                break;

            default:
                System.out.println("!Error, numero incorrecto!");
                break;
        }


    }
}