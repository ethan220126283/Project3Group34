package za.ac.cput.classcommunicator.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.classcommunicator.domain.Calendar;
import za.ac.cput.classcommunicator.domain.Resource;
import za.ac.cput.classcommunicator.repository.CalendarRepository;
import za.ac.cput.classcommunicator.repository.ResourceRepository;
import za.ac.cput.classcommunicator.service.CalendarService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CalendarServiceImpl implements CalendarService {

    private CalendarRepository repository;

    @Autowired
    CalendarServiceImpl(CalendarRepository repository) {this.repository = repository;}

    //Save method
    @Override
    public Calendar save(Calendar resource) {return this.repository.save(resource);}

    //Read method
    public Calendar read(String id) {return this.repository.findById(id).orElse(null);}

    //getAll method
    @Override
    public List<Calendar> getAll() {return this.repository.findAll().stream().collect(Collectors.toList());}

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
