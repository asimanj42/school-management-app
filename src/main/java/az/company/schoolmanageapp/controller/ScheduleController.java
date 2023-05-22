package az.company.schoolmanageapp.controller;

import az.company.schoolmanageapp.service.inter.ScheduleService;
import az.company.schoolmanageapp.model.dto.ScheduleDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("rest")
public class ScheduleController {

    private final ScheduleService scheduleService;

    @Autowired
    public ScheduleController(ScheduleService scheduleService) {
        this.scheduleService = scheduleService;
    }

    @GetMapping("schedule")
    public ResponseEntity<List<Map<String, Object>>> getSchedule() {
        List<Map<String, Object>> result = new ArrayList<>();
        List<Object[]> scheduleData = scheduleService.getSchedule();
        for (Object[] schedule : scheduleData) {
            Map<String, Object> scheduleMap = new HashMap<>();
            scheduleMap.put("name", schedule[0]);
            scheduleMap.put("surname", schedule[1]);
            scheduleMap.put("lesson name", schedule[2]);
            scheduleMap.put("startTime", schedule[3]);
            scheduleMap.put("endTime", schedule[4]);
            scheduleMap.put("classroom", schedule[5]);
            result.add(scheduleMap);
        }
        return ResponseEntity.ok(result);
    }

    @GetMapping("schedules")
    public List<ScheduleDto> getAllSchedules() {
        return scheduleService.getAllSchedule();
    }

    @GetMapping("schedules/{studentId}")
    public ScheduleDto getScheduleById(@PathVariable Integer scheduleId) {
        return scheduleService.findById(scheduleId);
    }

    @PostMapping("schedules")
    public void addSchedule(@RequestBody ScheduleDto schedule) {
        schedule.setId(0);
        scheduleService.addSchedule(schedule);
    }

    @PutMapping("schedules")
    public void updateSchedule(@RequestBody ScheduleDto schedule) {
        scheduleService.updateSchedule(schedule);
    }

    @DeleteMapping("schedule/{scheduleId}")
    public void removeSchedule(@PathVariable Integer scheduleId) {
        scheduleService.removeSchedule(scheduleId);
    }


}
