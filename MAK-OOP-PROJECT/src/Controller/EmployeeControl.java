package Controller;

import Model.Employee;

public class EmployeeControl extends UserControl {
    private Employee employee;
    

    public Employee getEmployee() {
        return this.employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
