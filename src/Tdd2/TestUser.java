package Tdd2;
import org.junit.jupiter.api.*;
import static org.junit.Assert.assertEquals;

@Test
public void testChangeTypeOfUserToGoldMemberAfter20Logins() {
    User user = new User("Staffan", "myPerfectPass");

    for (int i = 0; i < 20; i++) {
        user.login();

    }

    String actual = user.getTypeOfUser();
    String expected = "gold member";

    assertEquals(expected,actual);
}

@Test
public void testChangeTypeOfUserToGoldMemberAfter19Logins() {
    User user = new User("Staffan", "myPerfectPass");

    for (int i = 0; i < 19; i++) {
        user.login();

    }

    String actual = user.getTypeOfUser();
    String expected = "normal";

    assertEquals(expected,actual);
}



