package Model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="regions")
public class Region implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = -6190402469299031585L;

	@Id
    @Column(name = "region_id")
    private int id;

    @Column(name = "region_name")
    private String regionName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }
}
