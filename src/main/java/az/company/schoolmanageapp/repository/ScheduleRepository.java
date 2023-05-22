package az.company.schoolmanageapp.repository;

import az.company.schoolmanageapp.entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, Integer> {
    @Query("SELECT st.name, st.surname, l.name, s.startTime, s.endTime, s.classroom " +
            "FROM Schedule s " +
            "JOIN s.lessonId l " +
            "JOIN l.specialitizationId sp " +
            "JOIN sp.studentsList st " )
    List<Object[]> findLessonSchedules();

}
