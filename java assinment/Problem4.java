import java.util.*;
class Problem4
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t,i;
        double avg,tot,neg,pos;
        do
        {
            System.out.println("Enter Number of Students");
            t = sc.nextInt();
            avg = 0;
            neg = pos = 0;
            if(t==0)
            {
                break;
            }
            double inr[] = new double[t];
            for(i=0;i<t;i++)
            {
                inr[i] = sc.nextDouble();
                avg += inr[i];
            }
            avg /= t;
            for(i=0;i<t;i++)
            {
                if(inr[i]<avg)
                {
                    neg += avg-inr[i];
                }
                else
                {
                    pos += inr[i]-avg;
                }
            }
            tot = pos<neg?pos:neg;
            String res = ""+tot;
            res = res.substring(0,res.indexOf('.')+3);
            System.out.println(res);
        }while(t!=0);
    }
}