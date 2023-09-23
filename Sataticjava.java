import java.util.Scanner;

public class Sataticjava {


   
    public static  void main(String ar[]){
try (Scanner sc = new Scanner(System.in)) {
    int a=10;
            System.out.println(a);
    
            int b= 10*a;
            System.out.println(b);
            System.out.println("enter two number");
    
            int c= sc.nextInt();
    
            int d=sc.nextInt();
     
    
            int p= c*d%b;
    
            System.out.println("the final result is"+p);
}
    }
}
