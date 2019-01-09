public class Employee {
    private String firstName;
    private String lastName;

    private double salary;

    public Employee(String firstName, String lastName, double salary){
        this.firstName=firstName;
        this.lastName=lastName;
        this.salary=salary;
    }

    public String getFirstName(){
        return firstName;
    }

    public void  setFirstName(){
        this.firstName= firstName;
    }

    public String getlastName(){
        return lastName;
    }

    public void  setlastName(){
        this.lastName= lastName;
    }

    public double getSalary(){
        return salary;
    }

    public void  setSalary(){
        this.salary = salary;
    }
}
