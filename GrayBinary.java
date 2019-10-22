import java.util.*;
class GrayBinary
{
   static String bc="";
   static String gray="";
   public static void main(String args[])
   {
       String gc;
       Scanner in=new Scanner(System.in);
       System.out.println("INPUT:");
       System.out.println("Enter gray code:");
       gc=in.nextLine();
       bc=bc+gc.charAt(0);
       int n=gc.length();
       gray_to_bin(gc,n);
       System.out.println("OUTPUT:");
       System.out.print("Equivalent binary code:");
       System.out.println(bc);
       bc="";
       System.out.println("____________________________");
       System.out.println("Enter a binary code:");
       bc=in.nextLine();
       gray=gray+bc.charAt(0);
       n=bc.length();
       bin_to_gray(0,n);
       System.out.print("Equivalent gray code:");
       System.out.println(gray);
    }
    public static void gray_to_bin(String gc,int n)
    {
        
        int a=0,b=0,ch=0;
        if(n==1)
        return;
        else
        {
            a=gc.charAt(0)-48;
            b=gc.charAt(1)-48;
            ch=a^b;
            bc=bc+ch;
            gc=ch+gc.substring(2,n);
            n=gc.length();
          
           gray_to_bin(gc,n);
        }
    }
    public static void bin_to_gray(int i,int n)
    {
        
        int a=0,b=0,ch=0;
        if(i>n-2)
        return;
        else
        {
            a=bc.charAt(i)-48;
            b=bc.charAt(i+1)-48;
            ch=a^b;
            gray=gray+ch;
            bin_to_gray(i+1,n);
        }
    }
}
/* OUTPUT

INPUT:
Enter gray code:
0100
OUTPUT:
Equivalent binary code:0111
____________________________
Enter a binary code:
1110
Equivalent gray code:1001

 */
            
            
            
        
       