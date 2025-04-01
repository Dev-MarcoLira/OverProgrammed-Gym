package br.cefet;

import java.util.Stack;

public class Main {
    
    public static Stack<Class> classes = new Stack<Class>();
    public static Stack<Assignment> scheduledClasses = new Stack<Assignment>();

    public static void main(String[] args) {

        Trainer trainer = getTrainer();
        Member member = getMember();

        String descricao = "Aula de hit box";

        Class createdClass = trainer.criarAula(descricao);

        classes.add(createdClass);

        System.out.println("Aula criada: " + classes.get(0).getId());

        Assignment scheduled = member.scheduleClass(
            createdClass.getId(), 
            member.getId()
        );

        scheduledClasses.add(scheduled);

        System.out.println("Aula agendada: " + scheduledClasses.get(0).getId());


    }

    private static Trainer getTrainer(){
        Trainer trainer = new Trainer(
            "Pantoja",
            "12345678909",
            "21/01/2001",
            "21980999999"
        );
        return trainer;
    }

    private static Member getMember(){
        Member member = new Member(
            "Mrc",
            "12345678909",
            "21/01/1991",
            "219809999999"
        );

        return member;
    }
    

    
}