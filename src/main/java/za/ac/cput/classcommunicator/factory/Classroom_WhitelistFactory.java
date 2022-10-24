package za.ac.cput.classcommunicator.factory;

import za.ac.cput.classcommunicator.domain.Classroom;
import za.ac.cput.classcommunicator.domain.Classroom_Whitelist;
import za.ac.cput.classcommunicator.domain.User;

public class Classroom_WhitelistFactory {

    public static Classroom_Whitelist createClassroom_Whitelist(String id, Classroom classroom, User user) {

        return Classroom_Whitelist.builder()
                .id(id)
                .classroom(classroom)
                .user(user)
                .build();

    }
}
