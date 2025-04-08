import org.junit.jupiter.api.Test;

import br.cefet.*;

import static org.junit.jupiter.api.Assertions.*;

public class MemberTest {

    @Test
    void testBasicAttributes() {

        String expectedCPf = "12345678909";

        GymSystem gym = new GymSystem();
        Member member = new Member("Marco", expectedCPf, "23/03/2000", "219809999999", 12345);

        gym.addMember(member);

        assertEquals("Marco", gym.getMembers().get(0).getNome(), "Name should be Marco");
        assertEquals(expectedCPf, gym.getMembers().get(0).getCpf());
    }

    @Test
    void testCpf(){
        // Throws invalid
        GymSystem gym = new GymSystem();
        Member member = new Member("Marco", "111111111111", "23/03/2000", "219809999999", 123455);

        gym.addMember(member);
        assertEquals(true,  gym.getMembers().get(0).validateCpf(), "CPF should not be valid");

        // Passes


    }


}
