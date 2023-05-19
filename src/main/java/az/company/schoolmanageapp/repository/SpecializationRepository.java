package az.company.schoolmanageapp.repository;

import az.company.schoolmanageapp.entity.Specialization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpecializationRepository extends JpaRepository<Specialization, Integer> {


    @Query("select s.specialityName,l.name " +
            "FROM Specialization s " +
            "JOIN s.lessonsList l")
        //    @Query("SELECT st.name, st.surname, l.name, s.startTime, s.endTime, s.classroom " +
//            "FROM Schedule s " +
//            "JOIN s.lessonId l " +
//            "JOIN l.specialitizationId sp " +
//            "JOIN sp.studentsList st " )
    List<Object[]> getSpecializationByLessonsList();
}