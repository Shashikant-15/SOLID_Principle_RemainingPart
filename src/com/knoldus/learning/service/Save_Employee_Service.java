package com.knoldus.learning.service;

import com.knoldus.learning.entity.Employee;

public interface Save_Employee_Service {
    /**
     * used to Save Employee Services
     * @param employee arguments passes to method for saveEmployee
     */
    void saveEmployee(Employee employee);

    int getEmployeeCount();
}
