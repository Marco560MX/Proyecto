package Main;

public class Metodos {
    int preguntas = 0;
    int calificacion = 0;
    public Metodos(){
        super();
    }

    public int getPreguntas(){
        switch(calificacion){
            case 10, 9, 8, 7, 6:
                System.out.println("!Aprobado!");
                break;
            default:
                System.out.println("!Reprobado!");
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