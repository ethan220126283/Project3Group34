package za.ac.cput.classcommunicator.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.classcommunicator.domain.Classroom;
import za.ac.cput.classcommunicator.domain.User;
import za.ac.cput.classcommunicator.domain.User_Classroom;

import static org.junit.jupiter.api.Assertions.*;

class User_ClassroomFactoryTest {

    @Test
    void createUser_Classroom() {

        User user = UserFactory.createUser(
                "1",
                "james@mail.com",
                "1234",
                "James Buckley");

        Classroom classroom = ClassroomFactory.createClassroom(
                "1",
                "Mr James Gr 12 Class",
                "The classroom for Mr James"
        );

        User_Classroom user_classroom = User_ClassroomFactory.createUser_Classroom(
                "1",
                user,
                classroom
        );

        System.out.println(user_classroom);
        assertNotNull(user_classroom);

    }
}