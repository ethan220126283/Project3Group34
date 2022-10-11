package za.ac.cput.classcommunicator.factory;

import za.ac.cput.classcommunicator.domain.Classroom;

public class ClassroomFactory {

    public static Classroom createClassroom(String id, String name, String description) {

        return Classroom.builder()
                .id(id)
                .name(name)
                .description(description)
                .build();

    }

}
