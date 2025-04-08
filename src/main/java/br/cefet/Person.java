package br.cefet;

public class Person {
    private String dtNascimento;
    private String telefone;
    private String eMail;
    private String endereco;
    private String cpf;
    private String nome;

    private char genero;
    private int matricula;
    private float peso;
    private float altura;

    public Person(String nome, String cpf, String dtNascimento, String telefone){
        setNome(nome);
        setCpf(cpf);
        setDtNascimento(dtNascimento);
        setTelefone(telefone);
    }

    // Precisa validar o Telefone de Member e Trainer

    public void validatePhone(){

    }

    // Precisa validar o CPF de Member e Trainer
    public boolean validateCpf(){
        return false;
    }

    // Precisa validar a data de nascimento
    public boolean validateDate(String data){
        return true;
    }

    public String getDtNascimento() {
        return this.dtNascimento;
    }

    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEMail() {
        return this.eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getGenero() {
        return this.genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    



}