package uk.axone.devintest.encapsulation;

public class Employee {

    private String empID;
    private String empName;
    private int salary;
    private int holidays;
    private int age;

    private static String EmployerName;

    Employee(){

    }

    Employee(String empID){
        setEmpID(empID);
        load();
    }

    public static String getEmployerName() {
        return EmployerName;
    }

    public static void setEmployerName(String employerName) {
        EmployerName = employerName;
    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        //validations
        //throw Exception
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        //validations
        //thor exceptions
        this.empName = empName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getHolidays() {
        return holidays;
    }

    public void setHolidays(int holidays) {
        this.holidays = holidays;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    boolean save(){
        //validations
        //connect to the DB
        //insert a row in the EMPLOYEE table
        //INSERT INTO EMPLOPYEE (empID, empNam, salary, holidays, age);
        return false;
    }

    private void load(){
        //connect to the DB
        //retrives information for an existing employee
        //SELECT * from EMPLOYEE where EMP_ID = empID;
        //assign the values from the result to your variables
    }

}
