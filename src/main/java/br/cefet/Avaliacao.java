package br.cefet;

import br.cefet.enums.ETipoAvaliacao;

public class Avaliacao {
    
    private Aluno aluno;
    private Treinador avaliador;
    private String data;
    private String hora;
    private ETipoAvaliacao tipo;

    public Avaliacao(
        Aluno aluno,
        Treinador avaliador,
        String data,
        String hora,
        ETipoAvaliacao tipo
    ){
        setAluno(aluno);
        setAvaliador(avaliador);
        setData(data);
        setHora(hora);
        setTipo(tipo);
    }

    public Aluno getAluno() {
        return this.aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Treinador getAvaliador() {
        return this.avaliador;
    }

    public void setAvaliador(Treinador avaliador) {
        this.avaliador = avaliador;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return this.hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public ETipoAvaliacao getTipo() {
        return this.tipo;
    }

    public void setTipo(ETipoAvaliacao tipo) {
        this.tipo = tipo;
    }


    

}
