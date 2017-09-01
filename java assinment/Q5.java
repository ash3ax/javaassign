import java.util.*;
class Q5
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t,r,i,median,min=0,count=0;
        System.out.println("Enter Number of Test Cases");
        t = sc.nextInt();
        int res[] = new int[t];
        for(i=1;i<=t;i++)
        {
            r = sc.nextInt(); 
            int s[] = new int[r];
            for(int j=0;j<r;j++)
            {
                s[j]=sc.nextInt();
            }
            Arrays.sort(s);
            if(s.length%2==0)
            {
                median=Math.round((s[(r-1)/2] + s[(r+1)/2])/2);
            }
            else
            {
                median=s[(r-1)/2];
            }
            for(int j=0;j<r;j++)
            {
                min = min + Math.abs(median-s[j]);
            }
            res[count++]=min;
            min=0;
        }
        for(i=0;i<count;i++)
        {
            System.out.println(res[i]);
        }
    }
}