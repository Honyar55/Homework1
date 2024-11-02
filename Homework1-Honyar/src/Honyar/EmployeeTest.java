
package Honyar;

import java.util.Scanner;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee a= new Employee("Honyar","Bahir", 2000);
        Employee b= new Employee("Shadman","Sirwan", 2500); /*these two intialize the instance variables*/
        
        System.out.println("Name\t\tyearly salary\n----\t\t-------------");
        a.display1();
        b.display1();
        System.out.println("-----------------------");
        System.out.println("10 percent salary raised ! yoohooo !");
        System.out.println("Name\t\tyearly salary\n----\t\t-------------");
        a.display2();
        b.display2();
        System.out.println();
        
        System.out.println("enter 1st employee informations:");
        a.input();
        System.out.println("enter 2nd employee informations:");
        b.input();
        System.out.println("Name\t\tyearly salary\n----\t\t-------------");
        a.display1();
        b.display1();
        System.out.println("-----------------------");
        System.out.println("10 percent salary raised ! yoohooo !");
        System.out.println("Name\t\tyearly salary\n----\t\t-------------");
        a.display2();
        b.display2();
    }
    
}
