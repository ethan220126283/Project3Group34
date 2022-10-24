package za.ac.cput.classcommunicator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.classcommunicator.domain.Resource;

@Repository
public interface ResourceRepository extends JpaRepository<Resource, String> {}