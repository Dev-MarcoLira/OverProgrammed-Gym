package br.cefet;

public class Member extends Person {
 
    public Member(
        String nome, 
        String cpf, 
        String dtNascimento, 
        String telefone
    ) {
        super(nome, cpf, dtNascimento, telefone);
    }
    
        private int matricula;

    private Assignment scheduled;

    public Assignment scheduleClass(int classId, int memberId){
        scheduled = new Assignment();
        scheduled.agendarAula(memberId, classId);

        return scheduled;
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