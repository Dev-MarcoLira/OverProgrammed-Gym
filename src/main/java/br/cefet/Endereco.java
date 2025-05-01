package br.cefet;

public class Endereco {
    
    
    private int num;
    private String rua;
    private String bairro;
    private String cidade;
    
    public Endereco(
        int num,
        String rua,
        String bairro,
        String cidade
    ){
        setNum(num);
        setRua(rua);
        setCidade(cidade);
        setBairro(bairro);
    }

	public int getNum() {
		return this.num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getRua() {
		return this.rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return this.bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return this.cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

}