package za.ac.cput.classcommunicator.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.classcommunicator.domain.Classroom;
import za.ac.cput.classcommunicator.repository.ClassroomRepository;
import za.ac.cput.classcommunicator.service.ClassroomService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClassroomServiceImpl implements ClassroomService {

    private ClassroomRepository repository;

    @Autowired
    ClassroomServiceImpl(ClassroomRepository repository) {this.repository = repository;}

    //Save method
    @Override
    public Classroom save(Classroom classroom) {return this.repository.save(classroom);}

    //Read method
    public Classroom read(String id) {return this.repository.findById(id).orElse(null);}

    //getAll method
    @Override
    public List<Classroom> getAll() {return this.repository.findAll().stream().collect(Collectors.toList());}

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
