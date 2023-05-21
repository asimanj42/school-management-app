package model.request;

import lombok.Data;


@Data
public class TeacherRequestModel {
    private Integer id;
    private String name;
    private String surname;
    private LessonRequestModel lesson;
}