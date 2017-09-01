import java.util.*;
class Problem3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,count=1,i,j,k,temp=0;
        System.out.println("Enter Range (i,j)");
        j = sc.nextInt();
        k = sc.nextInt();
        for(i=j;i<=k;i++)
        {
            n=i;
            while(n!=1)
            {
                if(n%2==0)
                {
                    n=n/2;
                }
                else
                {
                    n=3*n+1;
                }
                count++;
            }
            if(temp<count)
            temp = count;
            count = 1;
        }
        System.out.println(j+" "+k+" "+temp);
    }
}