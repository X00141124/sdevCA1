package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Department extends Model{

    @Id
    private Long id;
    @Constraints.Required
    private String depName;   
 
    @OneToMany(cascade = CascadeType.ALL)
    private List<Employee> elist = new ArrayList<>();

    public Department() {
    }

    public Department(Long id, String deptName) {
        this.id = id;
        this.depName = deptName;
    }

    public static final Finder<Long, Department> find = new Finder<>(Department.class);

    public static final List<Department> findAll() {
        return Department.find.all();
    }

    public String getDeptName() {
        return depName;
    }

    public void setDeptName(String deptName) {
        this.depName = deptName;
    }

    public Long getDeptID() {
        return id;
    }

    public void setDeptID(Long deptID) {
        this.id = deptID;
    }

    public List<Employee> getElist() {
        return elist;
    }

    public void setElist(List<Employee> elist) {
        this.elist = elist;
    }
}