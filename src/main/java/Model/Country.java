package Model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="countries")
public class Country implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 7689790015584211470L;

	@Id
    @Column(name = "country_id")
    private String id;

    @Column(name = "country_name")
    private String Name;

    @ManyToOne
    @JoinColumn(name = "region_id")
    private int regionId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getRegionId() {
        return regionId;
    }

    public void setRegionId(int regionId) {
        this.regionId = regionId;
    }


}
