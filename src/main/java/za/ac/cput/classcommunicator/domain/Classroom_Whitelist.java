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
@Table(name = "classroom_whitelist")
public class Classroom_Whitelist {
    @Id
    @Column(name = "id", nullable = false)
    private String id;

    @ManyToOne
    @JoinColumn(name = "classroom_id")
    private Classroom classroom;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    //toString
    @Override
    public String toString() {
        return "Classroom_Whitelist{" +
                "id='" + id + '\'' +
                ", classroom=" + classroom +
                ", user=" + user +
                '}';
    }

    //equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Classroom_Whitelist that = (Classroom_Whitelist) o;
        return id.equals(that.id) && classroom.equals(that.classroom) && user.equals(that.user);
    }

    //hashCode
    @Override
    public int hashCode() {
        return Objects.hash(id, classroom, user);
    }
}