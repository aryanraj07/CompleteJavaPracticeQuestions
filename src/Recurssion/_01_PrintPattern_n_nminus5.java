package Recurssion;

public class _01_PrintPattern_n_nminus5 {
    public static void printPattern(int n)
    {
        if(n<=0)
        {
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        printPattern(n-5);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int n=16;
        printPattern(n);
    }
        }
