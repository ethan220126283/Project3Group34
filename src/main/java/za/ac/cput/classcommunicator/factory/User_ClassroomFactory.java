package za.ac.cput.classcommunicator.factory;

import za.ac.cput.classcommunicator.domain.Classroom;
import za.ac.cput.classcommunicator.domain.User;
import za.ac.cput.classcommunicator.domain.User_Classroom;

public class User_ClassroomFactory {

    public static User_Classroom createUser_Classroom(String id, User user, Classroom classroom) {

        return User_Classroom.builder()
                .id(id)
                .user(user)
                .classroom(classroom)
                .build();

    }
}
