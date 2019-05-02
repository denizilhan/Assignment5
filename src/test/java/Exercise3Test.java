import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercise3Test {
    Exercise3 ex3O = new Exercise3();
    @Test
    void ex3() {

        assertEquals("ab" ,ex3O.ex3("abc","c"));
    }
}