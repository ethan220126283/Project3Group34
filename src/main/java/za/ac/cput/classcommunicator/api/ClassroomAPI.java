package za.ac.cput.classcommunicator.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.ac.cput.classcommunicator.domain.Classroom;
import za.ac.cput.classcommunicator.domain.User;
import za.ac.cput.classcommunicator.domain.User_Classroom;
import za.ac.cput.classcommunicator.factory.User_ClassroomFactory;
import za.ac.cput.classcommunicator.service.impl.*;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

@Component
public class ClassroomAPI {

    private ClassroomServiceImpl classroomService;
    private Classroom_WhitelistServiceImpl classroom_whitelistService;
    private User_ClassroomServiceImpl user_classroomService;
    private ResourceServiceImpl resourceService;
    private AnnouncementServiceImpl announcementService;
    private CalendarServiceImpl calendarService;
    private UserServiceImpl userService;

    @Autowired
    ClassroomAPI(ClassroomServiceImpl classroomService, Classroom_WhitelistServiceImpl classroom_whitelistService, User_ClassroomServiceImpl user_classroomService, ResourceServiceImpl resourceService, AnnouncementServiceImpl announcementService, CalendarServiceImpl calendarService, UserServiceImpl userService) {

        //Classroom Service
        this.classroomService = classroomService;
        //Classroom Whitelist Service
        this.classroom_whitelistService = classroom_whitelistService;
        //User Classroom Service
        this.user_classroomService = user_classroomService;
        //Resource Service
        this.resourceService = resourceService;
        //Announcement Service
        this.announcementService = announcementService;
        //Calendar Service
        this.calendarService = calendarService;
        //User Serivce
        this.userService = userService;

    }

    //Add Classroom method
    public void addClassroom(String userID, Classroom classroom) {
        UUID uuid = UUID.randomUUID();

        User user = userService.read(userID);

        User_Classroom user_classroom = User_ClassroomFactory.createUser_Classroom(uuid.toString(),user,classroom);

        classroomService.save(classroom);
        user_classroomService.save(user_classroom);

    }

    //Get Classroom by ID
    public Classroom getClassroomById(String id) {
        return classroomService.read(id);
    }
}
