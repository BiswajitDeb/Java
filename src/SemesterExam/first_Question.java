package SemesterExam;

import java.util.Scanner;

abstract class employee{
    Scanner sc = new Scanner(System.in);
    public int salary_input()
    {
        int salary;
        System.out.println("Enter salary : ");
        salary=sc.nextInt();
        return salary;
    }
    double monthly_salary ;


    public void setSalaryPerMonth(double monthly_salary) {
        this.monthly_salary = monthly_salary;
    }

    abstract double calNetSalary();

    @Override
    public String toString() {
        return "employee's salary is : '" + calNetSalary();
    }

    void infoDisplay() {
        System.out.println(toString());
    }

}


class DriveManager extends employee{

    double calNetSalary() {
        double result = monthly_salary * 12;
        return result ;
    }

    @Override
    public String toString() {
        return "DriveManager's newt salary is : " + calNetSalary();
    }

    @Override
    void infoDisplay() {
        System.out.println(toString());
    }

}

class ClerkManager extends employee{

    double calNetSalary() {
        double result = ((monthly_salary * 12)*118)/100;
        return result ;
    }

    @Override
    public String toString() {
        return "ClerkManager's net salary is : '" + calNetSalary();
    }

    @Override
    void infoDisplay() {
        System.out.println(toString());
    }

}

public class first_Question {

    public static void main(String[] args) {
        DriveManager manager = new DriveManager();
        manager.setSalaryPerMonth(manager.salary_input());
        manager.calNetSalary();
        manager.infoDisplay();
        ClerkManager clerk = new ClerkManager();
        clerk.setSalaryPerMonth(clerk.salary_input());
        clerk.calNetSalary();
        clerk.infoDisplay();
    }

}
