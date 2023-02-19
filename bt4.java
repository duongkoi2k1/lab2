package bt4;


import java.util.Scanner;

public class bt4
{
    public static void menu ()
    {
       System.out.println("b1");
       System.out.println("b2");
       System.out.println("b3");
       Scanner sc = new Scanner(System.in);
       int chon = sc.nextInt();
       switch(chon)
       {
           case 1: bt1.ptb1();
           break;
           case 2: b2.ptb2();
           break;
           case 3: b3.tinhtiendien();
           break;
           case 4: break;
           default:  
               System.out.println("nhap sai ");
       }
    }
     public static void main(String[] arg)
   {
       menu();
   }
}
