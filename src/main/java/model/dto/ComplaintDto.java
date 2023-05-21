package model.dto;

import lombok.Data;
import lombok.Value;

import java.io.Serializable;


@Data
public class ComplaintDto {
    Integer id;
    String complaintText;
    StudentsDto studentId;
    TeacherDto teacherId;
}