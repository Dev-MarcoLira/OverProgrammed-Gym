package br.cefet;

import br.cefet.enums.ETipoDocumentoPerson;

public class Documento {
    
    private ETipoDocumentoPerson tipoDocumento;
    private String documento;
    private String dataEmissao;
    private String dataValidade;
    private String orgaoEmissor;
    private String ufEmissor;

    public Documento(
        ETipoDocumentoPerson tipoDocumento,
        String documento
    ){
        setTipoDocumento(tipoDocumento);
        setDocumento(documento);
    }

    public Documento(
        ETipoDocumentoPerson tipoDocumento,
        String documento,
        String dataEmissao,
        String dataValidade,
        String orgaoEmissor,
        String ufEmissor
    ){
        setTipoDocumento(tipoDocumento);
        setDocumento(documento);
        setDataEmissao(dataEmissao);
        setDataValidade(dataValidade);
        setOrgaoEmissor(orgaoEmissor);
        setUfEmissor(ufEmissor);
    }

    public ETipoDocumentoPerson getTipoDocumento() {
        return this.tipoDocumento;
    }

    public void setTipoDocumento(ETipoDocumentoPerson tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getDocumento() {
        return this.documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getDataEmissao() {
        return this.dataEmissao;
    }

    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getDataValidade() {
        return this.dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getOrgaoEmissor() {
        return this.orgaoEmissor;
    }

    public void setOrgaoEmissor(String orgaoEmissor) {
        this.orgaoEmissor = orgaoEmissor;
    }

    public String getUfEmissor() {
        return this.ufEmissor;
    }

    public void setUfEmissor(String ufEmissor) {
        this.ufEmissor = ufEmissor;
    }


}
