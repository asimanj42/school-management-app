package az.company.schoolmanageapp.model.response;

import lombok.Data;

import java.util.List;


@Data
public class SpecializationResponseModel {
    private Integer id;
    private String specialityName;
    private List<LessonResponseModel> lessonsList;
    private List<StudentResponseModel> studentsList;
}