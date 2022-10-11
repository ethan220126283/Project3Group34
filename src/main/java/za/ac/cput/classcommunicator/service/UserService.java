package za.ac.cput.classcommunicator.service;

import za.ac.cput.classcommunicator.domain.User;
import java.util.List;

public interface UserService extends IService<User, String> {

    public List<User> getAll();

}
