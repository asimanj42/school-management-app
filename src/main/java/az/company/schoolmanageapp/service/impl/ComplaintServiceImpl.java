package az.company.schoolmanageapp.service.impl;

import az.company.schoolmanageapp.entity.Complaint;
import az.company.schoolmanageapp.repository.ComplaintRepository;
import az.company.schoolmanageapp.service.inter.ComplaintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComplaintServiceImpl implements ComplaintService {

    private ComplaintRepository complaintRepository;

    @Autowired
    public ComplaintServiceImpl(ComplaintRepository complaintRepository){
        this.complaintRepository=complaintRepository;
    }


    @Override
    public List<Object[]> getComplaints() {
        return complaintRepository.findAllStudentComplaints();
    }

//    @Override
//    public Complaint addComplaint(Complaint complaint) {
//        return complaintRepository.save(complaint);
//    }
}
