package Honyar;

import java.util.Scanner;

public class Employee {
    
    private String first_name;
    private String last_name;
    private double monthly_salary;
    private boolean ML_is_valid=true;
    
    public Employee(String first_name,String last_name,double monthly_salary){

        this.first_name=first_name;
        this.last_name=last_name;
        if(monthly_salary>=0){
            this.monthly_salary=monthly_salary;
        }
        else{
        ML_is_valid=false;
        }
    }
    
    public void setfname(String first_name){
        this.first_name=first_name;
    }
    
    public String getfname(){
        return first_name;
    }
    
    public void setlname(String last_name){
        this.last_name=last_name;
    }
    
    public String getlname(){
        return last_name;
    }
    
    public void setmsalary(Double monthly_salary){
        if(monthly_salary>=0){
            this.monthly_salary=monthly_salary;
        }
        else{
            ML_is_valid=false;
        }
    }
    
    public double getmsalary(){
        return monthly_salary;
    }
    
    public double yearlysalary(double msalary){
        if(ML_is_valid){
            return msalary * 12;
        }
        return 0;
    }
    
    public double raisedyearlysalary(double ysalary){
        double increasedratio=0.1 * ysalary;
        return ysalary + increasedratio;
    }
    
    public void input(){
        Scanner input=new Scanner(System.in);
        System.out.println("firstname:");
        String fname=input.nextLine();
        System.out.println("lastname:");
        String lname=input.nextLine();
        System.out.println("monthly salary:");
        double msalary=input.nextInt();
        
        setfname(fname);
        setlname(lname);
        setmsalary(msalary);
    }
    
    public void display1(){
        if(ML_is_valid){
            System.out.println(getfname()+" "+getlname()+"\t"+yearlysalary(monthly_salary));
        }
        else{
            System.out.println(getfname()+" "+getlname()+"\t"+yearlysalary(monthly_salary));
            System.out.println("error, invalid value");
        }
    }
    
    public void display2(){
        if(ML_is_valid){
            System.out.println(getfname()+" "+getlname()+"\t"+raisedyearlysalary(yearlysalary(monthly_salary)));
        }
        else{
            System.out.println(getfname()+" "+getlname()+"\t"+raisedyearlysalary(yearlysalary(monthly_salary)));
            System.out.println("error, invalid value");
        
    }
    }
}
