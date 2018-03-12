package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Employee extends Model {
    
        // Properties
        @Id
        private Long id;
        // many to many mapping 
        @ManyToMany(cascade = CascadeType.ALL, mappedBy = "employees")
        public List<Project> projects;

        private String name;

        @OneToOne(cascade = CascadeType.REMOVE)
        private Address address;

        @Constraints.Required
        @ManyToOne
        private Department department;

        //private List<Project> pList = new ArrayList<>();

        public List<Long> proSelect = new ArrayList<Long>();

        public static final Finder<Long, Employee> find = new Finder<>(Employee.class);
        
        public static final List<Employee> findAll() { 
            
            return Employee.find.all();
        }

        // Default Constructor
        public Employee() {
        }
    
        // Constructor to initialise object
        
        public Employee(Long id, String name, Department department) {
            this.id = id;
            this.name = name;
            this.department = department;
        }
    
        // Accessor methods
        public Long getId() {
            return id;
        }
        public void setId(Long id) {
            this.id = id;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        // public List<Project> getpList() {
        //     return pList;
        // }
        // public void setpList(List<Project> pList) {
        //     this.pList = pList;
        // }
        public List<Long> getProSelect() {
            return proSelect;
        }
        public Address getAddress() {
            return address;
        }
        public void setAddress(Address address) {
            this.address = address;
        }
        public Department getDepartment() {
            return department;
        }
        public void setDepartment(Department department) {
            this.department = department;
        }

        public void setProjects(List<Project> projects){
            this.projects=projects;
        }
        public List<Project> getProjects() {
            return this.projects;
        }
    }
    