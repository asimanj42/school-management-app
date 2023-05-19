package az.company.schoolmanageapp.repository;

import az.company.schoolmanageapp.entity.Complaint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComplaintRepository extends JpaRepository<Complaint, Integer> {

    @Query("SELECT s.name, s.surname,t.name, t.surname, c.complaintText " +
            "FROM Complaint c " +
            "JOIN c.studentId s " +
            "JOIN c.teacherId t " +
            "ORDER BY s.name, s.surname,t.name, t.surname")
    List<Object[]> findAllStudentComplaints();

}