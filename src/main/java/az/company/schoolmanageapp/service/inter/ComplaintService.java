package az.company.schoolmanageapp.service.inter;

import az.company.schoolmanageapp.entity.Complaint;

import java.util.List;

public interface ComplaintService {
    List<Object[]> getComplaints();

    Complaint addComplaint(Complaint student);
}
