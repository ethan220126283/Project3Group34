package za.ac.cput.classcommunicator.api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.classcommunicator.domain.Classroom;
import za.ac.cput.classcommunicator.domain.User;
import za.ac.cput.classcommunicator.factory.ClassroomFactory;
import za.ac.cput.classcommunicator.factory.UserFactory;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ClassroomAPITest {

    @Autowired
    private ClassroomAPI classroomAPI;

    @Autowired
    private UserAPI userAPI;

    @Test
    void addClassroom() {
        Classroom classroom = ClassroomFactory.createClassroom(
                "1",
                "Mr James Class",
                "The classroom of Mr James"
        );

        User user = UserFactory.createUser(
                "9",
                "huttonm@mail.com",
                "1234",
                "Matt Hutton"
        );

        userAPI.addUser(user);
        classroomAPI.addClassroom("9",classroom);
        assertNotNull(classroomAPI.getClassroomById("1"));

    }
}