package az.company.schoolmanageapp.model.request;

import lombok.Data;

import java.time.LocalTime;


@Data
public class ScheduleRequestModel {
    private final Integer id;
    private final LessonRequestModel lesson;
    private final Integer dayOfWeek;
    private final LocalTime startTime;
    private final LocalTime endTime;
    private final String classroom;
}