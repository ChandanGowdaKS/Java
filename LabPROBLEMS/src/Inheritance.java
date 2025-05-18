/* Recognize the type of inheritance in the below Figure 1. Illustrate the same in a Java program with
appropriate methods. Data members are present in the Figure 1. Create accessors and mutators for
managing the employee data. Demonstrate the concepts: super keyword, function overriding,
different types of constructors, restrict a method to be overridden and restrict one of the class to be
        inherited.
*/

class Employee{
    int id;
    String name;
    String position;

    // default constructor
    public Employee(){
        System.out.println("Default constructor calling");
    }
    // parameterized constructor
    public Employee(int id, String name, String position){
        this.id = id;
        this.name = name;
        this.position =position;
    }

    // getter setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    public void display(){
        System.out.println("id: "+ id + "\nname : "+ name +
                "\nposition : "+ position);
    }
}

class manager extends Employee{
    String department;
    int employeeid;

    public manager(int id, String name, String position,String department, int employeeid){
        super(id,name,position);
        this.department = department;
        this.employeeid = employeeid;
    }
    // getter setter
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }
    public void display(){
        super.display();
        System.out.println("department : "+department+"\nEmployee id : "+employeeid);
    }
}

class intern extends Employee{
    int employeeid;
    String university;

    public intern(int id, String name, String position, int employeeid, String university){
        super(id,name,position);
        this.employeeid =employeeid;
        this.university = university;
    }

    //getter setter

    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid){
        this.employeeid = employeeid;
    }

    public String getUniversity() {
        return university;
    }
    public void setUniversity(String university){
        this.university = university;
    }
    final public void display(){
        super.display();
        System.out.println("Employee_id : "+employeeid+"\n University : "+university);
    }
}

final class hr_manager extends manager{
    String hr_policy;
    int managerid;

    public hr_manager(int id, String name, String position, String department, int employeeid,
                      String hr_policy, int managerid){
        super(id,name,position,department,employeeid);
        this.hr_policy = hr_policy;
        this.managerid = managerid;
    }
    //getter setter

    public String  gethrpolicy(){
        return hr_policy;
    }
    public void setHr_policy(String hr_policy){
        this.hr_policy = hr_policy;
    }
    public int getManagerid(){
        return managerid;
    }
    public void setManagerid(int managerid){
        this.managerid =managerid;
    }
    final public void display(){
        super.display();
        System.out.println("Hr_policy : "+hr_policy+"\nmanager_id : "+managerid);
    }
}
class tech_lead extends manager{
    int managerid;
    String tech_stack;

    public tech_lead(int id, String name, String position, String department,
                     int employeeid, int mangerid, String tech_stack){
        super(id,name,position,department,employeeid);
        this.managerid =mangerid;
        this.tech_stack = tech_stack;
    }
    //getter setter
    public int getManagerid() {
        return managerid;
    }

    public void setManagerid(int managerid) {
        this.managerid = managerid;
    }

    public String getTech_stack() {
        return tech_stack;
    }

    public void setTech_stack(String tech_stack) {
        this.tech_stack = tech_stack;
    }

    public void display(){
        super.display();
        System.out.println("MangerId : "+managerid+"\nTech Stack : "+tech_stack);
        }
}


public class Inheritance {
    public static void main(String[] args) {
        hr_manager hrobj = new hr_manager(1,"chandu","Hr Manager","CS",101,"Lifetime",201);
        tech_lead techobj = new tech_lead(2,"chandu2","Tech Laed","Cs",102,202,"Web development");
        intern interobj =new intern(3,"chandu3","Intern",103,"BMSCE");

        System.out.println("-------HR Manger-------");
        hrobj.display();

        System.out.println("--------Tech lead -----------");
        techobj.display();

        System.out.println("--------- internobj ----------");
        interobj.display();
    }
}
