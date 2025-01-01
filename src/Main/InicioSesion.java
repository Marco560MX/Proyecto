package Main;

import java.util.Scanner;

public class InicioSesion {
    protected String usuario1 = "MarcoLeal";
    protected String contracena1 = "Marco2803..";
    protected String usuario2 = "Antonio";
    protected String contracena3 = "Antonio123..";
    protected String administrador = "Admin";
    protected String contracena2 = "Admin123.";
    protected String comparador;
    protected String comparador2;
    protected String comparador3;
    protected String comparador4;
    protected int menu1;
    Scanner menu = new Scanner(System.in);
    Preguntas pregunta = new Preguntas();

    public InicioSesion() {
        super();
    }

    public String getComparador() {
        System.out.println("\n!Seleccione la materia a su preferencia!");
        System.out.println("\n(1) Matematicas (2) Tecnologia (3) Programacion java (4) Redes (5) Base de datos (6) Sistemas Operativos (7) Salir");
        menu1 = menu.nextInt();
        pregunta.setMenu(menu1);
        return comparador;
    }

    public void setComparador(String comparador, String comparador2) {
        this.comparador = comparador;
        this.comparador2 = comparador2;
        if (comparador.equals(usuario1) && comparador2.equals(contracena1)) {
            getComparador();
        } else if (comparador.equals(usuario2) && comparador2.equals(contracena3)) {
            getComparador();
        } else {
            System.out.println("\n!Usuario o Contraceña son incorrectos!");
        }

    }

    public String getAdministrador() {
        System.out.println("\n!Seleccione la materia a su preferencia!");
        System.out.println("\n(1) Matematicas (2) Tecnologia (3) Programacion java (4) Redes (5) Base de datos (6) Sistemas Operativos (7) Salir");
        menu1 = menu.nextInt();
        pregunta.setMenu(menu1);
        return administrador;
    }

    public void setAdministrador(String comparador3, String comparador4) {
        this.comparador3 = comparador3;
        this.comparador4 = comparador4;
        if (comparador3.equals(administrador) && comparador4.equals(contracena2)) {
            getAdministrador();
        } else {
            System.out.println("\n!Usuario o Contraceña son incorrectos!");
        }

    }


}
