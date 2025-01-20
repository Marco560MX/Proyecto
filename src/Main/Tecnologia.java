package Main;

import javax.swing.*;
import java.util.Scanner;

public class Tecnologia {
    int tecnologia;
    Scanner respuesta = new Scanner(System.in);
    Metodos metodo = new Metodos();

    public Tecnologia() {
        super();
    }

    public int getTecnologia() {
        System.out.println("\n¿El raton o mouse y teclado que se les considera en tecnologia?");
        System.out.println("\n(1) Periferico (2) Controlador (3) Control Externo");
        if (respuesta.nextInt() == 1) {
            System.out.println("\n!Respuesta Correcta!");
            metodo.setPreguntas(1);
        } else {
            System.out.println("\n!Respuesta Incorrecta!");
            metodo.setPreguntas(0);
        }
        System.out.println("\n¿Cuales son los sistemas operativos mas famosos en computadora?");
        System.out.println("\n(1) Windows, Linux, MacOs (2)Android, IOS");
        if (respuesta.nextInt() == 1) {
            System.out.println("\n!Respuesta Correcta!");
            metodo.setPreguntas(1);
        } else {
            System.out.println("\n!Respuesta Incorrecta!");
            metodo.setPreguntas(0);
        }
        System.out.println("\nPara conectarse a una red por cable a un modem ¿Que Cable es necesario Utilizar?");
        System.out.println("\n(1) Coaxial (2) Ethernet (3) USB");
        if (respuesta.nextInt() == 2) {
            System.out.println("\n!Respuesta Correcta!");
            metodo.setPreguntas(1);
        } else {
            System.out.println("\n!Respuesta Incorrecta!");
            metodo.setPreguntas(0);
        }
        System.out.println("\n¿Los moviles o telefonos, por cual medio se llegan a conectar a una red de internet?");
        System.out.println("\n(1) Cable (2) Inalambricamente");
        if (respuesta.nextInt() == 2) {
            System.out.println("\n!Respuesta Correcta!");
            metodo.setPreguntas(1);
        } else {
            System.out.println("\n!Respuesta Incorrecta!");
            metodo.setPreguntas(0);
        }
        System.out.println("\nPara visualizar imagenes o videos en una computadora ¿Que es necesario?");
        System.out.println("\n(1) Monitor (2) Telefono (3) Teclado");
        if (respuesta.nextInt() == 1) {
            System.out.println("\n!Respuesta Correcta!");
            metodo.setPreguntas(1);
        } else {
            System.out.println("\n!Respuesta Incorrecta!");
            metodo.setPreguntas(0);
        }
        System.out.println("\nSi queremos conectar algun dispositivo inalambricamente como un control de juegos ¿Como se le conoce a esta tecnologia?");
        System.out.println("\n(1) Bluetooth (2) Internet (3) Cable (4) USB");
        if (respuesta.nextInt() == 1) {
            System.out.println("\n!Respuesta Correcta!");
            metodo.setPreguntas(1);
        } else {
            System.out.println("\n!Respuesta Incorrecta!");
            metodo.setPreguntas(0);
        }
        System.out.println("\nSi queremos conectar un cable a nuestro monitor para ver la imagen de nuestro computador ¿Que tipo de cables se podrian utilizar?");
        System.out.println("\n(1) RCA (2) Ethernet (3) HDMI, DisplayPort, DVi, VGA (4) Auxiliar");
        if (respuesta.nextInt() == 3) {
            System.out.println("\n!Respuesta Correcta!");
            metodo.setPreguntas(1);
        } else {
            System.out.println("\n!Respuesta Incorrecta!");
            metodo.setPreguntas(0);
        }
        System.out.println("\nEn los telefonos o moviles existe una red movil ¿Cual de estas es la correcta?");
        System.out.println("\n(1) Internet (2) Red Movil 2G, 3G, 4G, 5G (3) Wifi 6 (4) Bluetooth");
        if (respuesta.nextInt() == 2) {
            System.out.println("\n!Repuesta Correcta!");
            metodo.setPreguntas(1);
        } else {
            System.out.println("\n!Respuesta Incorrecta!");
            metodo.setPreguntas(0);
        }
        System.out.println("\nEn las redes de internet existen 2 redes con distintas frecuencias ¿Cual de las dos es mas rapida en velocidad internet?");
        System.out.println("\n(1) Red 2.4GHz (2) Red 5 GHz");
        if (respuesta.nextInt() == 2) {
            System.out.println("\n!Respuesta Correcta!");
            metodo.setPreguntas(1);
        } else {
            System.out.println("\n!Respuesta Incorrecta!");
            metodo.setPreguntas(0);
        }
        System.out.println("\nPara saber la ubicacion en un mapa digital ¿Que tecnologia se llega a utilizar?");
        System.out.println("\n(1) GPS (2) Google maps (3) internet");
        if (respuesta.nextInt() == 1) {
            System.out.println("\n!Respuesta Correcta!");
            metodo.setPreguntas(1);
        } else {
            System.out.println("\n!Respuesta Incorrecta!");
            metodo.setPreguntas(0);
        }
        metodo.getPreguntas();


        return tecnologia;
    }

    public int Tecnologia2() {
        JOptionPane.showMessageDialog(null, "!En Construccion!");
        return tecnologia;
    }

    public int Tecnologia3() {
        JOptionPane.showMessageDialog(null, "!En Construccion!");
        return tecnologia;
    }

    public int Tecnologia4() {
        JOptionPane.showMessageDialog(null, "!En Construccion!");
        return tecnologia;
    }


    public void setTecnologia(int tecnologia) {
        this.tecnologia = tecnologia;
        switch (tecnologia) {
            case 1:
                JOptionPane.showMessageDialog(null, "!Ingresando a dificultad facil!");
                getTecnologia();
                break;

            case 2:
                JOptionPane.showMessageDialog(null, "!Ingresando a dificultad intermedia!");
                Tecnologia2();
                break;

            case 3:
                JOptionPane.showMessageDialog(null, "!Ingresando a dificultad dificil!");
                Tecnologia3();
                break;

            case 4:
                JOptionPane.showMessageDialog(null, "!Ingresando a dificultad ExtraDificil!");
                Tecnologia4();
                break;

            default:
                JOptionPane.showMessageDialog(null, "!Error, numero incorrecto!");
                break;
        }
    }


}
