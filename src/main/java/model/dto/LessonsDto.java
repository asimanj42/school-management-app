package model.dto;

import lombok.Data;
import lombok.Value;

import java.io.Serializable;
import java.util.List;

@Data
public class LessonsDto {
    Integer id;
    String name;
//    List<ScheduleDto> scheduleList;
}