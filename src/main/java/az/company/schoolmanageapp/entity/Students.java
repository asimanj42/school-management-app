package az.company.schoolmanageapp.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

/**
 * @author ASUS
 */
@Entity
@Table(name="students")
public class Students  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "surname")
    private String surname;
    @Basic(optional = false)
    @Column(name = "course")
    private int course;
    @Basic(optional = false)
    @Column(name = "absent_count")
    private int absentCount;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "studentId")
    private List<Complaint> complaintList;
    @JoinColumn(name = "speciality_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Specialization specialityId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "studentId")
    private List<Grades> gradesList;



    public Students() {
    }

    public Students(Integer id) {
        this.id = id;
    }

    public Students(Integer id, String name, String surname, int grade, int absentCount) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.absentCount = absentCount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getAbsentCount() {
        return absentCount;
    }

    public void setAbsentCount(int absentCount) {
        this.absentCount = absentCount;
    }

    public List<Complaint> getComplaintList() {
        return complaintList;
    }

    public void setComplaintList(List<Complaint> complaintList) {
        this.complaintList = complaintList;
    }

    public Specialization getSpecialityId() {
        return specialityId;
    }

    public void setSpecialityId(Specialization specialityId) {
        this.specialityId = specialityId;
    }

    public List<Grades> getGradesList() {
        return gradesList;
    }

    public void setGradesList(List<Grades> gradesList) {
        this.gradesList = gradesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Students)) {
            return false;
        }
        Students other = (Students) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

//    @Override
//    public String toString() {
//        return "Students{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", surname='" + surname + '\'' +
//                ", course=" + course +
//                ", absentCount=" + absentCount +
//                '}';
//    }
}
