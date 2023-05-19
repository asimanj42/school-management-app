package az.company.schoolmanageapp.service.impl;

import az.company.schoolmanageapp.entity.Schedule;
import az.company.schoolmanageapp.repository.ScheduleRepository;
import az.company.schoolmanageapp.service.inter.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleServiceImpl implements ScheduleService {

    private ScheduleRepository scheduleRepository;

    @Autowired
    public ScheduleServiceImpl(ScheduleRepository scheduleRepository){
        this.scheduleRepository = scheduleRepository;
    }

    @Override
    public List<Object[]> getSchedule() {
        return scheduleRepository.findLessonSchedules();
    }

    @Override
    public void addSchedule(Schedule schedule) {
        scheduleRepository.save(schedule);
    }
}
