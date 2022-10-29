import java.util.Scanner;
public class MtoNodd {
    
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);

        System.out.print("enter first  number: ");
        int m=input.nextInt();
        System.out.print("enter last  number: ");
        int n=input.nextInt();
        int sum=0,i;
for(i=m;i<=n;i++){
        if(i%2==0){
    sum=sum+i;
    System.out.print(i+" ");
    System.out.print("Sum of even number = "+sum);
    }
for(i=m;i<=n;i++){
    if(i%2!=0){
    sum=sum+i;
    System.out.print(i+" ");
    System.out.print("Sum of odd number = "+sum);

}
}
System.out.print("\nSum of  number = "+sum);
    

    }
    
    }

}

