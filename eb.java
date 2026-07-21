package javaapplication4;

import java.util.*;

public class JavaApplication4 {

    int con_no, p_read = 0, c_read;
    String con_name, connection;

    void input() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Consumer No: ");
        con_no = scan.nextInt();

        System.out.print("Current Reading: ");
        c_read = scan.nextInt();

        System.out.print("Connection Type (domestic/commercial): ");
        connection = scan.next();
    }

    double calculate_bill() {

        int unit = c_read;
        double bill = 0.0;

        if (connection.equals("domestic")) {

            if (unit <= 100) {
                bill = 0;
            } else if (unit <= 200) {
                bill = (unit - 100) * 2;
            } else if (unit <= 500) {
                bill = 200 + (unit - 200) * 4;
            } else {
                bill = 1400 + (unit - 500) * 6;
            }

        } else if (connection.equals("commercial")) {

            if (unit <= 100) {
                bill = unit * 2;
            } else if (unit <= 200) {
                bill = 200 + (unit - 100) * 4;
            } else if (unit <= 500) {
                bill = 600 + (unit - 200) * 6;
            } else {
                bill = 2400 + (unit - 500) * 7;
            }
        }

        return bill;
    }

    public static void main(String[] args) {

        JavaApplication4 ne = new JavaApplication4();

        ne.input();

        double amount = ne.calculate_bill();

        System.out.println("Consumer No : " + ne.con_no);
        System.out.println("Amount Paid : " + amount);
    }
}