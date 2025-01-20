package Main;

import javax.swing.*;
import java.util.Scanner;

public class Cuestionario {
    public static void main(String[] args) {
        String dato1;
        String dato2;
        int userSelect;
        InicioSesion inicio = new InicioSesion();
        Scanner ingreso = new Scanner(System.in);

        JOptionPane.showMessageDialog(null, "!Bienvenid@ al cuestionario");
        JOptionPane.showMessageDialog(null,"Version: Alpha 6.0.14");
        JOptionPane.showMessageDialog(null, "!Para continuar es necesario iniciar sesion!");
        JOptionPane.showMessageDialog(null, "¿Iniciar sesion con?");
        userSelect = Integer.parseInt(JOptionPane.showInputDialog("(1) Usuario (2) Administrador"));
        switch (userSelect) {
            case 1:
                dato1 = JOptionPane.showInputDialog("Ingrese su usuario");
                dato2 = JOptionPane.showInputDialog("Ingrese su contraseña");
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