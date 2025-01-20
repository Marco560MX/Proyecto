package Main;

import javax.swing.*;

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
    protected int reset;
    protected int menu1;
    Preguntas pregunta = new Preguntas();

    public InicioSesion() {
        super();
    }

    public String getComparador() {
        JOptionPane.showMessageDialog(null, "!Seleccione la materia a su preferencia!");
        menu1 = Integer.parseInt(JOptionPane.showInputDialog("(1) Matematicas (2) Tecnologia (3) Programacion java (4) Redes (5) Base de datos (6) Sistemas Operativos (7) Salir"));
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
            JOptionPane.showMessageDialog(null, "!Usuario o Contraceña son incorrectos!");
            reset = 1;
        }
        if(reset == 1 && menu1 == 0){
            comparador = JOptionPane.showInputDialog("!Ingrese su usuario!");
            comparador2 = JOptionPane.showInputDialog("!Ingrese su contraseña!");
            setComparador(comparador, comparador2);
        }

    }

    public String getAdministrador() {
        JOptionPane.showMessageDialog(null, "!Seleccione la materia a su preferencia!");
        menu1 = Integer.parseInt(JOptionPane.showInputDialog("(1) Matematicas (2) Tecnologia (3) Programacion java (4) Redes (5) Base de datos (6) Sistemas Operativos (7) Salir"));
        pregunta.setMenu(menu1);
        return administrador;
    }

    public void setAdministrador(String comparador3, String comparador4) {
        this.comparador3 = comparador3;
        this.comparador4 = comparador4;
        if (comparador3.equals(administrador) && comparador4.equals(contracena2)) {
            getAdministrador();
        } else {
            JOptionPane.showMessageDialog(null, "!Usuario o Contraceña son incorrectos!");
            reset = 1;
        }
        if(reset == 1 && menu1 == 0){
            comparador3 = JOptionPane.showInputDialog("!Ingrese su usuario!");
            comparador4 = JOptionPane.showInputDialog("!Ingrese su contraseña!");
            setAdministrador(comparador3, comparador4);
        }

    }


}
