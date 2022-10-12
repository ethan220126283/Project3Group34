package za.ac.cput.classcommunicator.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.ac.cput.classcommunicator.domain.User;
import za.ac.cput.classcommunicator.service.impl.UserServiceImpl;

import java.util.LinkedList;
import java.util.List;

@Component
public class UserAPI {

    private UserServiceImpl userService;

    @Autowired
    UserAPI(UserServiceImpl userService) {
        this.userService = userService;
    }

    public List<String> getUserEmails() {

        List<User> users = userService.getAll();
        List<String> names = new LinkedList<>();

        for (User user : users) {
            names.add(user.getEmail());
        }
        if (names.isEmpty())
            return null;
        return names;
    }

}
