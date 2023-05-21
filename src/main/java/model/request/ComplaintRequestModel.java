package model.request;

import lombok.Data;


@Data
public class ComplaintRequestModel {
    private Integer id;
    private StudentRequestModel student;
    private String complaintText;
}