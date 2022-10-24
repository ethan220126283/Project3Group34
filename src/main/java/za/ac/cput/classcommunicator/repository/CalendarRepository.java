package za.ac.cput.classcommunicator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.classcommunicator.domain.Calendar;

@Repository
public interface CalendarRepository extends JpaRepository<Calendar, String> {}