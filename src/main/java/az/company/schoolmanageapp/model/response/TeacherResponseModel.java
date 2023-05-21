package az.company.schoolmanageapp.model.response;

import lombok.Data;


@Data
public class TeacherResponseModel {
    private Integer id;
    private String name;
    private String surname;
    private LessonResponseModel lesson;
}