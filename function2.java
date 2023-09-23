import java.util.Scanner;

public class function2 {
   public static void main(String[] args) {

   Scanner sc=new Scanner(System.in);

    System.out.println("enter two number");
    

    int a= sc .nextInt();
    int b=sc .nextInt();

     int res=multi( a,b); 
     System.out.println("result"+res);


   }

   static int multi(int v, int k){
    int c =v*k/2;
    return c;
   }
}
