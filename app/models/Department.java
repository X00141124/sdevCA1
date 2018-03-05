package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Department extends Model{

    @Id
    private int did;
    @Constraints.Required
    private String depName;   
 
    @OneToMany(cascade = CascadeType.ALL)
    private List<Employee> elist = new ArrayList<>();

    public Department() {
    }

    public Department(String deptName) {
        this.depName = deptName;
    }

    public String getDeptName() {
        return depName;
    }

    public void setDeptName(String deptName) {
        this.depName = deptName;
    }

    public int getDeptID() {
        return did;
    }

    public void setDeptID(int deptID) {
        this.did = deptID;
    }

    public List<Employee> getElist() {
        return elist;
    }

    public void setElist(List<Employee> elist) {
        this.elist = elist;
    }
}