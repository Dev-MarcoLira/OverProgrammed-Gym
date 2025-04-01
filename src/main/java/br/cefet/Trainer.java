package br.cefet;

public class Trainer extends Person{
    
    public Trainer(
        String nome, 
        String cpf, 
        String dtNascimento, 
        String telefone
    ) {
            super(nome, cpf, dtNascimento, telefone);
    }
    
        private String ctps;
    private String salario;
    private Class createdClass;

    public Class criarAula(String descricao){

        this.createdClass = new Class();
        this.createdClass.criarAula(descricao, this.getId());
        
        return this.createdClass;
    }

    public String getCtps() {
        return this.ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public String getSalario() {
        return this.salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public Class getCreatedClass() {
        return this.createdClass;
    }

    public void setCreatedClass(Class createdClass) {
        this.createdClass = createdClass;
    }


}