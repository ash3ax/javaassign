import java.util.*;
class Q3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int i,n,d,c=0,temp;
        for(i=0;i<=999;i++)
        {
            n = i;
            temp = i;
            while(temp>0)
            {
                d = temp%10;
                c = c+d*d*d;
                temp = temp/10;
            }
            if(c==n)
            {
                System.out.println(n);
            }
            c = 0;            
        }
    }    
}