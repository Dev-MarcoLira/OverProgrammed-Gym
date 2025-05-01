package br.cefet;

import java.util.LinkedList;

import br.cefet.enums.EGenero;

public class Treinador extends Funcionario{

    public Treinador(){}

    public Treinador(
        String nome,
        String cargo,
        float salario
    ){
        super(nome, cargo, salario);
    }

    public Treinador(
        String nome,
        LinkedList<Contato> contatos,
        LinkedList<Documento> documentos,
        EGenero genero
    ){
        super(nome, contatos, documentos, genero);
    }

    public Treinador(
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
    ){
        super(nome, documentos, dtNascimento, endereco, contatos, genero, matricula, seguridade, ctps, turno, cargo, salario);   
    }
    
    
}
