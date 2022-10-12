package za.ac.cput.classcommunicator.api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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
}