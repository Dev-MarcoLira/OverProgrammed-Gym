package br.cefet;

public class Plano {
    private String nome;
    private float valor;
    private String formaDePgto;
    private String dtDeVenci;

    public Plano(
        String nome
    ){
        setNome(nome);
    }

    public Plano(
            String nome,
            float valor,
            String formaDePgto,
            String dtDeVenci
    ){
        setNome(nome);
        setValor(valor);
        setFormaDePgto(formaDePgto);
        setDtDeVenci(dtDeVenci);
    }

    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    public String getFormaDePgto() {
        return formaDePgto;
    }
    public void setFormaDePgto(String formaDePgto) {
        this.formaDePgto = formaDePgto;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDtDeVenci() {
        return dtDeVenci;
    }
    public void setDtDeVenci(String dtDeVenci) {
        this.dtDeVenci = dtDeVenci;
    }
    
    
}
