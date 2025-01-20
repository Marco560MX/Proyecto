package Main;

import javax.swing.*;

public class Cuestionario {
    public static void main(String[] args) {
        String dato1;
        String dato2;
        int userSelect;
        InicioSesion inicio = new InicioSesion();

        JOptionPane.showMessageDialog(null, "!Bienvenid@ al cuestionario");
        JOptionPane.showMessageDialog(null,"Version: Alpha 6.0.16");
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
                dato1 = JOptionPane.showInputDialog("Ingrese su usuario");
                dato2 = JOptionPane.showInputDialog("Ingrese su contraseña");
                inicio.setAdministrador(dato1, dato2);
                break;

            default:
                JOptionPane.showMessageDialog(null,"!Error, numero incorrecto!");
                break;
        }


    }
}