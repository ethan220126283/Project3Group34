package za.ac.cput.classcommunicator.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.classcommunicator.domain.Classroom_Whitelist;
import za.ac.cput.classcommunicator.repository.Classroom_WhitelistRepository;
import za.ac.cput.classcommunicator.service.Classroom_WhitelistService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class Classroom_WhitelistServiceImpl implements Classroom_WhitelistService {

    private Classroom_WhitelistRepository repository;

    @Autowired
    Classroom_WhitelistServiceImpl(Classroom_WhitelistRepository repository) {this.repository = repository;}

    //Save method
    @Override
    public Classroom_Whitelist save(Classroom_Whitelist classroom_whitelist) {return this.repository.save(classroom_whitelist);}

    //Read method
    public Classroom_Whitelist read(String id) {return this.repository.findById(id).orElse(null);}

    //getAll method
    @Override
    public List<Classroom_Whitelist> getAll() {return this.repository.findAll().stream().collect(Collectors.toList());}

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
