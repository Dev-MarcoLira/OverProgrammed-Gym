package br.cefet;

public class Member extends Person {
 
    private int matricula;

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

    private Appointment scheduled;

    public Appointment scheduleClass(int classId, int memberId){
        scheduled = new Appointment();
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