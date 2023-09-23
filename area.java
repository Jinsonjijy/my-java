import java.util.Scanner;

public class area {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("1 for sqaure\n 2 for cirlce \n 3 for rectangle \n4 for triangle");
        int a=sc.nextInt();
        if(a==1){
            System.out.println("enterr the side of the square");

            int b=sc.nextInt();
            int c =b*b;
            System.out.println("area = "+c);
        }
        else if (a==2){
            System.out.println("enter the radius of the circle");

            int r=sc.nextInt();
            int c=3.14*r*r;
            System.out.println("are of the circle is "+c);
        }
else if (a==3){
    System.out.println("enter the lenght and breadth of the rectsngle");
    int n=sc.nextInt();
    int m= sc.nextInt();
    int c =m*n;
    System.out.println("result is "+c);
}
else if(a==4){
    System.out.println("enter the base and height of the triangle");
    int n=sc.nextInt();
    int m=sc.nextInt();
    int c=(m*n)/2;
    System.out.println("result="+c);
}
else {
    System.out.println("invalid option");
}





    }
    
}
