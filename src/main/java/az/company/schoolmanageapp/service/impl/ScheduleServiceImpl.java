package az.company.schoolmanageapp.service.impl;

import az.company.schoolmanageapp.entity.Schedule;
import az.company.schoolmanageapp.mapper.ScheduleMapper;
import az.company.schoolmanageapp.repository.ScheduleRepository;
import az.company.schoolmanageapp.service.inter.ScheduleService;
import model.dto.ScheduleDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleServiceImpl implements ScheduleService {

    private ScheduleRepository scheduleRepository;
    private ScheduleMapper scheduleMapper;

    @Autowired
    public ScheduleServiceImpl(ScheduleRepository scheduleRepository, ScheduleMapper scheduleMapper) {
        this.scheduleRepository = scheduleRepository;
        this.scheduleMapper = scheduleMapper;
    }

    @Override
    public List<Object[]> getSchedule() {
        return scheduleRepository.findLessonSchedules();
    }

    @Override
    public List<ScheduleDto> getAllSchedule() {
        List<Schedule> schedule = scheduleRepository.findAll();
        List<ScheduleDto> result = scheduleMapper.toDto(schedule);
        return result;
    }

//    @Override
//    public void addSchedule(Schedule schedule) {
//        scheduleRepository.save(schedule);
//    }
}
