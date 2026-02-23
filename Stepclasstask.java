import java.util.Scanner;


                                        //LEVEL 1


// 1. Divisible by 5
public class Stepclasstask {
     public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 5 == 0){
            System.out.println("Divisible by 5");
        }
        else{
            System.out.println("Not Divisible by 5");
        }
    }

} 


// 2.Write a program to check if the first, second, or third number is the largest of the three.

    public class Stepclasstask {
        public static void main(String[] args) {
            System.out.println("Enter a number1");
            System.out.println("Enter a number2");
            System.out.println("Enter a numner3");
            Scanner scanner = new Scanner(System.in);
            int number1 = scanner.nextInt();
            int number2 = scanner.nextInt();
            int number3 = scanner.nextInt();
            if (number1 > number2) {
                if (number1 > number3) {
                    System.out.println("Number1 is Greater");
                } else if (number2 > number3) {
                    System.out.println("Number2 is Greater");
                } else {
                    System.out.println("Number3 is greater");
                }
            }
            
        }
    } 

// 3. Write a program to check whether a person can vote, depending on whether his/her age is greater than or equal to 18
       public class Stepclasstask {
            public static void main(String[] args) {
                System.out.println("Enter your age:");
                Scanner scanner = new Scanner(System.in);
                int age = scanner.nextInt();
                if (age <= 17) {
                    System.out.println("You cant vote");
                }else {
                    System.out.println("You can vote");
                }
            }
        } 



                                        // LEVEL 2

// 1. Create a program to find the multiplication table of a number entered by the user from 6 to 9

public class Stepclasstask {
    public static void main(String[] args) {
        System.out.println("Enter a number");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for(int i=6 ; i<=9 ; i++) {
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }
        
    }
}



// 2. Create a program to print odd and even numbers between 1 to the number entered by the user. 
public class Stepclasstask {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {

            if (i % 2 == 0) {
                System.out.println(i + " Even Number");
            } else {
                System.out.println(i + " Odd number");
            }

        }

        
    }

}


                                        //LEVEL 3


//1. Write a LeapYear program that takes a year as input and outputs the Year is a Leap Year or not a Leap Year. 


public class Stepclasstask {
    public static void main(String[] args) {
        System.out.println("Enter a year:");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        if (year >= 1582) {
            if (year % 400 == 0) {
            System.out.println("Leap year");
        } else if (year % 100 == 0) {
            System.out.println(("Not a Leap year"));
        } else if (year % 4 == 0){
            System.out.println("Leap year");

        }

    } else {
        System.out.println("The LeapYear program only works for year >= 1582, corresponding to a year in the Gregorian calendar");
    }
}
}
