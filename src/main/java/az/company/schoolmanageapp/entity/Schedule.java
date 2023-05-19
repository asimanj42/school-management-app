package az.company.schoolmanageapp.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "schedule")
public class Schedule implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "day_of_week")
    private int dayOfWeek;
    @Basic(optional = false)
    @Column(name = "start_time")
    @Temporal(TemporalType.TIME)
    private Time startTime;
    @Basic(optional = false)
    @Column(name = "end_time")
    @Temporal(TemporalType.TIME)
    private Time endTime;
    @Column(name = "classroom")
    private String classroom;
    @JoinColumn(name = "lesson_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Lessons lessonId;

    public Schedule() {
    }

    public Schedule(Integer id) {
        this.id = id;
    }

    public Schedule(Integer id, int dayOfWeek, Time startTime, Time endTime) {
        this.id = id;
        this.dayOfWeek = dayOfWeek;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(int dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public Lessons getLessonId() {
        return lessonId;
    }

    public void setLessonId(Lessons lessonId) {
        this.lessonId = lessonId;
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
        if (!(object instanceof Schedule)) {
            return false;
        }
        Schedule other = (Schedule) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
//
//    @Override
//    public String toString() {
//        return "Schedule[ id=" + id + " ]";
//    }

}
