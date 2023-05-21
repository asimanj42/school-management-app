package az.company.schoolmanageapp.repository;

import az.company.schoolmanageapp.entity.Lessons;
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
    List<Object[]> getSpecializationByLessonsList();
}