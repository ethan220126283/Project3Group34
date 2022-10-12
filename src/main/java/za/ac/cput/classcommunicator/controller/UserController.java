package za.ac.cput.classcommunicator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cput.classcommunicator.api.UserAPI;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserAPI userAPI;

    @Autowired UserController (UserAPI userAPI) {
        this.userAPI = userAPI;
    }

    @GetMapping("/getemails")
    public List<String> read() {return userAPI.getUserEmails();}
}
