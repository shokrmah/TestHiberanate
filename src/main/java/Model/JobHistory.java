package Model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="job_history")
public class JobHistory implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 194466352645168805L;

	@EmbeddedId
    EmployeeStartDate id;

    @Column(name="end_date")
    private Date endDate;

    @ManyToOne
    @JoinColumn(name = "job_id")
    private int jobId;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private int departmentId;

    public EmployeeStartDate getId() {
        return id;
    }

    public void setId(EmployeeStartDate id) {
        this.id = id;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }


}

@Embeddable
class EmployeeStartDate implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -4585270449240482917L;

	@Column(name="employeeId")
    Integer id;

    @Column(name = "start_date")
    Date startDate;


    public EmployeeStartDate(Integer id, Date startDate) {
        this.id = id;
        this.startDate = startDate;
    }
}
