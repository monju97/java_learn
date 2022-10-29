import java.util.Scanner;

public class firstarray {
   public static void main(String[] args) {
        
    

    Scanner input=new Scanner(System.in);

    int [] first=new int[5];
    int avg,sum=0;
    int max=first[0],min=first[0];

    System.out.println("Please Enter Five Number ");

    for(int i=0;i<first.length;i++){
        first[i]=input.nextInt();
        
    }
    
    for(int i=0;i<first.length;i++){
        sum=sum+first[i];

    }
    for(int i=1;i<first.length;i++){

        if (max<first[i]) {
            max=first[i];                   
        
    } 
        if(min>first[i]){
            min=first[i];        

}
    }
        avg=sum/first.length;
                
        System.out.println("The result of sum is: " +sum);
        System.out.println("The result avg is: " +avg);
        System.out.println("The max number is: " +max);
        System.out.println("The min number is: " +min);

   }
}
