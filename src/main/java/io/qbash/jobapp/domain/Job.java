package io.qbash.jobapp.domain;

import java.util.HashSet;
import java.util.Set;

public class Job {

    private long id;
    private String description;
    private String date;
    private Set<Person> people = new HashSet<>();

    public Job() {
    }

    public Job(String description, String date) {
        this.description = description;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Set<Person> getPeople() {
        return people;
    }

    public void setPeople(Set<Person> people) {
        this.people = people;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Job job = (Job) o;

        return id == job.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }

    @Override
    public String toString() {
        return "Job{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", date='" + date + '\'' +
                ", people=" + people +
                '}';
    }
}
