package za.ac.cput.classcommunicator.factory;

import za.ac.cput.classcommunicator.domain.User;

public class UserFactory {

    public static User createUser(String id, String email, String password, String name) {

        return User.builder()
                .id(id)
                .email(email)
                .password(password)
                .name(name)
                .build();
    }
}
