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

    @Constraints.Required
    private String name;


    @Constraints.Required
    private String eirCode;

    public Address() {
    }

    public Address(Long id, String name, String eirCode) {
        this.id = id;
        this.name = name;
        this.eirCode = eirCode;
    }

    public static final Finder<Long, Address> find = new Finder<>(Address.class);

    
    public static final List<Address> findAll() {
        return Address.find.all();
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
    
    public String getEirCode() {
        return eirCode;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void seteirCode(String eirCode) {
        this.eirCode = eirCode;
    }
}