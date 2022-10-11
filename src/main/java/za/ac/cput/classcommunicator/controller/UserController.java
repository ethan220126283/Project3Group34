package za.ac.cput.classcommunicator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cput.classcommunicator.api.UserAPI;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserAPI userAPI;

    @Autowired UserController (UserAPI userAPI) {
        this.userAPI = userAPI;
    }
}
