package chatcom.model;
// Generated 17-mar-2018 13.20.00 by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Chatgroup generated by hbm2java
 */
@Entity
@Table(name="chatgroup"
    ,catalog="chatcom"
)
@XmlRootElement
public class Chatgroup  implements java.io.Serializable {


     private Integer id;
     private String name;
     private Date dateEnd;
     private Date dateStart;
     //private Set<Instance> instances = new HashSet<Instance>(0);

    public Chatgroup() {
    }
	
    public Chatgroup(String name, Date dateEnd, Date dateStart) {
        this.name = name;
        this.dateEnd = dateEnd;
        this.dateStart = dateStart;
    }
    
    /*public Chatgroup(String name, Date dateEnd, Date dateStart, Set<Instance> instances) {
       this.name = name;
       this.dateEnd = dateEnd;
       this.dateStart = dateStart;
       this.instances = instances;
    }*/
    
   
     @Id @GeneratedValue(strategy=IDENTITY)
   
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="name", nullable=false, length=100)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="date_end", nullable=false, length=19)
    public Date getDateEnd() {
        return this.dateEnd;
    }
    
    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="date_start", nullable=false, length=19)
    public Date getDateStart() {
        return this.dateStart;
    }
    
    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

/*@OneToMany(fetch=FetchType.LAZY, mappedBy="chatgroup")
    public Set<Instance> getInstances() {
        return this.instances;
    }
    
    public void setInstances(Set<Instance> instances) {
        this.instances = instances;
    }*/




}


