package za.ac.cput.classcommunicator.service;

import za.ac.cput.classcommunicator.domain.Announcement;

import java.util.List;

public interface AnnouncementService extends IService<Announcement, String>{

    public List<Announcement> getAll();
}
