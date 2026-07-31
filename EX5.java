
import java.util.*;
interface initial{
    void add(double a,double b);
    void sub(double a,double b);
    void div(double a,double b);
    void mul(double a,double b);
}
class Calculator implements initial{
    public void add(double a,double b){
        System.out.print("Addition of A + B : "+(a+b));
        
    }
    public void sub(double a,double b){
        System.out.print("Subraction of A - B : "+(a-b));
        
    }
    public void mul(double a,double b){
        System.out.print("Multiplication of A * B : "+(a*b));
        
    }
    public void div(double a,double b){
        if (b!=0){
        System.out.print("Addition of A / B : "+(a/b));}
        else{
            System.out.print("Denominator Not to be Zero Error !!!!!");
        
    }

}}
public class EX5 {
    public static void main(String[] args) {
        do{
            System.out.println("\n--------Calculator--------");
            System.out.println("1 - Addition\n2 - Subraction\n3 - Multiplication\n4 - Division\n Emter Operation : ");
            Scanner scan=new Scanner(System.in);
            int ch=scan.nextInt();
            System.out.println("Enter A : ");
            double a1=scan.nextDouble();
            System.out.println("Enter B : ");
            double b1=scan.nextDouble();
            Calculator calci=new Calculator();
            switch(ch){
                case 1:
                    calci.add(a1,b1);
                    scan.nextLine();
                    break;
                case 2:
                    calci.sub(a1, b1);
                    scan.nextLine();
                    break;
                case 3:
                    calci.mul(a1,b1);
                    scan.nextLine();
                    break;
                case 4:
                    calci.div(a1, b1);
                    scan.nextLine();
                    break;
                default:
                    System.out.println("Wrong Input Error!!!");
                    scan.nextLine();
                    break;
            }
            scan.nextLine();
        }while(true);
    }
    
}
