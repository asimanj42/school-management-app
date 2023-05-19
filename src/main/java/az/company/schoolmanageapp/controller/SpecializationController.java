package az.company.schoolmanageapp.controller;

import az.company.schoolmanageapp.entity.Lessons;
import az.company.schoolmanageapp.entity.Specialization;
import az.company.schoolmanageapp.service.inter.SpecializationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("rest")
public class SpecializationController {
    private SpecializationService   specializationService;

    @Autowired
    public SpecializationController(SpecializationService specializationService) {
        this.specializationService  = specializationService;
    }


    @GetMapping("specialization")
    public ResponseEntity<List<Map<String, Object>>> getSpecializations() {
        List<Map<String, Object>> result = new ArrayList<>();
        List<Object[]> specializationData = specializationService.getSpecializations();
        for (Object[] specialization : specializationData) {
            Map<String, Object> specializationMap = new HashMap<>();
            specializationMap.put("name", specialization[0]);
            specializationMap.put("lessons name", specialization[1]);
            result.add(specializationMap);
        }
        return ResponseEntity.ok(result);
    }

    @PostMapping("/specializations")
    public void addSpecialization(@RequestBody Specialization specialization) {
        specialization.setId(0);
        specializationService.addSpecialization(specialization);
    }
}
