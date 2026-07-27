package ex2;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author 25ucs114
 */
public class EX2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> cities= new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int choice;
        String city;
        do{
        System.out.println("\n\n1-Append \n2- Insert \n3- Search \n4- Display cities with Starting Letter \n5- Display all Citites\n6- Exit \n Choose the choice : ");
        
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    
                    System.out.println("Enter the City : ");
                    sc.nextLine();
                    city= sc.nextLine();
                    cities.add(city);
                    System.out.println(city +" is added.");
                    sc.nextLine();
                    break;
                case 2:
                    
                    System.out.println("Enter the Index : ");
                    int index=sc.nextInt();
                    if (index>=0 && index<cities.size()){
                        System.out.println("Enter the city : \n");
                        sc.nextLine();
                        city= sc.nextLine();
                        cities.add(index, city);
                        System.out.print(city + " inserted Succesfully");
                        
                    }
                    else{
                        System.out.print("   Index Invalid !!!!");
                    }
                    sc.nextLine();
                    break;
                case 3:
                    
                    System.out.println("Enter the city to search : ");
                    sc.nextLine();
                    city =sc.nextLine();
                    

                    if (cities.contains(city)){
                        System.out.println(city+" is found in the Array");
                    }
                    else{
                        System.out.println(city+" not Found");
                    }
                    sc.nextLine();
                    break;
                case 4:
                    
                    System.out.println("Enter the first character : \n");
                    sc.nextLine();
                    char ch=sc.next().charAt(0);
                    

                    boolean found=false;
                    for (String c: cities){
                        if(c.toLowerCase().startsWith(String.valueOf(ch).toLowerCase())){
                            System.out.println(c);
                            found=true;
                        }
                    
                    }
                    if(!found){
                        System.out.println("No city starts with   '"+ch+"'");
                    }
                    sc.nextLine();
                    break;
                case 5:
                    if (cities.isEmpty()){
                        System.out.println("No Cities Available");
                        
                    }
                    else{
                        System.out.println("All Cities : "+cities);
                    }
                    sc.nextLine();
                    break;
            }
        }while (choice!=6);
      
    }
    
}
