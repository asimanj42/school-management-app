package az.company.schoolmanageapp.repository;

import az.company.schoolmanageapp.entity.Grades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GradeRepository extends JpaRepository<Grades, Integer> {



//    void updateGrades(@Param("id") Integer id, @Param("quiz") Integer quiz, @Param("participation") Integer participation, @Param("midterm") Integer midterm, @Param("final1") Integer final1);
//    List<Grades> findByStudentIdAndLessonId(Integer studentId, Integer lessonId);
//    Optional<Grades> findFirstByStudentIdAndLessonIdOrderByIdDesc(Integer studentId, Integer lessonId);

}