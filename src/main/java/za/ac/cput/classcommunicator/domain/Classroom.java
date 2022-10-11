package za.ac.cput.classcommunicator.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "classroom")
public class Classroom {
    @Id
    @Column(name = "classroom_id", nullable = false)
    private String id;

    @Column(name = "classroom_name", nullable = false)
    private String name;

    @Column(name = "classroom_description")
    private String description;

}