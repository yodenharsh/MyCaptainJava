import java.util.*;
public class employeeDetails {
    public static void main(String []args)
    {
        String name, address;
        int yearOfJoining, salary;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee's name");
        name = sc.nextLine();
        System.out.println("Enter employee's address");
        address = sc.nextLine();
        System.out.println("Enter their year of joining");
        yearOfJoining = sc.nextInt();
        System.out.println("Enter salary of employee (In Rupees)");
        salary = sc.nextInt();
        employee obj = new employee(name, address, yearOfJoining, salary);
        sc.close();
    }
}

class employee {
    employee(String name, String address, int yearOfJoining, int salary)
    {
        System.out.println("Employee's name : "+name);
        System.out.println("Employee's address : "+address);
        System.out.println("Employee's year of joining : "+yearOfJoining);
        System.out.println("Employee's salary : "+salary+ " rupees");
    }
}