package az.company.schoolmanageapp.repository;

import az.company.schoolmanageapp.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Integer> {

    @Query("SELECT t.name,t.surname,l.name " +
            "FROM Teacher t " +
            "JOIN t.lessonId l")
//    @Query("SELECT st.name, st.surname, l.name, s.startTime, s.endTime, s.classroom " +
//            "FROM Schedule s " +
//            "JOIN s.lessonId l " +
//            "JOIN l.specialitizationId sp " +
//            "JOIN sp.studentsList st " )
    List<Object[]> getTeacherByLessonName();
}