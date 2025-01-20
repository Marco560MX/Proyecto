package Main;

import javax.swing.*;

public class Preguntas {
    int menu;
    int dificultad;
    Tecnologia tecnologia = new Tecnologia();

    public Preguntas() {
        super();
    }

    public int getMenu() {
        JOptionPane.showMessageDialog(null, "!Saliendo!");
        return menu;
    }

    public void setMenu(int menu) {
        this.menu = menu;
        switch (menu) {
            case 1:
                JOptionPane.showMessageDialog(null, "!En Construccion!");
                break;

            case 2:
                JOptionPane.showMessageDialog(null, "Seleccione la dificultad");
                dificultad = Integer.parseInt(JOptionPane.showInputDialog("(1) Facil (2) Intermedio (3) Dificil (4) ExtraDificil"));
                tecnologia.setTecnologia(dificultad);
                break;

            case 3:
                JOptionPane.showMessageDialog(null, "!En Construccion!");
                break;

            case 4:
                JOptionPane.showMessageDialog(null, "!En Construccion!");
                break;

            case 5:
                JOptionPane.showMessageDialog(null, "!En Construccion!");
                break;

            case 6:
                JOptionPane.showMessageDialog(null, "!En Construccion!");
                break;

            case 7:
                getMenu();
                break;

            default:
                JOptionPane.showMessageDialog(null, "!Error, numero incorrecto!");
                break;
        }
    }


}
