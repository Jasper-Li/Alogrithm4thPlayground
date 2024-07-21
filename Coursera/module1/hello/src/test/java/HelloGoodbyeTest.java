import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloGoodbyeTest {

    @Test
    void helloGoodbye() {
        record Check(String name1, String name2, String expect){}
        Check[] checks = {
            new Check("Kevin", "Bob",
                """
                    Hello Kevin and Bob.
                    Goodbye Bob and Kevin."""),
            new Check("Alejandra", "Bahati",
                """
                    Hello Alejandra and Bahati.
                    Goodbye Bahati and Alejandra.""")
        };
        for(var check : checks) {
        }
    }
}