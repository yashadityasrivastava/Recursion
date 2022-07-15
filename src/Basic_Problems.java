import java.util.Scanner;

public class Basic_Problems {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PrintName(1,n);

    }

    public static void PrintName(int i,int n){
        if(i > n )
            return;
        System.out.println("Yash");
        PrintName(i+1,n);
    }

}
