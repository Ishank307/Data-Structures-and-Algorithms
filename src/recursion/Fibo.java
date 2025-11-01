package recursion;

import java.util.Scanner;

public class Fibo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            int a=sc.nextInt();
            System.out.println(fibo(a));
        }
    }

    private static int fibo(int n){
        if(n<2) return n;
        return fibo(n-1)+fibo(n-2);

    }
}
