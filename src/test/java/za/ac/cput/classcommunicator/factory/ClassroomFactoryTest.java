package za.ac.cput.classcommunicator.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.classcommunicator.domain.Classroom;

import static org.junit.jupiter.api.Assertions.*;

class ClassroomFactoryTest {

    @Test
    void createClassroom() {

        Classroom classroom = ClassroomFactory.createClassroom(
                "1",
                "Mr James Gr 12 Class",
                "The classroom for Mr James"
        );

        System.out.println(classroom);
        assertNotNull(classroom);

    }
}