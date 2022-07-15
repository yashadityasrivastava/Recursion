import java.util.Scanner;

public class Basic_Problems {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PrintName(1,n);
        PrintFirstN_Num(1,n);
        Print_N_to1(n);

    }

    public static void PrintName(int i,int n){
        if(i > n )
            return;
        System.out.println("Yash");
        PrintName(i+1,n);
    }

    public static  void PrintFirstN_Num(int i , int n){
        if(i > n)
            return;
        System.out.println(i);
        PrintFirstN_Num(i+1,n);
    }

    public  static void Print_N_to1(int n ){
        if(n == 0){
            return;
        }
        System.out.println(n);
        Print_N_to1(n-1);
    }

}
