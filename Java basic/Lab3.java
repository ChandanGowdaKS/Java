import java.util.Scanner;


class Employee {
    int id;
    String name, position;

    Scanner read = new Scanner(System.in);

    Employee
            () {
        id = 1234;
        name = "abcd";
        position = "not_prferable_to say";
    }

    Employee(int id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    void read() {
        System.out.println("Please enter your Name ");
        name = read.nextLine();
        System.out.println("Please enter Your ID: ");
        id = read.nextInt();
        // Scanner.nextLine();
        System.out.println("Please Type your Position: ");
        position = read.nextLine();
        //Scanner.nextLine();

    }

    void display() {
        System.out.println("Name :" + name);
        System.out.println("The id is :" + id);
        System.out.println("Your position is :" + position);


    }
}

class manager extends Employee{
    int id, employee_id;
    String department;

    manager(int id , int employee_id , String department){
        this.id = id;
        this.employee_id = employee_id;
        this.department = department;
    }
    void read(){
        System.out.println("Please enter Your ID: ");
        id = read.nextInt();
        System.out.println("Please enter Your employee-ID: ");
        employee_id = read.nextInt();
        System.out.println("Please enter Your Department: ");
        department = read.nextLine();
    }
    void display(){
        System.out.println("Your id is :"+id);
        System.out.println("The employee-Id  is :" + employee_id);
        System.out.println("Your position is :" + position);
    }
}
class intern extends Employee{
    int id,employee2_id;
    String university;

    intern(int id , int employee2_id , String university) {
        this.id = id;
        this.employee2_id = employee2_id;
        this.university = university;
    }
    void read(){
        System.out.println("Please enter Your ID: ");
        id = read.nextInt();
        System.out.println("Please enter Your employee-ID: ");
        employee2_id = read.nextInt();
        System.out.println("Please enter Your university: ");
        university = read.nextLine();
    }
    void display(){
        System.out.println("Your id is :"+id);
        System.out.println("The employee-Id  is :" + employee2_id);
        System.out.println("Your position is :" + university);
    }
}
class
public class Lab3 {
    public static void main(String[] args){
        Employee L1 = new Employee(12,22,"Super");

        L1.display();
    }

}

