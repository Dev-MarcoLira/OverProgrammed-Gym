package br.cefet;

import java.util.LinkedList;

import br.cefet.enums.EGenero;

public class Funcionario extends Person {

    private String turno;
    private String cargo;
    private float salario;
    private int seguridade;
    private int ctps;

    public Funcionario(){}

    public Funcionario(
        String nome,
        String cargo,
        float salario
    ){
        setNome(nome);
        setCargo(cargo);
        setSalario(salario);
    }

    public Funcionario(
        String nome,
        String turno,
        String cargo,
        String matricula,
        float salario
    ){
        super();
        setNome(nome);
        setTurno(turno);
        setCargo(cargo);
        setMatricula(matricula);
        setSalario(salario);
    }

    public Funcionario(
        String nome,
        LinkedList<Contato> contatos,
        LinkedList<Documento> documentos,
        EGenero genero
    ){
        super(nome, contatos, documentos, genero);
    }

    public Funcionario(
        String nome,
        LinkedList<Documento> documentos, 
        String dtNascimento, 
        Endereco endereco, 
        LinkedList<Contato> contatos, 
        EGenero genero, 
        String matricula,
        int seguridade,
        int ctps,
        String turno,
        String cargo,
        float salario
    ) {
        super(nome, documentos, dtNascimento, endereco, contatos, genero, matricula);

        setSeguridade(seguridade);        
        setCargo(cargo);
        setSalario(salario);
        setCtps(ctps);
        setTurno(turno);
    }

    public int getSeguridade() {
        return this.seguridade;
    }

    public void setSeguridade(int seguridade) {
        this.seguridade = seguridade;
    }

    public int getCtps() {
        return this.ctps;
    }

    public void setCtps(int ctps) {
        this.ctps = ctps;
    }

    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }   

}