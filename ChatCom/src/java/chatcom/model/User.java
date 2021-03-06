package chatcom.model;
// Generated 17-mar-2018 13.20.00 by Hibernate Tools 4.3.1


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
import javax.persistence.UniqueConstraint;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name="user"
    ,catalog="chatcom"
    , uniqueConstraints = {@UniqueConstraint(columnNames="nickname"), @UniqueConstraint(columnNames="email")} 
)@XmlRootElement

public class User  implements java.io.Serializable {


     private Integer id;
     private String nickname;
     private String email;
     private String firstname;
     private String lastname;
     private String password;
     //private Set<Instance> instances = new HashSet<Instance>(0);

    public User() {
    }

	
    public User(String nickname, String email, String firstname, String lastname, String password) {
        this.nickname = nickname;
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
        this.password = password;
    }
   /* public User(String nickname, String email, String firstname, String lastname, String password, Set<Instance> instances) {
       this.nickname = nickname;
       this.email = email;
       this.firstname = firstname;
       this.lastname = lastname;
       this.password = password;
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

    
    @Column(name="nickname", unique=true, nullable=false, length=100)
    public String getNickname() {
        return this.nickname;
    }
    
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    
    @Column(name="email", unique=true, nullable=false, length=100)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    
    @Column(name="firstname", nullable=false, length=100)
    public String getFirstname() {
        return this.firstname;
    }
    
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    
    @Column(name="lastname", nullable=false, length=100)
    public String getLastname() {
        return this.lastname;
    }
    
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

/*@OneToMany(fetch=FetchType.LAZY, mappedBy="user")
    public Set<Instance> getInstances() {
        return this.instances;
    }
    
    public void setInstances(Set<Instance> instances) {
        this.instances = instances;
    }*/

    @Column(name="password", nullable=false, length=200)
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}


