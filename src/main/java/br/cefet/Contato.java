package br.cefet;

import br.cefet.enums.ETipoContato;

public class Contato {
    
    private ETipoContato tipoContato;
    private String contato;
    private String descricao;

    public Contato(
        ETipoContato tipoContato,
        String contato
    ){
        setTipoContato(tipoContato);
        setContato(contato);
    }

    public Contato(
        ETipoContato tipoContato,
        String contato,
        String descricao
    ){
        setTipoContato(tipoContato);
        setContato(contato);
        setDescricao(descricao);
    }

    public ETipoContato getTipoContato() {
        return this.tipoContato;
    }

    public void setTipoContato(ETipoContato tipoContato) {
        this.tipoContato = tipoContato;
    }

    public String getContato() {
        return this.contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}