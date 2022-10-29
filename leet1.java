import java.util.Scanner;

public class leet1{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter any positive Digit= ");
        int x=input.nextInt();
        int tmp=x;
        int sum=0,r;
        boolean a=true;
        while(tmp!=0){
            r=tmp%10;
            sum=sum*10+r;
            tmp=tmp/10;
            
        }
        
        if(x==sum){
          a=true;
           


        }else{
            a= false ;
            
        }
        
    System.out.print(a);
    
    }
   
}
