import java.util.*;
class Q1
{
    public static void main(String args[])
    {
        int n,sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        n = sc.nextInt();
        sum = n*(n+1)/2;
        System.out.println(sum);
    }
}