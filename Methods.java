import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;


public class Methods {
    public static void main(String[] args) {
        myMethod("Naresh");
        myMethod("Suresh");
        myMethod("Divya");
         plusMethod(3, 5);
         System.out.println(plusMethod(3.5, 5));
         int res = sum(5);
         System.out.println(res);

        Methods myObj = new Methods();
        System.out.println(myObj);

        hello myObj1 = new hello();
        System.out.println(myObj1.x);

        Scanner myScn = new Scanner(System.in);
        System.out.println("Enter name age and salary");

        // String name = myScn.nextLine();
        // int age = myScn.nextInt();
        // double sal = myScn.nextDouble();

        // System.out.println(name);
        // System.out.println(age);
        // System.out.println(sal);

        LocalDate myD = LocalDate.now();
        LocalTime myT = LocalTime.now();
        LocalDateTime myDT = LocalDateTime.now();
        System.out.println(myD);
        System.out.println(myT);
        System.out.println(myDT);




    }

    static void myMethod(String fname){
        System.out.println(fname);

    }

    static int plusMethod(double x, int y){
        return (int) x + y ;
    }

    static double plusMethod(double x , double y){
        return x + y ;
    }

    // Method Overloading 
    // multiple methods can have the same name with diff parameter


    // Recursion //

    public static int sum(int k){
        if (k >10){
            return 0 ;
        }
        else{
            return k + sum(k+1);
        }
    }

    // Classes and Objects 

    
}
