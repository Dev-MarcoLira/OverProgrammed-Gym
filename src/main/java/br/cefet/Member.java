package br.cefet;

import java.util.ArrayList;

public class Member extends Person {
 
    private int matricula;
    private ArrayList<Appointment> scheduledClasses = new ArrayList<Appointment>();
    
    public Member(
        String nome, 
        String cpf, 
        String dtNascimento, 
        String telefone,
        int matricula
        ) {
            super(nome, cpf, dtNascimento, telefone);
            
            setMatricula(matricula);
        }
        

    public ArrayList<Appointment> getScheduledClasses() {
        return this.scheduledClasses;
    }

    public void addScheduledClass(Appointment scheduledClass) {
        this.scheduledClasses.add(scheduledClass);
    }

    public float getImc(){
        float peso = this.getPeso();
        float altura = this.getAltura();
        return (peso / (altura * altura));
    }

    public int getMatricula(){
        return this.matricula;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

}