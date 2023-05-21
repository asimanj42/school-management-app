package model.request;

import lombok.Data;


@Data
public class LessonRequestModel {
    private Integer id;
    private String name;
    private SpecializationRequestModel specialitization;
}