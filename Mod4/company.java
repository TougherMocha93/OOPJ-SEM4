package JavaCourseAKS.Mod4;

class Member {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    public void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member {
    String specialization;
}

class Manager extends Member {
    String department;
}

public class company {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.name = "John Doe";
        emp.age = 25;
        emp.phoneNumber = "555-1234";
        emp.address = "123 Main St, Anytown USA";
        emp.salary = 50000.0;
        emp.specialization = "Java Programming";

        Manager mgr = new Manager();
        mgr.name = "Jane Smith";
        mgr.age = 35;
        mgr.phoneNumber = "555-5678";
        mgr.address = "456 Broad St, Anytown USA";
        mgr.salary = 80000.0;
        mgr.department = "Information Technology";

        System.out.println("Employee: " + emp.name);
        System.out.println("Age: " + emp.age);
        System.out.println("Phone number: " + emp.phoneNumber);
        System.out.println("Address: " + emp.address);
        emp.printSalary();
        System.out.println("Specialization: " + emp.specialization);

        System.out.println();

        System.out.println("Manager: " + mgr.name);
        System.out.println("Age: " + mgr.age);
        System.out.println("Phone number: " + mgr.phoneNumber);
        System.out.println("Address: " + mgr.address);
        mgr.printSalary();
        System.out.println("Department: " + mgr.department);
    }
}

