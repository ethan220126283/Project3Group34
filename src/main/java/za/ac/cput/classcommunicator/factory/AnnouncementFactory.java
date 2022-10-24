package za.ac.cput.classcommunicator.factory;

import za.ac.cput.classcommunicator.domain.Announcement;
import za.ac.cput.classcommunicator.domain.Classroom;

public class AnnouncementFactory {

    public static Announcement createAnnouncement(String id, Classroom classroom, String date, String content) {

        return Announcement.builder()
                .id(id)
                .classroom(classroom)
                .announcement_date(date)
                .announcement_content(content)
                .build();
    }
}
