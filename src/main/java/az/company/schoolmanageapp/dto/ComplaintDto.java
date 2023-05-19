package az.company.schoolmanageapp.dto;

import lombok.Data;

import java.io.Serializable;


@Data
public class ComplaintDto {
    private Integer id;
    private StudentDto student;
    private String complaintText;
}