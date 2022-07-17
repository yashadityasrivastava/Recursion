import java.util.Scanner;

public class Basic_Problems {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PrintName(1,n);
        PrintFirstN_Num(1,n);
        PrintFirstN(n);
        Print_N_to1(n);


    }

    //Print Name n times
    public static void PrintName(int i,int n){
        if(i > n )
            return;
        System.out.println("Yash");
        PrintName(i+1,n);
    }

    //Print first n numbers from 1 to n
    public static  void PrintFirstN_Num(int i , int n){
        if(i > n)
            return;
        System.out.println(i);
        PrintFirstN_Num(i+1,n);
    }

    //Print first n numbers from 1 to n
    public static void PrintFirstN(int n ){
        if( n < 1)
            return ;
        PrintFirstN(n-1);
        System.out.println(n);
    }

    //Print N to 1
    public  static void Print_N_to1(int n ){
        if(n == 0){
            return;
        }
        System.out.println(n);
        Print_N_to1(n-1);
    }



}
