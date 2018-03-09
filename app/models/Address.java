package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Address extends Model{
    @Id
    private Long id;

    private String street;

    private String eirCode;

    private String country;

    // private Employee employee;

    public Address() {
    }

    public Address(Long id, String street, String eirCode, String country) {
        this.id = id;
        this.street = street;
        this.eirCode = eirCode;
        this.country = country;
    }
    

    public static final Finder<Long, Address> find = new Finder<>(Address.class);

    
    public static final List<Address> findAll() {
        return Address.find.all();
    }

    public Long getId() {
        return this.id;
    }

    public String getStreet() {
        return this.street;
    }
    
    public String getEirCode() {
        return eirCode;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setEirCode(String eirCode) {
        this.eirCode = eirCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    // public void setEmployee(Employee employee){
    //     this.employee=employee;
    //     employee.setAddress(this);
    // }
    // public Employee getEmployee() {
    //     return this.employee;
    // }


    public static Map<String, String> options() {
        LinkedHashMap<String, String> options = new LinkedHashMap();

        for (Address a: Address.findAll()) {
            options.put(a.getId().toString(), a.getStreet());
        }
        
        return options;
    }
}