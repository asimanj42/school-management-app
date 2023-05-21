package az.company.schoolmanageapp.model.dto;

import lombok.Data;

import java.sql.Time;


@Data
public class ScheduleDto {
    Integer id;
    int dayOfWeek;
    Time startTime;
    Time endTime;
    String classroom;
    LessonsDto lessonId;
}