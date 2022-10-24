package za.ac.cput.classcommunicator.factory;

import za.ac.cput.classcommunicator.domain.Calendar;
import za.ac.cput.classcommunicator.domain.Classroom;

import java.util.Date;

public class CalendarFactory {

    public static Calendar createCalendar(String id, Classroom classroom, Date date, String name, String description) {

        return Calendar.builder()
                .id(id)
                .classroom(classroom)
                .calendar_date(date)
                .calendar_name(name)
                .calendar_description(description)
                .build();
    }

}
