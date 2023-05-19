package az.company.schoolmanageapp.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalTime;


@Data
public class ScheduleDto {
    private final Integer id;
    private final LessonDto lesson;
    private final Integer dayOfWeek;
    private final LocalTime startTime;
    private final LocalTime endTime;
    private final String classroom;
}