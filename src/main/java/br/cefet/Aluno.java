package br.cefet;

import java.util.LinkedList;

import br.cefet.enums.EGenero;

public class Aluno extends Person{

    private Plano plano;  

    public Aluno(){}

    public Aluno(
        String nome,
        String dtNascimento,
        Plano plano
    ){
        setNome(nome);
        setDtNascimento(dtNascimento);
        setPlano(plano);
    }

    public Aluno(
        String nome,
        LinkedList<Contato> contatos,
        LinkedList<Documento> documentos,
        EGenero genero
    ){
        super(nome, contatos, documentos, genero);
    }

    public Aluno(
        String nome,
        LinkedList<Documento> documentos, 
        String dtNascimento, 
        Endereco endereco, 
        LinkedList<Contato> contatos, 
        EGenero genero,
        String matricula
    ) {
        super(nome, documentos, dtNascimento, endereco, contatos, genero, matricula);    
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }
          
}
