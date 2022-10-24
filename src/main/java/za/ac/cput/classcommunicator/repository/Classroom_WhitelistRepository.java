package za.ac.cput.classcommunicator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.classcommunicator.domain.Classroom_Whitelist;

@Repository
public interface Classroom_WhitelistRepository extends JpaRepository<Classroom_Whitelist, String> {}