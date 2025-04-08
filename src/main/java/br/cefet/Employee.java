package br.cefet;

public class Employee extends Person {

    private String ctps;
    private float salario;
    private String cargo;
    private int seguridade;

    public Employee(
        String nome,
        String cpf,
        String dtNascimento,
        String telefone,
        String ctps,
        float salario,
        int seguridade,
        String cargo
    ){
        super(nome, cpf, dtNascimento, telefone);

        setCtps(ctps);
        setSalario(salario);
        setSeguridade(seguridade);
        setCargo(cargo);
    }

    public String getCtps() {
        return this.ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public float getSalario() {
        return this.salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getSeguridade() {
        return this.seguridade;
    }

    public void setSeguridade(int seguridade) {
        this.seguridade = seguridade;
    }

}
