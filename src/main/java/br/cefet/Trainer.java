package br.cefet;

import java.util.ArrayList;

public class Trainer extends Employee{
    
    private ArrayList<Class> gymClasses;

    public Trainer(
        String nome, 
        String cpf, 
        String dtNascimento, 
        String telefone,
        String ctps,
        float salario,
        int seguridade,
        String cargo
    ) {
        super(
            nome, 
            cpf, 
            dtNascimento, 
            telefone, 
            ctps, 
            salario,
            seguridade,
            cargo
        );

        gymClasses = new ArrayList<>(gymClasses);
    }

    public void addClass(Class gymclass){
        this.gymClasses.add(gymclass);
    }
    
    public ArrayList<Class> getClasses(){
        return this.gymClasses;
    }

}