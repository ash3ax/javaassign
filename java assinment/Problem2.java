import java.util.*;
class Problem2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        float c,sum=0;
        String res="";
        System.out.println("Enter Test Case(s)");
        while((c=sc.nextFloat())!=0)
        {
            n=1;
            while(sum<=c)
            {
                sum = sum + (float)1/(++n);
            }
            res+=(n-1)+" card(s)\n";
            sum=0;
        }
        System.out.println(res);
    }
}