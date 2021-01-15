package com.codegym.model;



import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="student")
public class Subjects {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @OneToMany(targetEntity = Subjects.class)
    private Set<Subjects> employees;

    public Subjects() {
    }

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

    public Set<Subjects> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Subjects> employees) {
        this.employees = employees;
    }



}
