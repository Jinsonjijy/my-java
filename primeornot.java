import java.util.Scanner;

public class primeornot {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
      int count=0;
        int n=sc .nextInt();
        for(int i=1;  i <n; i++ ){
            if( n % i==0){
                count++;
            }

        }
        if (count==2){
            System.out.println("the number is prime");
        }
        else{
            System.out.println("the number is not prime");
        }
    }
    
}
