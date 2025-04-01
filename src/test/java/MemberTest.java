import org.junit.jupiter.api.Test;

import br.cefet.Member;

import static org.junit.jupiter.api.Assertions.*;

public class MemberTest {

    Member member = new Member("Marco", "12345678909", "23/03/2000", "219809999999");

    @Test
    void testBasicAttributes() {

        assertEquals("Marco", member.getNome(), "Name should be Marco");
    }

    @Test
    void testCpf(){

        assertEquals(true,  member.validateCpf(), "CPF should be valid");

    }


}
