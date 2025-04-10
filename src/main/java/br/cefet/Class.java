package br.cefet;

public class Class {
 
    private String descricao;

    public Class(
        String descricao
    ){
        setDescricao(descricao);
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
