package az.company.schoolmanageapp.service.impl;

import az.company.schoolmanageapp.entity.Schedule;
import az.company.schoolmanageapp.exception.ScheduleNotFoundException;
import az.company.schoolmanageapp.mapper.ScheduleMapper;
import az.company.schoolmanageapp.repository.ScheduleRepository;
import az.company.schoolmanageapp.service.inter.ScheduleService;
import az.company.schoolmanageapp.model.dto.ScheduleDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ScheduleServiceImpl implements ScheduleService {

    private final ScheduleRepository scheduleRepository;
    private final ScheduleMapper scheduleMapper;

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
        List<Schedule> schedules = scheduleRepository.findAll();
        List<ScheduleDto> result = scheduleMapper.toDto(schedules);
        return result;
    }

    @Override
    public ScheduleDto findById(Integer id) {
        Schedule schedule = getScheduleById(id);
        return scheduleMapper.toDto(schedule);
    }

    @Override
    public Schedule getScheduleById(Integer id) {
        Optional<Schedule> schedule = scheduleRepository.findById(id);
        if (schedule.isPresent()) {
            return (schedule.get());
        }
        throw new ScheduleNotFoundException("Schedule not found by id" + id);

    }


    @Override
    public void addSchedule(ScheduleDto schedule) {
        scheduleRepository.save(scheduleMapper.toEntity(schedule));
    }

    @Override
    public void updateSchedule(ScheduleDto schedule) {
        scheduleRepository.save(scheduleMapper.toEntity(schedule));
    }

    @Override
    public void removeSchedule(Integer scheduleId) {
        Schedule schedule = getScheduleById(scheduleId);
        scheduleRepository.delete(schedule);
    }
}
