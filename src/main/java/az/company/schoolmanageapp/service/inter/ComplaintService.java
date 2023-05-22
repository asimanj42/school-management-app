package az.company.schoolmanageapp.service.inter;

import az.company.schoolmanageapp.entity.Complaint;
import az.company.schoolmanageapp.entity.Students;
import az.company.schoolmanageapp.model.dto.ComplaintDto;
import az.company.schoolmanageapp.model.dto.StudentsDto;

import java.util.List;

public interface ComplaintService {
    List<Object[]> getComplaints();
    List<ComplaintDto> getAllComplaint();
    ComplaintDto findById(Integer id);
    Complaint getComplaintById(Integer id);
    void addComplaint(ComplaintDto complaint);
    void updateComplaint(ComplaintDto complaint);
    void removeComplaint(Integer complaintId);

//    Complaint addComplaint(StudentRequestModel student);
}
