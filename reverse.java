import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter any positive Digit= ");
        int m=input.nextInt();
        int tmp=m;
        int sum=0,r;
        while(tmp!=0){
            r=tmp%10;
            sum=sum*10+r;
            tmp=tmp/10;

        }
        System.out.println("Reverse no= "+sum);

        if(m==sum){
            System.out.print("Palindrome");


        }else{
            System.out.print("Not Palindrome");
        }
 
    }
}
