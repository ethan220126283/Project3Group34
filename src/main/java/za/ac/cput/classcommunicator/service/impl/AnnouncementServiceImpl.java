package za.ac.cput.classcommunicator.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.classcommunicator.domain.Announcement;
import za.ac.cput.classcommunicator.domain.Calendar;
import za.ac.cput.classcommunicator.repository.AnnouncementRepository;
import za.ac.cput.classcommunicator.repository.CalendarRepository;
import za.ac.cput.classcommunicator.service.AnnouncementService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AnnouncementServiceImpl implements AnnouncementService {

    private AnnouncementRepository repository;

    @Autowired
    AnnouncementServiceImpl(AnnouncementRepository repository) {this.repository = repository;}

    //Save method
    @Override
    public Announcement save(Announcement announcement) {return this.repository.save(announcement);}

    //Read method
    public Announcement read(String id) {return this.repository.findById(id).orElse(null);}

    //getAll method
    @Override
    public List<Announcement> getAll() {return this.repository.findAll().stream().collect(Collectors.toList());}

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
