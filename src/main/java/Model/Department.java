package Model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="departments")
public class Department implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = -2181642291901768993L;

	@Id
    @Column(name = "department_id")
    private int id;

    @Column(name = "department_name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "manager_id")
    private int managerId;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private int locationID;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public int getLocationID() {
        return locationID;
    }

    public void setLocationID(int locationID) {
        this.locationID = locationID;
    }

}
