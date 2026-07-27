
import java.util.Scanner;
class Salary{
    String emp_name,address,mail,phone,emp_id,Programmer,designation;
    double bp,da,hra,gp,pf,staff,np;
    public void input(){
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
    public void output(){
        System.out.println("Employee Name  : "+emp_name);
        System.out.println("Employee id    : "+emp_id);
        System.out.println("Mail id :      : "+mail);
        System.out.println("Mopile Number  : "+phone);
        System.out.println("Basic Pay      : "+bp);
        System.out.println("Employee DA    : "+da);
        System.out.println("Employee HRA   : "+hra);
        System.out.println("Gross Salary   : "+gp);
        System.out.println("Provident Fund : "+pf);
        System.out.println("Staff Club     : "+staff); 
    }
}
    
class Programmer extends Salary{
    Programmer(){
    designation="Programmer";
    }
    public void programmerSalary(){
    da=bp*0.97;
    hra=bp*0.10;
    gp=bp+da+hra;
    pf=bp*0.12;
    staff=bp*0.01;
    np=gp-(pf+staff);
    }
        
    }
class AssociateProfessor extends Salary{
    AssociateProfessor(){
    designation="Programmer";
    }
    public void AssociateSalary(){
    da=bp*0.97;
    hra=bp*0.30;
    gp=bp+da+hra;
    pf=bp*0.12;
    staff=bp*0.10;
    np=gp-(pf+staff);
    }
        
    }
class AssistantProfessor extends Salary{
    AssistantProfessor(){
    designation="Programmer";
    }
    public void AssistantSalary(){
    da=bp*0.97;
    hra=bp*0.20;
    gp=bp+da+hra;
    pf=bp*0.12;
    staff=bp*0.05;
    np=gp-(pf+staff);
    }
        
    }
class Professor extends Salary{
    Professor(){
    designation="AssitantProfessor";
    }
    public void ProfessorSalary(){
    da=bp*0.97;
    hra=bp*0.40;
    gp=bp+da+hra;
    pf=bp*0.12;
    staff=bp*0.15;
    np=gp-(pf+staff);
    }
        
    }
public class Ex_3{
    public static void main(String[] args){
        System.out.println("1 - Programmer\n2- Assitant Professor\n3 - Associate Professor\n4-Professor");
        Scanner scan = new Scanner(System.in);
        int choice=scan.nextInt();
        switch(choice){
            case 1: 
                Programmer pro=new Programmer();
                pro.input();
                if (pro.bp>=15000&&pro.bp<=20000){
                    pro.programmerSalary();
                    pro.output();
                }
                else{
                    System.out.print(("Invalid Input!!!!"));
                }
                break;
            case 2: 
                AssistantProfessor Asprof=new AssistantProfessor();
                Asprof.input();
                if (Asprof.bp>30000&&Asprof.bp<=40000){
                    Asprof.AssistantSalary();
                    Asprof.output();
                }
                else{
                    System.out.print(("Invalid Input!!!!"));
                }
                break;
            case 3: 
                AssociateProfessor Aprof=new AssociateProfessor();
                Aprof.input();
                if (Aprof.bp>30000&&Aprof.bp<=40000){
                    Aprof.AssociateSalary();
                    Aprof.output();
                }
                else{
                    System.out.print(("Invalid Input!!!!"));
                }
                break;
            case 4: 
                Professor prof=new Professor();
                prof.input();
                if (prof.bp>40000){
                    prof.ProfessorSalary();
                    prof.output();
                }
                else{
                    System.out.print(("Invalid Input!!!!"));
                }
                break; 
            default:
                System.out.print("Invalid Input!!!!");
        }
    }
}
    
     
    
