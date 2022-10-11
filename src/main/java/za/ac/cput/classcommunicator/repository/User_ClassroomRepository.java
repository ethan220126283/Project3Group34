package za.ac.cput.classcommunicator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.classcommunicator.domain.User_Classroom;

@Repository
public interface User_ClassroomRepository extends JpaRepository<User_Classroom, String> {
}