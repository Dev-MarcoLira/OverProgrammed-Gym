package br.cefet;

import java.util.Stack;

public class Main {
    
    public static Stack<Class> classes = new Stack<Class>();
    public static Stack<Appointment> scheduledClasses = new Stack<Appointment>();

    public static void main(String[] args) {

        Trainer trainer = getTrainer();
        Member member = getMember();

        String descricao = "Aula de hit box";

        


    }

    private static Trainer getTrainer(){
        Trainer trainer = new Trainer(
            "Pantoja",
            "12345678909",
            "21/01/2001",
            "21980999999",
            "123456",
            10000,
            123,
            "Treinador jr"
        );
        return trainer;
    }

    private static Member getMember(){
        Member member = new Member(
            "Mrc",
            "12345678909",
            "21/01/1991",
            "219809999999",
            123456
        );

        return member;
    }
    

    
}