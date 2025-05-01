package br.cefet;

import java.util.LinkedList;
import java.util.Scanner;

import br.cefet.enums.EGenero;
import br.cefet.enums.ETipoContato;
import br.cefet.enums.ETipoDocumentoPerson;

public class Academia {

    private static Scanner sc = new Scanner(System.in);

    private LinkedList<Aluno> alunos = new LinkedList<Aluno>();
    private LinkedList<Funcionario> funcionarios = new LinkedList<Funcionario>();
    private LinkedList<Treinador> treinadores = new LinkedList<Treinador>();

    public void exibirMenu(){
        System.out.println("---------- Escolha uma opcao ----------");
        System.out.println("1 - Cadastrar Funcionario");
        System.out.println("2 - Cadastrar Alunos");
    }

    public void cadastroFuncionario(){
        System.out.print("\nDigite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("\nDigite seu cargo: ");
        String cargo = sc.nextLine();

        System.out.print("\nDigite o salario do funcionario: ");
        float salario = sc.nextFloat();
        sc.nextLine();

        System.out.print("\nDigite o turno que o funcionario trabalha: ");
        String turno = sc.nextLine(); 

        System.out.print("\nDigite a matricula do funcionario: ");
        String matricula = sc.nextLine();

        Funcionario funcionario = new Funcionario(nome, turno, cargo, matricula, salario);
        addFuncionario(funcionario);

        System.out.println("Funcionario cadastrado com sucesso!!");
    }

    public void cadastroALuno(){
        System.out.print("Digite o nome do aluno: ");
        String nome = sc.nextLine();

        System.out.print("\nDigite o CPF do aluno: ");
        String cpf = sc.nextLine();

        LinkedList<Documento> documentos = new LinkedList<>();
        Documento documento = new Documento(ETipoDocumentoPerson.CPF, cpf);

        documentos.add(documento);

        System.out.println("\nDigite o número de telefone para contato: ");
        String telefone = sc.nextLine();

        LinkedList<Contato> contatos = new LinkedList<>();
        Contato contato = new Contato(ETipoContato.TELEFONE, telefone);

        contatos.add(contato);

        System.out.print("\nDigite a data de nascimento do aluno: ");
        String dtNascimento = sc.nextLine();

        EGenero genero;
        System.out.print("\nDigite o gênero do aluno: ");

        genero = switch (sc.next().charAt(0)) {
            case 'M' -> EGenero.MASCULINO;
            case 'F' -> EGenero.FEMININO;
            default -> EGenero.OUTRO;
        };

        Aluno aluno = new Aluno(nome, contatos, documentos, genero);
        addAluno(aluno);

        System.out.println("Aluno criado!");
    }

    public LinkedList<Aluno> getAlunos() {
        return this.alunos;
    }

    public void addAluno(Aluno aluno) {
        getAlunos().add(aluno);
    }

    public LinkedList<Funcionario> getFuncionarios() {
        return this.funcionarios;
    }

    public void addFuncionario(Funcionario funcionario) {
        getFuncionarios().add(funcionario);
    }

    public LinkedList<Treinador> getTreinadores() {
        return this.treinadores;
    }

    public void addTreinador(Treinador treinador) {
        getTreinadores().add(treinador);
    }

}
