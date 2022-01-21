public class Employee {
    String name;
    float salary;
    int weekHours;
    int hireYear;

    Employee(String name, int salary, int weekHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.weekHours = weekHours;
        this.hireYear = hireYear;
    }

    float tax() {
        if (this.salary <= 1000)
            return 0;
        else return  (this.salary * 0.03f);
    }
    int bonus(){
        int result = 0;
        if(this.weekHours >= 40){
            for(int i = 40; i< this.weekHours;i++)
                result += 30;
        }
        return result;
    }
    int raiseSalary (){
        int now  = 2021;
        if(now - this.hireYear <10 )
            return (int) (this.salary*0.05);
        else if(now - this.hireYear >= 10 && now -this.hireYear < 20 )
            return (int) (this.salary*0.1);
        else
            return (int) (this.salary*0.15);
    }
    public String toString(){
        return "Employee's name is  \t\t\t\t\t: " + this.name + "\n" +
        "Employee's salary is  \t\t\t\t\t: " + this.salary + "\n" +
        "Employee's working hour is  \t\t\t: " + this.weekHours + "\n" +
        "Starting year of employee is  \t\t\t: " + this.hireYear + "\n" +
        "Employee's tax is  \t\t\t\t\t\t: " + tax() + "\n" +
        "Employee's bonus salary is  \t\t\t: " + bonus() + "\n" +
        "Employee's raise is  \t\t\t\t\t: " + raiseSalary() + "\n" +
        "Employee's total salary(with T/B) is  \t: " + (this.salary + bonus() - tax()) + "\n" +
        "Employee's total salary is  \t\t\t: " + (this.salary + raiseSalary()) + "\n" +
        "============================";
    }

}
