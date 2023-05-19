package az.company.schoolmanageapp.entity;


import jakarta.persistence.*;

import java.io.Serializable;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "complaint")
public class Complaint implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Lob
    @Column(name = "complaint_text")
    private String complaintText;
    @JoinColumn(name = "student_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Students studentId;
    @JoinColumn(name = "teacher_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Teacher teacherId;

    public Complaint() {
    }

    public Complaint(Integer id) {
        this.id = id;
    }

    public Complaint(Integer id, String complaintText) {
        this.id = id;
        this.complaintText = complaintText;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getComplaintText() {
        return complaintText;
    }

    public void setComplaintText(String complaintText) {
        this.complaintText = complaintText;
    }

    public Students getStudentId() {
        return studentId;
    }

    public void setStudentId(Students studentId) {
        this.studentId = studentId;
    }

    public Teacher getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Teacher teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Complaint)) {
            return false;
        }
        Complaint other = (Complaint) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
//
    @Override
    public String toString() {
        return "Complaint[ id=" + id +
                "text:"+complaintText +  "]";
    }

}
