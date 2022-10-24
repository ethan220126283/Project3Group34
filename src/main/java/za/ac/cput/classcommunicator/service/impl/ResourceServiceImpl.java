package za.ac.cput.classcommunicator.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.classcommunicator.domain.Resource;
import za.ac.cput.classcommunicator.domain.User;
import za.ac.cput.classcommunicator.repository.ResourceRepository;
import za.ac.cput.classcommunicator.repository.UserRepository;
import za.ac.cput.classcommunicator.service.ResourceService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ResourceServiceImpl implements ResourceService {

    private ResourceRepository repository;

    @Autowired
    ResourceServiceImpl(ResourceRepository repository) {this.repository = repository;}

    //Save method
    @Override
    public Resource save(Resource resource) {return this.repository.save(resource);}

    //Read method
    public Resource read(String id) {return this.repository.findById(id).orElse(null);}

    //getAll method
    @Override
    public List<Resource> getAll() {return this.repository.findAll().stream().collect(Collectors.toList());}

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
