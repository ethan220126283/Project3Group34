package za.ac.cput.classcommunicator.service.impl;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.classcommunicator.domain.User;
import za.ac.cput.classcommunicator.factory.UserFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest
class UserServiceImplTest {

    @Autowired private UserServiceImpl service;

    private static final User user1 = UserFactory.createUser(
                "1",
                "james@mail.com",
                "1234",
                "James Buckley"
        );

    private static final User user2 = UserFactory.createUser(
                "2",
                "john@mail.com",
                "password",
                "John Mayer"
        );

    private static final User user3 = UserFactory.createUser(
                "3",
                "gertrude@mail.com",
                "qwerty",
                "Gertrude Bay"
        );

    //Save Test
    @Test
    void a_save() {
        System.out.println("Created: ");
        User created1 = service.save(user1);
        assertNotNull(created1);
        System.out.println(created1);

        User created2 = service.save(user2);
        assertNotNull(created2);
        System.out.println(created2);

        User created3 = service.save(user3);
        assertNotNull(created3);
        System.out.println(created3);
    }

    //Read test
    @Test
    void b_read() {
        User read = service.read(user2.getId());
        assertEquals(read, user2);
        System.out.println("Read: " + read);
    }

    //getAll test
    @Test
    void c_getAll() {
        List<User> list = service.getAll();
        assertNotNull(list);
        System.out.println(list);
    }

    //Delete test
    @Test
    void d_delete() {
        boolean success = service.delete(user1.getId());
        assertTrue(success);
        System.out.println("Deleted: " + success);

        success = service.delete(user2.getId());
        assertTrue(success);
        System.out.println("Deleted: " + success);

        success = service.delete(user3.getId());
        assertTrue(success);
        System.out.println("Deleted: " + success);
    }
}