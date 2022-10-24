package za.ac.cput.classcommunicator.service;

import za.ac.cput.classcommunicator.domain.User_Classroom;

import java.util.List;

public interface User_ClassroomService extends IService<User_Classroom, String>{

    public List<User_Classroom> getAll();

}
