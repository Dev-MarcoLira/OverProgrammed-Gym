package br.cefet;

public class Assinatura {
    
    private Aluno aluno;
    private Plano plano;
    private String dataInicio;
    private String dataFim;
    
    public Assinatura(
        Aluno aluno,
        Plano plano,
        String dataInicio,
        String dataFim
    ){
        setAluno(aluno);
        setPlano(plano);
        setDataInicio(dataInicio);
        setDataFim(dataFim);
    }

    public Aluno getAluno() {
        return this.aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Plano getPlano() {
        return this.plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }

    public String getDataInicio() {
        return this.dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return this.dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }
}
