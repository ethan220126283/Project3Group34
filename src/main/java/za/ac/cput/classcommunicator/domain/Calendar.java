package za.ac.cput.classcommunicator.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "calendar")
public class Calendar {
    @Id
    @Column(name = "id", nullable = false)
    private String id;

    @ManyToOne
    @JoinColumn(name = "classroom_id")
    private Classroom classroom;

    @Temporal(TemporalType.DATE)
    @Column(name = "calendar_date")
    private Date calendar_date;

    @Column(name = "calendar_name")
    private String calendar_name;

    @Column(name = "calendar_description")
    private String calendar_description;


    //toString
    @Override
    public String toString() {
        return "Calendar{" +
                "id='" + id + '\'' +
                ", classroom=" + classroom +
                ", calendar_date=" + calendar_date +
                ", calendar_name='" + calendar_name + '\'' +
                ", calendar_description='" + calendar_description + '\'' +
                '}';
    }

    //equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Calendar calendar = (Calendar) o;
        return id.equals(calendar.id) && classroom.equals(calendar.classroom) && Objects.equals(calendar_date, calendar.calendar_date) && Objects.equals(calendar_name, calendar.calendar_name) && Objects.equals(calendar_description, calendar.calendar_description);
    }

    //hashCode
    @Override
    public int hashCode() {
        return Objects.hash(id, classroom, calendar_date, calendar_name, calendar_description);
    }
}