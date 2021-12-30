package com.knoldus.learning.service;

import com.knoldus.learning.entity.Employee;
/**
 * Represents a Employee Service Vallidation in EmployeeService.
 * A ClassRoom can have different entity such as roomId.
 */
public class LetsValidate_Employee_Service_Implement implements LetsValidate_EmployeeService {
    /**
     * used to Validate_Employee_Services
     * @param e arguments passes to method for Employee
     */
    @Override
    public boolean validateEmployee(Employee e) {
        if( e.getId() <= 0){
            return false;
        }
        return e.getName() != null && !e.getName().isEmpty(); // outcomes return
    }
}
