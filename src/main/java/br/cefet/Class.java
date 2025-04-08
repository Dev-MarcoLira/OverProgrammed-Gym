package br.cefet;

public class Class {
 
    private String descricao;

    public Class(
        String descricao
    ){
        setDescricao(descricao);
    }

    public void createClass(String descricao, Trainer trainer){
        this.descricao = descricao;
        trainer.addClass(this);
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
