package integration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import br.cefet.Academia;
import br.cefet.Aluno;
import br.cefet.Contato;
import br.cefet.Documento;
import br.cefet.enums.ETipoContato;
import br.cefet.enums.ETipoDocumentoPerson;

public class AlunoTest {
    
    @Test
    void testBasicAttributes() {
        String expectedCPf = "12345678909";
        String expectedEmail = "mock123@gmail.com";
        String expectedNome = "Mock Nome";

        Aluno aluno = new Aluno();

        aluno.setNome(expectedNome);

        Documento documento = new Documento(ETipoDocumentoPerson.CPF, expectedCPf);
        Contato contato = new Contato(ETipoContato.EMAIL, expectedEmail);
        
        aluno.addDocumento(documento);

        // Passa no teste
        assertEquals(expectedCPf, aluno.getDocumentos().getFirst().getDocumento(), 
        "CPF should be " + expectedCPf);

        assertEquals(expectedNome, aluno.getNome(), 
        "Nome should be " + expectedNome);
        
        assertTrue(aluno.getDocumentos().contains(documento), "Documento should be added to the list");
        assertTrue(aluno.getContatos().contains(contato), "Contato should be added to the list");
    }    

    @Test
    void testIntegrationWithAcademia() {
        // Arrange
        Academia academia = new Academia();
        Aluno aluno = new Aluno();
        String expectedCPF = "98765432100";
        Documento documento = new Documento(ETipoDocumentoPerson.CPF, expectedCPF);

        // Act
        aluno.addDocumento(documento);
        academia.addAluno(aluno);

        // Assert
        assertTrue(academia.getAlunos().contains(aluno), "Academia should contain the added Aluno");
        assertEquals(expectedCPF, aluno.getDocumentos().getFirst(), "Aluno's CPF should match the expected value");
    }

}
