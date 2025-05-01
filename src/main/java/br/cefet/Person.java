package br.cefet;

import java.util.LinkedList;

import br.cefet.enums.EGenero;

public class Person {
 
    private String nome;
    private Endereco endereco;
    private String dtNascimento;
    private String matricula;
    
    private EGenero genero;
    private LinkedList<Documento> documentos = new LinkedList<>();
    private LinkedList<Contato> contatos;

    public Person(){this.contatos = new LinkedList<>();
}

    public Person(
        String nome,
        LinkedList<Contato> contatos,
        LinkedList<Documento> documentos,
        EGenero genero
    ){
        this.contatos = new LinkedList<>();
        setNome(nome);
        setContatos(contatos);
        setDocumentos(documentos);
        setGenero(genero);
    }
    
    public Person(
        String nome,
        LinkedList<Documento> documentos,
        String dtNascimento,
        Endereco endereco,
        LinkedList<Contato> contatos,
        EGenero genero,
        String matricula
        ){
        this.contatos = new LinkedList<>();
            setDocumentos(documentos);
            setNome(nome);
            setDtNascimento(dtNascimento);
            setEndereco(endereco);
            setContatos(contatos);
            setGenero(genero);
            setMatricula(matricula);
        }

    public String getMatricula() {
        return this.matricula;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public String getNome() {
        return this.nome;
    }

	public void setNome(String nome) {
		this.nome = nome;
	}

    public LinkedList<Documento> getDocumentos() {
        return this.documentos;
    }

    public void setDocumentos(LinkedList<Documento> documentos) {
        this.documentos = documentos;
    }

    public void addDocumento(Documento documento) {
        this.documentos.add(documento);
    }
    
    public void removeDocumento(Documento documento) {
        this.documentos.remove(documento);
    }

	public Endereco getEndereco() {
		return this.endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getDtNascimento() {
		return this.dtNascimento;
	}

	public void setDtNascimento(String dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	
    public LinkedList<Contato> getContatos() {
        return this.contatos;
    }

    public void setContatos(LinkedList<Contato> contatos) {
        this.contatos = contatos;
    }

    public void addContato(Contato contato) {
        this.contatos.add(contato);
    }
    
    public void removeContato(Contato contato) {
        this.contatos.remove(contato);
    }
    

	public EGenero getGenero() {
		return this.genero;
	}

	public void setGenero(EGenero genero) {
		this.genero = genero;
	}


}
