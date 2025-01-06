package Main;

public class Metodos {
    int preguntas = 0;
    int calificacion = 0;
    public Metodos(){
        super();
    }

    public int getPreguntas(){
        if(calificacion  <= 10){
            System.out.println("\nAprobado");
        }else if(calificacion <= 5){
            System.out.println("\nReprobado");
        }
        return preguntas;
    }

    public void setPreguntas(int preguntas){
        this.preguntas = preguntas;
        if(preguntas == 1){
            calificacion++;
        }
    }



}