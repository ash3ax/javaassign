import java.util.*;
class Q4
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String cset = "1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./";
        String str,decode="";
        System.out.println("Enter String");
        str = sc.nextLine();
        int i;
        for(i=0;i<str.length();i++)
        {
            char x = str.charAt(i);
            if(x!=' ')
            {
                decode += cset.charAt(cset.indexOf(x)-1);
            }
            else
            {
                decode += " ";
            }
        }
        System.out.println("Decoded String : "+decode);
    }
}