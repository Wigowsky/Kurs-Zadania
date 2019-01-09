class Company {
    public static void main(String[] args){
        Employee[] employees = new Employee[20];

        employees[0]= new Employee("Jan", "Nowak", 3500);
        employees[1]= new Employee("Kuba", "Nowik", 35000);
        employees[2]= new Employee("Buba", "Nołik", 5000);



        int employeeIndex = 0;
        System.out.println(employees[employeeIndex].getFirstName()+" "+
                employees[employeeIndex].getlastName()+": "+
                employees[employeeIndex].getSalary()+"zł");


        /*System.out.println(employees[20]);
        System.out.println("Ten tekst się nie wyświetli, bo nastąpił błąd programu");

        int employeeIndex = 4;
        System.out.println(employees[employeeIndex].getFirstName()+" "+
                employees[employeeIndex].getlastName()+": "+
                employees[employeeIndex].getSalary()+"zł");

                */

        int employeesSize = employees.length;
        System.out.println("Wielkość tablicy: " + employeesSize);
        System.out.println("Ostatni element tablicy to: " + employees[employeesSize - 1]);
    }
    }

