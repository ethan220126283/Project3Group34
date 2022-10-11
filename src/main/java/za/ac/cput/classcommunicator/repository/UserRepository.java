package za.ac.cput.classcommunicator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.classcommunicator.domain.User;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, String> {}