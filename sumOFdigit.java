import java.util.Scanner;

public class sumOFdigit {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter any positive Digit= ");
        int m=input.nextInt();
        int tmp=m;
        int sum=0,r;
        while(tmp!=0){
            r=tmp%10;
            sum=sum+r;
            tmp=tmp/10;

        }
        System.out.print("result= "+sum);
    }
}
/*
supose m=546
tmp=m-546

10|546|54   here tmp=54 when (tmp=tmp/10)
   540
   ----
      6     here r=6 when(r=tmp%10)

10|54|5     here tmp=5 when (tmp=tmp/10)
   50
-------- 
    4       here r=5 when(r=tmp%10)




 * 10
 */