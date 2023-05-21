package model.request;

import lombok.Data;

import java.util.List;


@Data
public class SpecializationRequestModel {
    private Integer id;
    private String specialityName;
    private List<LessonRequestModel> lessonsList;
    private List<StudentRequestModel> studentsList;
}