import static org.junit.jupiter.api.Assertions.*;
class Exercise1Test {

    Exercise1 ex1O =new Exercise1();

    @org.junit.jupiter.api.Test
    void login() {

        assertTrue(ex1O.login("user","pass"));


    }

}