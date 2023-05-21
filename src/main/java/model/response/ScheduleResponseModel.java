package model.response;

import lombok.Data;

import java.time.LocalTime;


@Data
public class ScheduleResponseModel {
    private final Integer id;
    private final LessonResponseModel lesson;
    private final Integer dayOfWeek;
    private final LocalTime startTime;
    private final LocalTime endTime;
    private final String classroom;
}