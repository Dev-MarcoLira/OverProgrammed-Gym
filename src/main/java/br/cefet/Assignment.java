package br.cefet;

import java.util.Random;

public class Assignment {
    
    private String dataAgendada;
    private int id;
    private int memberId;
    private int classId;

    public Assignment(){
        Random random = new Random();
        int rand = random.nextInt(1000000) + 1;
        this.id = rand;
    }

    public void agendarAula(int memberId, int classId){
        if(memberId != 0 || classId != 0){
            this.memberId = memberId;
            this.classId = classId;
        }else{
            System.out.println("Não foi possível agendar a aula!");
        }
    }

    public String getDataAgendada() {
        return this.dataAgendada;
    }

    public void setDataAgendada(String dataAgendada) {
        this.dataAgendada = dataAgendada;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMemberId() {
        return this.memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public int getClassId() {
        return this.classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }


}
