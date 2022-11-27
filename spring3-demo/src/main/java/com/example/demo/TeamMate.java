package com.example.demo;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class TeamMate {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private String skills;

    protected TeamMate() {
        this.id = null;
        this.name = null;
        this.skills = null;
    }

    public TeamMate(String name, String skills) {
        this();
        this.name = name;
        this.skills = skills;
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

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) 
            return true;
        if (o==null || getClass() != o.getClass())
            return false;
        TeamMate teamMate = (TeamMate) o;
        return Objects.equals(id, teamMate.id) && Objects.equals(name, teamMate.name)
                && Objects.equals(skills, teamMate.skills);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, skills);
    }

    @Override
    public String toString() {
        return "TeamMate{ id="+id+", name='"+name+"', skills="+skills+"}";
    }
}
