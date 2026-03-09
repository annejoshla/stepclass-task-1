                                        //Level 1

//Write a program to find the age of Harry if the birth year is 2000. Assume the Current Year is 2024

import java.util.Scanner;

public class Stepweek1 {
    public static void main(String[] args) {
        int age;
        age = 2024 - 2000;
        System.out.println("Harry's age in 2024 is " + age);
    }

    
}

// 2. Sam’s mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100. Find the average percent mark in PCM



public class Stepweek1 {
    public static void main(String[] args) {
        int Maths = 94;
        int physics = 95;
        int chemistry = 96;
        int avg = (Maths + physics + chemistry)/3 ;
        System.out.println("Sam's average mark in PCM is " + avg);

    }
}

// 3. Create a program to convert the distance of 10.8 kilometers to miles.

public class Stepweek1 {
    public static void main(String[] args) {
        int km = 10.8 ;
        int miles = 10.8 * 1.6 ;
        System.out.println("The distance 10.8 km in miles is " + miles);
    }
}

                                         // Level 2

// 1. Basic Calculator



public class Stepweek1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a NUmber:");
        float num1 = sc.nextFloat;
        System.out.println("Enter a Number:");
        float num2 = sc.nextFloat;
        float add = num1 + num2 ;
        System.out.println("Addition:" + add);
        float sub = num1 - num2 ;
        System.out.println("Subraction:" + sub);
        float mul = num1 * num2 ;
        System.out.println("Multiplication" + mul);
        float div = num1 / num2 ;
        System.out.println("Diviiton:" + div);

        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers" + num1 + "and" + num2 + "is" + add + sub + mul + "and" + div) ;

    }
}


// 2. Area of the Triangle

public class Stepweek1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter hight in cm");
        int hight = sc.nextInt;
        System.out.println("Enter base in cm");
        int base = sc.nextInt;
        int area = 0.5 * hight * base ; 
        System.out.println("Area of the triangle " + area);
    
    }
}

                                    //Level 3

// 1. Celsius to Farenheit 


public class Stepweek1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter temperature in Celsius");
        float cel = sc.nextFloat;
        float faren =  (cel * 9/5) + 32 ;
        System.out.println("The" + cel + "celsius is" + faren + "fahrenheit");
    }
}












