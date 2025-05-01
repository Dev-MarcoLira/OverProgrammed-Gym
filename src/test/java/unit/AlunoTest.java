package unit;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

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
    void testAddDocumento(){
        
        String expectedCPf = "12345678909";

        Aluno aluno = new Aluno();
        Documento documento = new Documento(ETipoDocumentoPerson.CPF, expectedCPf);

        aluno.addDocumento(documento);

        // Passa no teste

        assertTrue(aluno.getDocumentos().contains(documento), "Documento should be added to the list");
    }

    @Test
    void testRemoveDocumento(){

        String expectedCPf = "12345678909";

        Aluno aluno = new Aluno();
        Documento documento = new Documento(ETipoDocumentoPerson.CPF, expectedCPf);

        aluno.addDocumento(documento);

        aluno.removeDocumento(documento);

        // Passa no teste

        assertFalse(aluno.getDocumentos().contains(documento), "Documento should be removed from the list");
    }

    @Test
    void testEmptyDocumentos(){

        Aluno aluno = new Aluno();

        // Passa no teste

        assertTrue(aluno.getDocumentos().isEmpty(), "Documentos should be empty");
    }

    @Test
    void testMultipleDocumentos(){

        String expectedCPf = "12345678909";
        String expectedRG = "123456789";
        String expectedCNH = "1234567890";

        short numOfDocs = 3;

        Aluno aluno = new Aluno();
        Documento documento1 = new Documento(ETipoDocumentoPerson.CPF, expectedCPf);
        Documento documento2 = new Documento(ETipoDocumentoPerson.RG, expectedRG);
        Documento documento3 = new Documento(ETipoDocumentoPerson.CNH, expectedCNH);

        aluno.addDocumento(documento1);
        aluno.addDocumento(documento2);
        aluno.addDocumento(documento3);

        // Passa no teste

        assertEquals(numOfDocs, aluno.getDocumentos().size(),
         "Documentos should contain " + numOfDocs + " items");
    }

    @Test
    void testAddContato(){
        String expectedEmail = "mock123@mail.com";
        String expectedTelefone = "1234567890";
        
        Aluno aluno = new Aluno();
        Contato contato1 = new Contato(ETipoContato.EMAIL, expectedEmail);
        Contato contato2 = new Contato(ETipoContato.TELEFONE, expectedTelefone);

        aluno.addContato(contato1);
        aluno.addContato(contato2);

        short numOfContatos = 2;

        // Passa no teste

        assertTrue(aluno.getContatos().contains(contato1), "Contato should be added to the list");
        assertTrue(aluno.getContatos().contains(contato2), "Contato should be added to the list");
        assertEquals(numOfContatos, aluno.getContatos().size(),
         "Contatos should contain " + numOfContatos + " items");

        // Verifica se o contato adicionado é o mesmo que o esperado
        assertEquals(expectedEmail, aluno.getContatos().get(0).getContato(), "Contato should be " + expectedEmail);
        assertEquals(expectedTelefone, aluno.getContatos().get(1).getContato(), "Contato should be " + expectedTelefone);
    }

    @Test
    void testRemoveContato(){

        String expectedEmail = "mock123@mail.com";

        Aluno aluno = new Aluno();
        Contato contato1 = new Contato(ETipoContato.EMAIL, expectedEmail);        

        aluno.addContato(contato1);

        aluno.removeContato(contato1);

        // Passa no teste

        assertFalse(aluno.getContatos().contains(contato1), "Contato should be removed from the list");
        assertTrue(aluno.getContatos().isEmpty(), "Contatos should be empty");
    }

    @Test
    void testEmptyContatos(){

        Aluno aluno = new Aluno();

        // Passa no teste

        assertTrue(aluno.getContatos().isEmpty(), "Contatos should be empty");
    }

    @Test
    void testMultipleContatos(){

        String expectedEmail = "mock123@mail.com";
        String expectedTelefone = "1234567890";
        String expectedFacebook = "mock123";
        String expectedInstagram = "mock1234";
        String expectedTwitter = "mock12345";
        String expectedLinkedIn = "mock123456";
        String expectedOutro = "mock1234567";

        short numOfContatos = 7;

        Aluno aluno = new Aluno();
        
        Contato contato1 = new Contato(ETipoContato.EMAIL, expectedEmail);
        Contato contato2 = new Contato(ETipoContato.TELEFONE, expectedTelefone);
        Contato contato3 = new Contato(ETipoContato.FACEBOOK, expectedFacebook);
        Contato contato4 = new Contato(ETipoContato.INSTAGRAM, expectedInstagram);
        Contato contato5 = new Contato(ETipoContato.TWITTER, expectedTwitter);
        Contato contato6 = new Contato(ETipoContato.LINKEDIN, expectedLinkedIn);
        Contato contato7 = new Contato(ETipoContato.OUTRO, expectedOutro);
          
        short index = 0;

        aluno.addContato(contato1);
        aluno.addContato(contato2);
        aluno.addContato(contato3);
        aluno.addContato(contato4);
        aluno.addContato(contato5);
        aluno.addContato(contato6);
        aluno.addContato(contato7);

        // Passa no teste

        assertEquals(numOfContatos, aluno.getContatos().size(),
         "Contatos should contain " + numOfContatos + " items");

        assertEquals(expectedEmail, aluno.getContatos().get(index++).getContato(),
         "Contato should be " + expectedEmail);

        assertEquals(expectedTelefone, aluno.getContatos().get(index++).getContato(),
         "Contato should be " + expectedTelefone);

        assertEquals(expectedFacebook, aluno.getContatos().get(index++).getContato(),
         "Contato should be " + expectedFacebook);

        assertEquals(expectedInstagram, aluno.getContatos().get(index++).getContato(),
         "Contato should be " + expectedInstagram);

        assertEquals(expectedTwitter, aluno.getContatos().get(index++).getContato(),
         "Contato should be " + expectedTwitter);

        assertEquals(expectedLinkedIn, aluno.getContatos().get(index++).getContato(),
         "Contato should be " + expectedLinkedIn);

        assertEquals(expectedOutro, aluno.getContatos().get(index++).getContato(),
         "Contato should be " + expectedOutro);

    }



}
