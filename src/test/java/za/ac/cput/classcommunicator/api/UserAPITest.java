package za.ac.cput.classcommunicator.api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.classcommunicator.domain.User;
import za.ac.cput.classcommunicator.factory.UserFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserAPITest {

    @Autowired private UserAPI api;

    @Test
    void getUserEmails() {

        List<String> emails = api.getUserEmails();
        System.out.println(emails);
        assertNotNull(emails);

    }

    @Test
    void addUser() {
        User user = UserFactory.createUser(
                "5",
                "tristan@mail.com",
                "1234",
                "Tristan"
        );
        api.addUser(user);
        assertEquals(user, api.getUserById("5"));
    }

    @Test
    void updateUser() {
        User user = UserFactory.createUser(
                "5",
                "tristan@newmail.com",
                "1234",
                "Tristan"
        );
        assertTrue(api.updateUserById("5",user));
    }

    @Test
    void deleteUser() {
        assertTrue(api.deleteUserById("5"));
    }


}