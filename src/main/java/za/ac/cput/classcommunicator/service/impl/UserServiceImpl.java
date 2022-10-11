package za.ac.cput.classcommunicator.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.classcommunicator.domain.User;
import za.ac.cput.classcommunicator.repository.UserRepository;
import za.ac.cput.classcommunicator.service.UserService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    //Repository
    private UserRepository repository;

    @Autowired UserServiceImpl(UserRepository repository) {this.repository = repository;}

    //Save method
    @Override
    public User save(User user) {return this.repository.save(user);}

    //Read method
    public User read(String id) {return this.repository.findById(id).orElse(null);}

    //getAll method
    @Override
    public List<User> getAll() {return this.repository.findAll().stream().collect(Collectors.toList());}

    //Delete method
    @Override
    public boolean delete(String id) {
        if (this.repository.existsById(id)) {
            this.repository.deleteById(id);
            return true;
        }
        return false;
    }
}
