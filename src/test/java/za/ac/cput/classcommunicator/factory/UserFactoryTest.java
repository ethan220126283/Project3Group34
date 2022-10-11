package za.ac.cput.classcommunicator.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.classcommunicator.domain.User;

import static org.junit.jupiter.api.Assertions.*;

class UserFactoryTest {

    @Test
    void createUser() {
        User user = UserFactory.createUser(
                "1",
                "james@mail.com",
                "1234",
                "James Buckley");

        System.out.println(user);
        assertNotNull(user);
    }
}