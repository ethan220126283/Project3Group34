package za.ac.cput.classcommunicator.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.classcommunicator.domain.User_Classroom;
import za.ac.cput.classcommunicator.repository.User_ClassroomRepository;
import za.ac.cput.classcommunicator.service.User_ClassroomService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class User_ClassroomServiceImpl implements User_ClassroomService {

    private User_ClassroomRepository repository;

    @Autowired User_ClassroomServiceImpl(User_ClassroomRepository repository) {this.repository = repository;}

    @Override
    public User_Classroom save(User_Classroom user_classroom) {return  this.repository.save(user_classroom);}

    @Override
    public User_Classroom read(String id) {return this.repository.findById(id).orElse(null);}

    @Override
    public List<User_Classroom> getAll() {return this.repository.findAll().stream().collect(Collectors.toList());}

    @Override
    public boolean delete(String id) {
        if (this.repository.existsById(id)) {
            this.repository.deleteById(id);
            return true;
        }
        return false;
    }

}
