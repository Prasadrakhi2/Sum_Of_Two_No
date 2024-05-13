import java.util.*;
class use_define{

    public static int sum(int a, int b){
        return a+b;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // int a = 10;
        // int b = 2;
        // System.out.println(a+b);

        System.out.println("enter the value of a and b=");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("sum=" + sum(a,b));

    }
}