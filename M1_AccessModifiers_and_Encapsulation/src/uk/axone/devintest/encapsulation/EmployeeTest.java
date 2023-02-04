package uk.axone.devintest.encapsulation;

public class EmployeeTest {

    public static void main(String[] args) {

        //scenario 01 - Create a new employee
        //Employee newEmp = new Employee();
        /*newEmp.empName = "Ram D"; //information from the front-end UI
        newEmp.empID = "2345";
        newEmp.holidays = 34;
        newEmp.salary = 3947934;
        newEmp.age = 24;
        newEmp.save();*/

        /*newEmp.empName = "£$££nioerne3434";
        newEmp.empID = "@£$£$";
        newEmp.age = -678;
        newEmp.salary = - 9237904;
        newEmp.holidays = -89;
        newEmp.save();*/

        //scenario 01 - Create a new employee
        Employee newEmp = new Employee();
        newEmp.setEmpID("2345");
        newEmp.setEmpName("Ram D");
        newEmp.setHolidays(34);
        Employee.setEmployerName("AXONE");
        //All setter methods called
        newEmp.save();

        //Scenario 2 - Loading details for an existing employee
        Employee exisEmp = new Employee("3456");
        String name = exisEmp.getEmpName();
        int salary = exisEmp.getSalary();
        int holidays = exisEmp.getHolidays();

    }

}
