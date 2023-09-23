import java.util.Scanner;

public class simplecalc {
    public static void main(String[]  args){
        Scanner sc=new Scanner(System.in);
                 System.out.println("enter two number");
                 int a =sc.nextInt();
                 int b=sc.nextInt();
                 System.out.println("enter your choice for the calculation");
                 System.out.println(" 1for adiition \n 2 for substraction \n 3 for multiplication \n 4 for divisiion 5 for modulo");
                 int c= sc.nextInt();
                 if(c==1){
                    int d=a+b;
                    System.out.println("result ="+d);
                 }

                 else if(c==2){

                    int d=a-b;
                    System.out.println("result="+d);
                 }

                 else if(c==3){
                    int d=a*b;
                    System.out.println("result="+d);
                 }
                 else if(c==4){
                    int d=a/b;
                    System.out.println("result ="+d);
                 }


                 else if(c==5){
                    int d=a%b;
                    System.out.println("result"+d);
                 }
                 else{
                    System.out.println("invalid option");
                 }
                 
       

    }
    
}
