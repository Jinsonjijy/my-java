import java.util.Scanner;

public class functionsample {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("enter two number");
        int num= sc.nextInt();
        int num1= sc.nextInt();
        int result= sum(num ,num1);
        System.out.println("result"+result);

    }
    static int sum(int a, int b){
        int s= a+b;
        return s;
    }
}
  