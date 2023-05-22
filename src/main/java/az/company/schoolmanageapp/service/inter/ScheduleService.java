package az.company.schoolmanageapp.service.inter;

import az.company.schoolmanageapp.entity.Schedule;
import az.company.schoolmanageapp.model.dto.ScheduleDto;

import java.util.List;

public interface ScheduleService {

    List<Object[]> getSchedule();
    List<ScheduleDto> getAllSchedule();
    ScheduleDto findById(Integer id);
    Schedule getScheduleById(Integer id);
    void addSchedule(ScheduleDto schedule);
    void updateSchedule(ScheduleDto schedule);
    void removeSchedule(Integer scheduleId);
}
