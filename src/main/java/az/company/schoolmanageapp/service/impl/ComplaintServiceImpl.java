package az.company.schoolmanageapp.service.impl;

import az.company.schoolmanageapp.entity.Complaint;
import az.company.schoolmanageapp.entity.Students;
import az.company.schoolmanageapp.exception.ComplaintNotFoundException;
import az.company.schoolmanageapp.exception.StudentNotFoundException;
import az.company.schoolmanageapp.mapper.ComplaintMapper;
import az.company.schoolmanageapp.model.dto.ComplaintDto;
import az.company.schoolmanageapp.model.dto.StudentsDto;
import az.company.schoolmanageapp.repository.ComplaintRepository;
import az.company.schoolmanageapp.service.inter.ComplaintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComplaintServiceImpl implements ComplaintService {

    private final ComplaintRepository complaintRepository;
    private final ComplaintMapper complaintMapper;

    @Autowired
    public ComplaintServiceImpl(ComplaintRepository complaintRepository, ComplaintMapper complaintMapper) {
        this.complaintRepository = complaintRepository;
        this.complaintMapper = complaintMapper;
    }


    @Override
    public List<Object[]> getComplaints() {
        return complaintRepository.findAllStudentComplaints();
    }

    @Override
    public List<ComplaintDto> getAllComplaint() {
        List<Complaint> complaints = complaintRepository.findAll();
        List<ComplaintDto> result = complaintMapper.toDto(complaints);
        return result;
    }

    @Override
    public ComplaintDto findById(Integer id) {
        Complaint complaint = getComplaintById(id);
        return complaintMapper.toDto(complaint);
    }

    @Override
    public Complaint getComplaintById(Integer id) {
        Optional<Complaint> complaint = complaintRepository.findById(id);
        if (complaint.isPresent()) {
            return (complaint.get());
        }
        throw new ComplaintNotFoundException("Complaint not found by id" + id);

    }


    @Override
    public void addComplaint(ComplaintDto complaint) {
        complaintRepository.save(complaintMapper.toEntity(complaint));
    }

    @Override
    public void updateComplaint(ComplaintDto complaint) {
        complaintRepository.save(complaintMapper.toEntity(complaint));
    }

    @Override
    public void removeComplaint(Integer complaintId) {
        Complaint complaint = getComplaintById(complaintId);
        complaintRepository.delete(complaint);
    }
}
