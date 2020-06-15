package Model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="jobs")
public class Job implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 7739022790839708938L;

	@Id
    @Column(name = "job_id")
    private String jobId;

    @Column(name = "job_title")
    private String jobTitle;

    @Column(name = "min_salary")
    private double minimumSalary ;

    @Column(name = "max_salary")
    private double maximumSalary;


    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getMinimumSalary() {
        return minimumSalary;
    }

    public void setMinimumSalary(double minimumSalary) {
        this.minimumSalary = minimumSalary;
    }

    public double getMaximumSalary() {
        return maximumSalary;
    }

    public void setMaximumSalary(double maximumSalary) {
        this.maximumSalary = maximumSalary;
    }

}
