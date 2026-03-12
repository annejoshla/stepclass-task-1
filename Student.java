import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        String[] array = new String[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        for (int i=0 ; i<array.length; i++){ 
           array[i] = sc.next();

        }
        for (int i = 0 ; i <array.length ; i++){
            System.out.println(array[i] + " ");
        }
        sc.close();
    }
        
}
    

