import java.util.Scanner;

public class inputk {
    public static void main(String[] args){
      
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("enter the value");     
      
        int a=s.nextInt();
        int b=s.nextInt();
         int c=a+b;

        System.out.println("the entered values are");
        System.out.print(a+"        "+b);
        System.out.println("redult"+c);


        
        }
    }
    
}

