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
            case 5, 4, 3, 2, 1:
                System.out.println("!Reprobado!");
                break;
            default:
                System.out.println("!Reprobrado!");
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