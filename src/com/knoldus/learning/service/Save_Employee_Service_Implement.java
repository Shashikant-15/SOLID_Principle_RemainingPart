package com.knoldus.learning.service;

import com.knoldus.learning.entity.Employee;
import java.util.HashMap;
import java.util.Map;

    /**
    *To implement Save_Employee_Service with Save_Employee_Service_Implement class
    */
public class Save_Employee_Service_Implement implements Save_Employee_Service {

    Map<Integer,Employee> employeeMap = new HashMap<>();
    
    /**
     * Creates a new saveEmployee to save employee details.
     * @param employee associated with Save employee 
     */
    @Override
    public void saveEmployee(Employee employee) {
        employeeMap.put(employee.getId(),employee);
    }
    /**
    *To get Numbers of employed 
    */
    @Override
    public int getEmployeeCount() {
        return employeeMap.size();
    }

}
