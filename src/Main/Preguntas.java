package Main;

import java.util.Scanner;

public class Preguntas {
    int menu;
    Scanner tecnologia1 = new Scanner(System.in);
    Tecnologia tecnologia = new Tecnologia();

    public Preguntas() {
        super();
    }

    public int getMenu() {
        System.out.println("\n!saliendo!");
        return menu;
    }

    public void setMenu(int menu) {
        this.menu = menu;
        switch (menu) {
            case 1:
                System.out.println("\n!En Construccion");
                break;

            case 2:
                System.out.println("Seleccione la dificultad");
                System.out.println("\n(1) Facil (2) Intermedio (3) Dificil (4) ExtraDificil");
                tecnologia.setTecnologia(tecnologia1.nextInt());
                break;

            case 3:
                System.out.println("\n!En Construccion");
                break;

            case 4:
                System.out.println("\n!En Construccion");
                break;

            case 5:
                System.out.println("\n!En Construccion");
                break;

            case 6:
                System.out.println("\n!En Construccion");
                break;

            case 7:
                getMenu();
                break;

            default:
                System.out.println("!Error, numero incorrecto!");
                break;
        }
    }


}
