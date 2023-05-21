package model.dto;

import az.company.schoolmanageapp.entity.Lessons;
import lombok.Data;
import lombok.Value;

import java.io.Serializable;
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