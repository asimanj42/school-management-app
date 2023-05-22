package az.company.schoolmanageapp.repository;

import az.company.schoolmanageapp.entity.Lessons;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LessonRepository extends JpaRepository<Lessons, Integer> {

    @Query("SELECT l.name FROM Lessons l JOIN l.specialitizationId s JOIN s.studentsList st WHERE st.id = :studentId")

    List<Object[]>   findLessonsByStudentId(@Param("studentId") Integer studentId);


}
