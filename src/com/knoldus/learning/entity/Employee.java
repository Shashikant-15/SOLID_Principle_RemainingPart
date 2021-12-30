package com.knoldus.learning.entity;
/**
 * Represents a Employee in the SOLID Principle.
 * A Employee can have different entity such as Id,name etc.
 */
public class Employee {
    
    int id;
    String name;
    
    /**
     *  Creates a new Employee with the given id & name..
     * @param i  This Employee's new ID. 
     * @param num This Employee's new name. 
     */
    public Employee(int i, String num) {
        this.id=i;
        this.name=num;
    }
      /**
     * Used getter and setter for Employee 
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
