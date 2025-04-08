package br.cefet;

import java.util.ArrayList;

public class GymSystem {
 
    private ArrayList<Member> members;
    private ArrayList<Trainer> trainers;

    public GymSystem() {
        members = new ArrayList<Member>();
        trainers = new ArrayList<Trainer>();
    }

    public void addMember(Member member){
        members.add(member);
    }

    public ArrayList<Member> getMembers(){
        return members;
    }

    
    public void addTrainer(Trainer trainer){
        trainers.add(trainer);
    }

    public ArrayList<Trainer> getTrainers(){
        return trainers;
    }

}
