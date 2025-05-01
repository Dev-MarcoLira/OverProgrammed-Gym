package br.cefet.enums;

public enum ETipoAvaliacao {
    
    PESO("Peso"),
    MEDIDA("Medida"),
    MEDIDA_PESO("Medida e Peso"),
    MEDIDA_PORCENTAGEM("Medida e Porcentagem"),
    PORCENTAGEM("Porcentagem");

    private String descricao;

    ETipoAvaliacao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
