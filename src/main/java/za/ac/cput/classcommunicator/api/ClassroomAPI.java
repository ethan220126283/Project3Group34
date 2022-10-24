package za.ac.cput.classcommunicator.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.ac.cput.classcommunicator.service.impl.*;

import java.util.LinkedList;
import java.util.List;

@Component
public class ClassroomAPI {

    private ClassroomServiceImpl classroomService;

    private Classroom_WhitelistServiceImpl classroom_whitelistService;
    private User_ClassroomServiceImpl user_classroomService;
    private ResourceServiceImpl resourceService;
    private AnnouncementServiceImpl announcementService;
    private CalendarServiceImpl calendarService;

    @Autowired
    ClassroomAPI(ClassroomServiceImpl classroomService, Classroom_WhitelistServiceImpl classroom_whitelistService, User_ClassroomServiceImpl user_classroomService, ResourceServiceImpl resourceService, AnnouncementServiceImpl announcementService, CalendarServiceImpl calendarService) {

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

    }

}
