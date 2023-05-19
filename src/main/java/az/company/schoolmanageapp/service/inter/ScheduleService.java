package az.company.schoolmanageapp.service.inter;

import az.company.schoolmanageapp.entity.Schedule;

import java.util.List;

public interface ScheduleService {

    List<Object[]> getSchedule();

    void addSchedule(Schedule schedule);
}
