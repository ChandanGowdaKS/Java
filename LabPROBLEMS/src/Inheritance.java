/* Recognize the type of inheritance in the below Figure 1. Illustrate the same in a Java program with
appropriate methods. Data members are present in the Figure 1. Create accessors and mutators for
managing the employee data. Demonstrate the concepts: super keyword, function overriding,
different types of constructors, restrict a method to be overridden and restrict one of the class to be
        inherited.
*/

interface Hr_manager{
    public int id;
    String hr_policy;
    public int manager_id;

    public Hr_manager(){
        id = 101;
        
    }
}

interface tech_lead{
    int id;
    int manager_id;
    String tech_stack;
}

interface manager extends Hr_manager,tech_lead{
    int id;
    int employee_id;
    String university;
}

class employee implements manager{
    int id;
    String name;
    String position;
}

public class Inheritance {
}
