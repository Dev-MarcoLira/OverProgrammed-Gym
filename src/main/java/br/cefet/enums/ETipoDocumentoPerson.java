package br.cefet.enums;

public enum ETipoDocumentoPerson {
    
    CPF("CPF"),
    RG("RG"),
    CNH("CNH"),
    PASSAPORTE("Passaporte"),
    CARTEIRA_TRABALHO("Carteira de Trabalho"),
    OUTRO("Outro");

    private String descricao;

    
    ETipoDocumentoPerson(
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
