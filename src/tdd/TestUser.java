package tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestUser {

    @Test
    public void testCreateUser() {
        User myUser = new User("Hej", "Tjena");


    }

    @Test
    public void testGetUserName() {
        User myUser = new User("userName", "password");
        //Hömta userName från objektet myUser
        String userName = myUser.getUserName();

        //kontrollera att userName är "hej"
        assertEquals(userName, "Hej");


    }

    @Test
    public void testGetPassword() {
        User myUser = new User("userName", "Tjena");
        //Hömta userName från objektet myUser
        String actual = myUser.getPassword();
        String expected = "Tjena";

        //kontrollera att password är "hej"
        assertEquals(expected, actual);


    }

}
