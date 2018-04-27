/* 
 * To change this license header, choose License Headers in Project Properties. 
 * To change this template file, choose Tools | Templates 
 * and open the template in the editor. 
 */  
package oata;  
  
/** 
 * 
 * @author Krishna 
 */   
import java.util.Scanner;  
public class Employee{  
    String name;  
        int bonus;  
        long salary;  
        long totalsalary;  
        void accept()  
        {  
         Scanner s= new Scanner(System.in);  
         System.out.println("Enter Name of Employees\n");  
         name=s.nextLine();  
         System.out.println("Enter the Bonus of Employee\n");  
         bonus=s.nextInt();  
         System.out.println("Enter the Salary\n");  
         salary=s.nextInt();  
        }  
        void calctotal()  
        {  
            totalsalary=salary+bonus;  
        }  
        void print()  
        {  
            System.out.println("Name of Employee\n"+name);  
            System.out.println("Salary of Employee\n"+salary);  
            System.out.println("Bonus of Employee\n"+bonus);  
            System.out.println("Totalsalary of Employee\n"+totalsalary);  
        }  
           
      
  
    /** 
     * @param args the command line arguments 
     */  
    public static void main(String[] args) {  
          
        Employee emp = new Employee();  
        emp.accept();  
        emp.calctotal();  
        emp.print();  
        // TODO code application logic here  
    }  
      
}  