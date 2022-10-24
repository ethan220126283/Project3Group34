package za.ac.cput.classcommunicator.service;

import za.ac.cput.classcommunicator.domain.Calendar;

import java.util.List;

public interface CalendarService extends IService<Calendar, String> {

    public List<Calendar> getAll();

}
