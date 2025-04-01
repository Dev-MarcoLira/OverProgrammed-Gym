package br.cefet;

import java.util.Random;

public class Class {
 
    private String descricao;
    private int id;
    private int trainerId;

    public Class(){
        Random random = new Random();
        int rand = random.nextInt(1000000) + 1;
        this.id = rand;
    }

    public void criarAula(String descricao, int trainerId){
        this.descricao = descricao;
        if(trainerId != 0){
            this.trainerId = trainerId;
        }else{
            System.out.println("Não foi possível criar a aula");
        }
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTrainerId() {
        return this.trainerId;
    }

    public void setTrainerId(int trainerId) {
        this.trainerId = trainerId;
    }

}
