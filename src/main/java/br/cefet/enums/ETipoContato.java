package br.cefet.enums;

public enum ETipoContato {
    
    TELEFONE("Telefone"),
    CELULAR("Celular"),
    EMAIL("Email"),
    WHATSAPP("WhatsApp"),
    FACEBOOK("Facebook"),
    INSTAGRAM("Instagram"),
    TWITTER("Twitter"),
    LINKEDIN("LinkedIn"),
    OUTRO("Outro");

    private String descricao;

    ETipoContato(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}