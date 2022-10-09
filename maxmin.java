import java.util.Scanner;

import javax.print.event.PrintEvent;

class maxmin{

    public static void main(String[] args) {

    Scanner inp1=new Scanner(System.in);

    int a,b,max;
    System.out.print("Input two no ");
    a=inp1.nextInt();
    b=inp1.nextInt();
        max=(a>b)?a:b;
        System.out.print("max no "+max);

        
    }
}