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
@Table(name = "resource")
public class Resource {
    @Id
    @Column(name = "id", nullable = false)
    private String id;

    @ManyToOne
    @JoinColumn(name = "classroom_id")
    private Classroom classroom;

    @Column(name = "resource_type")
    private String resource_type;

    @Column(name = "resource_link")
    private String resource_link;

    @Column(name = "resource_description")
    private String resource_description;

    //toString
    @Override
    public String toString() {
        return "Resource{" +
                "id='" + id + '\'' +
                ", classroom=" + classroom +
                ", resource_type='" + resource_type + '\'' +
                ", resource_link='" + resource_link + '\'' +
                ", resource_description='" + resource_description + '\'' +
                '}';
    }

    //equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Resource resource = (Resource) o;
        return id.equals(resource.id) && classroom.equals(resource.classroom) && Objects.equals(resource_type, resource.resource_type) && Objects.equals(resource_link, resource.resource_link) && Objects.equals(resource_description, resource.resource_description);
    }

    //hashCode
    @Override
    public int hashCode() {
        return Objects.hash(id, classroom, resource_type, resource_link, resource_description);
    }
}