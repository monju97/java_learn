import java.util.Scanner;

public class sumMtoN {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int m=input.nextInt();
        System.out.print("\nEnter Last Number: ");
        int n=input.nextInt();
        int sum=0;
        for(int i=m;i<=n;i++){

            sum=sum+i;
           System.out.print(i+" ");
           
        }
        System.out.println("\n" +sum);

    }
}
