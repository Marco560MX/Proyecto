package Main;

public class Metodos {
    int preguntas = 0;
    int calificacion = 0;
    public Metodos(){
        super();
    }

    public int getPreguntas(){
        if(calificacion <= 10){
            System.out.println("\n!Aprobado!");
        }else if(calificacion <= 5){
            System.out.println("\n!Reprobado!");
        }else{
            System.out.println("\n!Reprobado!");
        }
        return preguntas;
    }

    public void setPreguntas(int preguntas){
        this.preguntas = preguntas;
        if(preguntas == 1){
            calificacion++;
        }else{
            System.out.println("test!");
        }
    }



}