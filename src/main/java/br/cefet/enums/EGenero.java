package br.cefet.enums;

public enum EGenero {
 
    MASCULINO("Masculino"),
    FEMININO("Feminino"),
    OUTRO("Outro");

    private String descricao;

    EGenero(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}