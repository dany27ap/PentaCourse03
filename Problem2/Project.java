package com.dlegacy.course3.Problem2;

public class Project {
    private String name;
    private Integer capacity;

    public Project(String name, Integer capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Project " + name + " with capacity " + capacity.toString();
    }
}
