package az.company.schoolmanageapp.service.inter;

import az.company.schoolmanageapp.entity.Schedule;
import model.dto.LessonsDto;
import model.dto.ScheduleDto;

import java.util.List;

public interface ScheduleService {

    List<Object[]> getSchedule();
    List<ScheduleDto> getAllSchedule();
//    void addSchedule(Schedule schedule);
}
