package za.ac.cput.classcommunicator.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.ac.cput.classcommunicator.service.impl.UserServiceImpl;

@Component
public class UserAPI {

    private UserServiceImpl userService;

    @Autowired
    UserAPI(UserServiceImpl userService) {
        this.userService = userService;
    }

}
