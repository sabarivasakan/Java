/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_3;
import java.util.Scanner;
/**
 *
 * @author 25ucs114
 */
class Ex_3{
    String emp_name,address,mail,phone,emp_id,Programmer,designation;
    double bp,da,hra,gp,pf,staff,np;

    /**
     * @param args the command line arguments
     */
    void input(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Employee Name : ");
        emp_name=scan.nextLine();
        System.out.print("Employee id   : ");
        emp_id=scan.nextLine();
        System.out.print("Mail id       : ");
        mail=scan.nextLine();
        System.out.print("Mopile Number : ");
        phone=scan.nextLine();
        System.out.print("Basic Pay     : ");
        bp=scan.nextDouble();
    }
    void output(){
        System.out.println("Employee Name  : "+emp_name);
        System.out.println("Employee id    : "+emp_id);
        System.out.println("Mail id :      : "+mail);
        System.out.println("Mopile Number  : "+phone);
        System.out.println("Basic Pay      : "+bp);
        System.out.println("Employee DA    : "+emp_name);
        System.out.println("Employee HRA   : "+emp_id);
        System.out.println("Gross Salary   : "+mail);
        System.out.println("Provident Fund : "+phone);
        System.out.println("Staff Club     : "+bp);
        
    }

    
    
    class Programmer1 extends Ex_3{
        void Programmer(){
            designation="Programmer";
        }
        void programmerSalary(){
        da=bp*(97/100);
        hra=bp*(10/100);
        gp=bp+da+hra;
        pf=bp*(12/100);
        staff=bp*(1/100);
        np=gp-(pf+staff);
        }
        
    }
    public class salary{
        public static void main(String[] args){
        // TODO code application logic here
            Ex_3.Programmer1 obj=new Ex_3;
            obj.input();
            obj.output();
    }
    }
    
     
    }
