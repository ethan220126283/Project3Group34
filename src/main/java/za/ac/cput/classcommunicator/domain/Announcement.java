package za.ac.cput.classcommunicator.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Objects;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "announcement")
public class Announcement {
    @Id
    @Column(name = "id", nullable = false)
    private String id;

    @ManyToOne
    @JoinColumn(name = "classroom_id")
    private Classroom classroom;

    @Column(name = "announcement_date")
    private String announcement_date;

    @Column(name = "announcement_content")
    private String announcement_content;

    public String getAnnouncement_content() {
        return announcement_content;
    }

    public void setAnnouncement_content(String announcement_content) {
        this.announcement_content = announcement_content;
    }

    //toString
    @Override
    public String toString() {
        return "Announcement{" +
                "id='" + id + '\'' +
                ", classroom=" + classroom +
                ", announcement_date='" + announcement_date + '\'' +
                ", announcement_content='" + announcement_content + '\'' +
                '}';
    }

    //equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Announcement that = (Announcement) o;
        return id.equals(that.id) && classroom.equals(that.classroom) && Objects.equals(announcement_date, that.announcement_date) && Objects.equals(announcement_content, that.announcement_content);
    }

    //hashCode
    @Override
    public int hashCode() {
        return Objects.hash(id, classroom, announcement_date, announcement_content);
    }
}