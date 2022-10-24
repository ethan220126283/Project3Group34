package za.ac.cput.classcommunicator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.classcommunicator.domain.Announcement;

@Repository
public interface AnnouncementRepository extends JpaRepository<Announcement, String> {}