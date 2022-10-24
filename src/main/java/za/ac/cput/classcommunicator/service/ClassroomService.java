package za.ac.cput.classcommunicator.service;

import za.ac.cput.classcommunicator.domain.Classroom;

import java.util.List;

public interface ClassroomService extends IService<Classroom, String> {

    public List<Classroom> getAll();

}
