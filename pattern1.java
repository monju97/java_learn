import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("How Line You Want To See: ");
        int n=input.nextInt();

        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.print("\n ");
        }
        

    }

    
}
