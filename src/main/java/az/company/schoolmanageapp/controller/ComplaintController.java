package az.company.schoolmanageapp.controller;

import az.company.schoolmanageapp.entity.Complaint;
import az.company.schoolmanageapp.service.inter.ComplaintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("rest")

public class ComplaintController {

    private ComplaintService complaintService;

    @Autowired
    public ComplaintController(ComplaintService complaintService) { this.complaintService=complaintService;}
 //great worked
    @GetMapping("complaints")
    public ResponseEntity<List<Map<String, Object>>> getComplaints() {
        List<Map<String, Object>> result = new ArrayList<>();
        List<Object[]> complaintData = complaintService.getComplaints();
        for (Object[] complaint : complaintData) {
            Map<String, Object> complaintMap = new HashMap<>();
            complaintMap.put("name", complaint[0]);
            complaintMap.put("surname", complaint[1]);
            complaintMap.put("teahcer name",complaint[2]);
            complaintMap.put("teahcer surname",complaint[3]);
            complaintMap.put("complaint text", complaint[4]);
            result.add(complaintMap);
        }
        return ResponseEntity.ok(result);
    }
    //great worked
    @PostMapping("complaints")
    public void addComplaint( @RequestBody Complaint student) {
        student.setId(0);
        Complaint newStudent = complaintService.addComplaint(student);
    }





}
