package uk.axone.devintest.objects;

public class EmployeeTest {

    String str;
    int i =0;

    public static void main(String[] args) {
        //str = "Dev In Test";
        Employee ram = new Employee();
        ram.name = "Ram D";
        ram.empID = 1234;
        ram.gender = "male";

        Employee karthik = new Employee();
        karthik.name = "Karthik G";
        karthik.empID = 5678;
        karthik.gender = "male";

        Employee[] myStaff = new Employee[100];
    }
}
