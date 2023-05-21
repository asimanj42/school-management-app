package model.response;

import lombok.Data;


@Data
public class ComplaintResponseModel {
    private Integer id;
    private StudentResponseModel student;
    private String complaintText;
}