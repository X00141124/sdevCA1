package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Project extends Model {
    @Id
    public Long id;
    
    @Constraints.Required
    public String name;

    @ManyToMany(cascade = CascadeType.ALL)
    public List<Product> projects;

    public static final Finder<Long, Project> find = new Finder<>(Project.class);

    public static final List<Project> findAll() {          
        return Project.find.all();
    }

    public Project() {
    }

    public Project(Long id, String name, List<Project> projects) {
        this.id = id;
        this.name = name;
        this.projects = projects;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Product> projects) {
        this.projects = projects;
    }

    public static Finder<Long, Project> find = new Finder<Long, Project>(Project.class);

    public static List<Category> findAll() {
        return Category.find.query().where().orderBy("name asc").findList();
    }

    public static Map<String, String> options() {
        LinkedHashMap<String, String> options = new LinkedHashMap();

        for (Category c: Category.findAll()) {
            options.put(c.getId().toString(), c.getName());
        }
        
        return options;
    }

    public static boolean inProject(Long emp, Long project) {
        return find.query().where()
        .eq("projects.id", project)
        .eq("id", emp)
        .findCount() > 0;
    }

}