package az.company.schoolmanageapp.repository;

import az.company.schoolmanageapp.entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Students, Integer> {

    @Query("SELECT s.name, s.specialityId.specialityName, l.name FROM Students s JOIN s.specialityId sp JOIN sp.lessonsList l")
    List<Object[]> findStudentInfoWithSpecializationAndLessons();



}