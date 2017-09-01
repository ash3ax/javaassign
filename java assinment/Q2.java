import java.util.*;
class Q2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,nos,max,count = 0;
        System.out.println("Enter Number of Elements to be Entered");
        n = sc.nextInt();
        System.out.println("Enter "+n+" Numbers");
        nos = sc.nextInt();
        max = nos;
        count++;
        do
        {
            nos = sc.nextInt();
            if(max<nos)
            {
                max = nos;
            }
        }while(++count<=n);
        System.out.println("Max = "+max);
    }
}