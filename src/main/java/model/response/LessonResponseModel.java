package model.response;

import lombok.Data;


@Data
public class LessonResponseModel {
    private Integer id;
    private String name;
    private SpecializationResponseModel specialitization;
}